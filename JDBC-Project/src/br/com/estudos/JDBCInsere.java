package br.com.estudos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;

import com.mysql.jdbc.PreparedStatement;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException  {
		/*
		 * try-with-resources
		 */
		try (Connection con = new ConnectionFactory().getConnection()) {
			String sql = "INSERT INTO consumidor" +
					"(cn_nome, cn_email, cn_telb1, cn_telb2, cn_telb3, cn_telb4, cn_bltmk, cn_lastip, cn_lastlogin)" +
					" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);

			stmt.setString(1, "Emiliano Carvalho");
			stmt.setString(2, "emiliano@email.com");
			stmt.setString(3, "83 99692-3678");
			stmt.setString(4, "83 99692-3678");
			stmt.setString(5, "83 99692-3678");
			stmt.setString(6, "");
			stmt.setInt(7, 0);
			stmt.setString(8, "192.168.0.1");		
			stmt.setDate(9, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));

			stmt.execute();
			stmt.close();

			System.out.println("Gravadoo!");

		} catch (SQLException e) {
			System.out.println(e);
		}		
	}
}
