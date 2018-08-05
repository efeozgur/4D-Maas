package Database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConnection;

public class Data {
	SQLiteConnection connection;
	public SQLiteConnection Baglanti () throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		connection =(SQLiteConnection) DriverManager.getConnection("jdbc:sqlite:src/Database/db.sqlite");
		return connection;
	}
	
	public void Add() throws SQLException, ClassNotFoundException {
		Baglanti();
		String sql = "insert into kisiler (adsoyad)  values ('efe')";
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
		connection.close();		
	}
	
	
}
