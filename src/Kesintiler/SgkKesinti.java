package Kesintiler;

import java.sql.SQLException;

import Database.Sorgular;
import SosyalYardimlar.AylikYardimlar;
import SosyalYardimlar.OlayaBagliYardimlar;
import SosyalYardimlar.YillikYardimlar;

public class SgkKesinti {

	AylikYardimlar aylikYardimlar; 
	YillikYardimlar yillikYardimlar;
	OlayaBagliYardimlar olayaBagliYardimlar;
	Sorgular sorgu = new Sorgular();
	
	public SgkKesinti(AylikYardimlar aylikYardimlar, YillikYardimlar yillikYardimlar,
			OlayaBagliYardimlar olayaBagliYardimlar) {
		super();
		this.aylikYardimlar = aylikYardimlar;
		this.yillikYardimlar = yillikYardimlar;
		this.olayaBagliYardimlar = olayaBagliYardimlar;
	}


	public double SgkMatrah() throws ClassNotFoundException, SQLException {
		return  aylikYardimlar.AsgariUcret()+aylikYardimlar.yakacakYardimi()+aylikYardimlar.yemekYardimi()+yillikYardimlar.BayramYardimi()+olayaBagliYardimlar.AskerlikYardimi()+olayaBagliYardimlar.EvlenmeYardimi();
	}	
	public double Sgk20() throws ClassNotFoundException, SQLException {
		return SgkMatrah() * sorgu.ozellikGetir("sgksabitleri", "yuzde20") /100 ;
	}	
	public double Sgk14() throws ClassNotFoundException, SQLException {
		return SgkMatrah() * sorgu.ozellikGetir("sgksabitleri", "yuzde14") /100 ;
	}
	public double Sgk2() throws ClassNotFoundException, SQLException {
		return SgkMatrah() * sorgu.ozellikGetir("sgksabitleri", "yuzde2") /100 ;
	}
	public double Sgk1() throws ClassNotFoundException, SQLException {
		return SgkMatrah() * sorgu.ozellikGetir("sgksabitleri", "yuzde1") /100 ;
	}
}
