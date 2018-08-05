package Kesintiler;

import java.sql.SQLException;

import Database.Sorgular;
import Kisi.AGILERIMIZ;
import SosyalYardimlar.AylikYardimlar;

public class VergiKesinti  {
	AylikYardimlar aylikYardimlar;
	SgkKesinti sgkKesinti;
	int gvOran,a; 
	AGILERIMIZ agi; 
	
	Sorgular sorgu=new Sorgular();
	
	public double Agi() throws ClassNotFoundException, SQLException {
		if (a==1) {
			return sorgu.ozellikGetir("agi", "bekar");
		}
		if (a==2) {
			return sorgu.ozellikGetir("agi", "evli_esi_calismayan");
		}
		if (a==3) {
			return sorgu.ozellikGetir("agi", "evli_esi_calismayan_1_cocuklu");
		}
		if (a==4) {
			return sorgu.ozellikGetir("agi", "evli_esi_calismayan_2_cocuklu");
		}
		if (a==5) {
			return sorgu.ozellikGetir("agi", "evli_esi_calismayan_3_cocuklu");
		}
		if (a==6) {
			return sorgu.ozellikGetir("agi", "evli_esi_calismayan_4_cocuklu");
		}
		if (a==7) {
			return sorgu.ozellikGetir("agi", "evli_esi_calismayan_5_cocuklu");
		}
		if (a==8) {
			return sorgu.ozellikGetir("agi", "evli_esi_calisan");
		}
		if (a==9) {
			return sorgu.ozellikGetir("agi", "evli_esi_calisan_1_cocuklu");
		}
		if (a==10) {
			return sorgu.ozellikGetir("agi", "evli_esi_calisan_2_cocuklu");
		}
		if (a==11) {
			return sorgu.ozellikGetir("agi", "evli_esi_calisan_3_cocuklu");
		}
		if (a==12) {
			return sorgu.ozellikGetir("agi", "evli_esi_calisan_4_cocuklu");
		}
		if (a==13) {
			return sorgu.ozellikGetir("agi", "evli_esi_calisan_5_cocuklu");
		}
		return 0; 
	}
	
	
	
	public VergiKesinti(AylikYardimlar aylikYardimlar, SgkKesinti sgkKesinti, int gvOran,  AGILERIMIZ agi) {
		
		this.aylikYardimlar = aylikYardimlar;
		this.sgkKesinti = sgkKesinti;
		this.gvOran = gvOran;
		
		this.agi=agi; 
	}
	
	public double GelirVergisiMatrah() throws ClassNotFoundException, SQLException {
		return aylikYardimlar.AsgariUcret() - (sgkKesinti.Sgk14()+sgkKesinti.Sgk1());
	}

	public double GelirVergisi() throws ClassNotFoundException, SQLException {
		return GelirVergisiMatrah()*gvOran/100-agi.getDeger();
	}
	
}
