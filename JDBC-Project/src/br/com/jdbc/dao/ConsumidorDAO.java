package br.com.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import br.com.estudos.ConnectionFactory;
import br.com.modelo.Consumidor;

import com.mysql.jdbc.PreparedStatement;

public class ConsumidorDAO {
	private Connection connection;

	public ConsumidorDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Consumidor consumidor) throws SQLException {
		try {
			String sql = "INSERT INTO consumidor" +
					"(cn_nome, cn_email, cn_telb1, cn_telb2, cn_telb3, cn_telb4, cn_bltmk, cn_lastip, cn_lastlogin)" +
					" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, consumidor.getCn_nome());
			stmt.setString(2, consumidor.getCn_email());
			stmt.setString(3, consumidor.getCn_telb1());
			stmt.setString(4, consumidor.getCn_telb2());
			stmt.setString(5, consumidor.getCn_telb3());
			stmt.setString(6, consumidor.getCn_telb4());
			stmt.setInt(7, consumidor.getCn_bltmk());
			stmt.setString(8, consumidor.getCn_lastip());		
			stmt.setDate(9, new Date(consumidor.getCn_lastlogin().getTimeInMillis()));

			// executa
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
