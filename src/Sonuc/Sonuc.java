package Sonuc;

import java.sql.SQLException;

import Kesintiler.SgkKesinti;
import Kesintiler.VergiKesinti;
import SosyalYardimlar.HesapIslem;

public class Sonuc {
	SgkKesinti sgkKesinti;
	VergiKesinti vergiKesinti;
	HesapIslem hesapIslem; 
	
	
	public Sonuc(SgkKesinti sgkKesinti, VergiKesinti vergiKesinti, HesapIslem hesapIslem) {
		this.sgkKesinti = sgkKesinti;
		this.vergiKesinti = vergiKesinti;
		this.hesapIslem=hesapIslem;
	} 
	
	public double KesintiMiktari() throws ClassNotFoundException, SQLException {
		return sgkKesinti.Sgk1()+sgkKesinti.Sgk14()+sgkKesinti.Sgk2()+sgkKesinti.Sgk20()+vergiKesinti.GelirVergisi()+hesapIslem.DamgaVergisi();
	}
	
	public double Tahakkuk () throws ClassNotFoundException, SQLException {
		return hesapIslem.HakedisToplami()+sgkKesinti.Sgk20()+sgkKesinti.Sgk2();
	}
	
	public double NetOdenen() throws ClassNotFoundException, SQLException {
		return Tahakkuk()-KesintiMiktari(); 
	}
}
