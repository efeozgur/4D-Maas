package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Sorgular {
	Data data = new Data();
	Statement statement;
	
	
	public double ozellikGetir(String tabloAdi, String alanAdi) throws ClassNotFoundException, SQLException {
		data.Baglanti();
		String sql = "select * from "+tabloAdi+" where ID='1'";
		String gelenSonuc = null; 
		statement = data.connection.createStatement();
		ResultSet sonuc =  statement.executeQuery(sql);
		while(sonuc.next()) {
			gelenSonuc = sonuc.getString(alanAdi);
		}
		return Double.parseDouble(gelenSonuc);
	}
}
