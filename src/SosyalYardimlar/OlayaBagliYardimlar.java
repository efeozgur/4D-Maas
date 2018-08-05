package SosyalYardimlar;

import java.sql.SQLException;

import Database.Sorgular;

public class OlayaBagliYardimlar {
	boolean evlenmeYardimi, askerlikYardimi;

	Sorgular sorgu = new Sorgular();
	
	public OlayaBagliYardimlar(boolean evlenmeYardimi, boolean askerlikYardimi) {
		this.evlenmeYardimi = evlenmeYardimi;
		this.askerlikYardimi = askerlikYardimi;
	}
	
	public double EvlenmeYardimi() throws ClassNotFoundException, SQLException {
		if (evlenmeYardimi) {
			return sorgu.ozellikGetir("Sabitler", "evlilikyardimtutar");
		}
		return 0; 
	}
	
	public double AskerlikYardimi() throws ClassNotFoundException, SQLException {
		if (askerlikYardimi) {
			return sorgu.ozellikGetir("Sabitler", "askerlikyardimtutar"); 
		}
		return 0; 
	}
}
