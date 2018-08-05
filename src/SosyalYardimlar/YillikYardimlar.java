package SosyalYardimlar;

import java.sql.SQLException;

import Database.Sorgular;

public class YillikYardimlar {
	boolean bayramYardimi;

	Sorgular sorgu=new Sorgular();
	
	public YillikYardimlar(boolean bayramYardimi) {
		this.bayramYardimi = bayramYardimi;
	} 
	
	public double BayramYardimi() throws ClassNotFoundException, SQLException {
		if (bayramYardimi) {
			return sorgu.ozellikGetir("Sabitler", "bayramyardimtutar");					
		}
		return 0; 
	}
	
}
