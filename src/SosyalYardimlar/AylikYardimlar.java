package SosyalYardimlar;

import java.sql.SQLException;

import Database.Sorgular;

public class AylikYardimlar  {
	int cocukSayisi, yemekVerilecekGun; // ,yolYardimi,yakacakYardimi,direksiyonPrimi, bulasiciHastalikRiskPrimi,
	// silahTazminati;

	Sorgular sorgu = new Sorgular();

	public double AsgariUcret() throws ClassNotFoundException, SQLException {
		return (sorgu.ozellikGetir("Sabitler", "brutucret") * sorgu.ozellikGetir("sabitler", "zamorani")/100)+sorgu.ozellikGetir("sabitler", "brutucret");
	}
	
	public AylikYardimlar(int cocukSayisi, int yemekVerilecekGun) {
		this.cocukSayisi = cocukSayisi;
		this.yemekVerilecekGun = yemekVerilecekGun;
	}

	public double yakacakYardimi() throws ClassNotFoundException, SQLException {

		double gelen = sorgu.ozellikGetir("Sabitler", "yakacakyardimtutar");
		return gelen;

	}

	public double cocukYardimi() throws ClassNotFoundException, SQLException {
		if (cocukSayisi > 3) {
			return sorgu.ozellikGetir("sabitler", "cocukyardimtutar") * 3;
		}
		return cocukSayisi * sorgu.ozellikGetir("sabitler", "cocukyardimtutar");
	}

	public double yemekYardimi() throws ClassNotFoundException, SQLException {
		return yemekVerilecekGun * sorgu.ozellikGetir("sabitler", "yemekyardimtutar");
	}

}
