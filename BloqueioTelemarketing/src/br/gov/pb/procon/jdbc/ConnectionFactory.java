package br.gov.pb.procon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtmkt", "root", "inttecdb");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}