package SosyalYardimlar;

import java.sql.SQLException;

import Database.Sorgular;

public class HesapIslem {
	AylikYardimlar aylikYardimlar;
	OlayaBagliYardimlar olayaBagliYardimlar;
	YillikYardimlar yillikYardimlar;
	Sorgular sorgu = new Sorgular();
	
	
	public HesapIslem(AylikYardimlar aylikYardimlar, OlayaBagliYardimlar olayaBagliYardimlar,
			YillikYardimlar yillikYardimlar) {
		this.aylikYardimlar = aylikYardimlar;
		this.olayaBagliYardimlar = olayaBagliYardimlar;
		this.yillikYardimlar = yillikYardimlar;
	}

	public double HakedisToplami() throws ClassNotFoundException, SQLException {
		return  aylikYardimlar.AsgariUcret()+ aylikYardimlar.cocukYardimi()+aylikYardimlar.yakacakYardimi()+aylikYardimlar.yemekYardimi()+yillikYardimlar.BayramYardimi()+olayaBagliYardimlar.AskerlikYardimi()+olayaBagliYardimlar.EvlenmeYardimi();
	}
	
	public double DamgaVergisi() throws ClassNotFoundException, SQLException {
		return HakedisToplami()*sorgu.ozellikGetir("sabitler", "damgavergisiorani");
	}
}
