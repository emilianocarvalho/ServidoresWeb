package br.gov.pb.procon.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.gov.pb.procon.jdbc.ConnectionFactory;
import br.gov.pb.procon.model.Consumidor;

import com.mysql.jdbc.PreparedStatement;

public class ConsumidorDAO {
	private Connection connection;

	/**
	 * factory DAO
	 * @throws ClassNotFoundException 
	 */
	public ConsumidorDAO() throws SQLException, ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}

	/**
	 * adiciona consumidor
	 * @param consumidor
	 * @throws SQLException
	 * @throws UnknownHostException
	 */
	public void adiciona(Consumidor consumidor) throws SQLException, UnknownHostException {
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
			stmt.setString(8, InetAddress.getLocalHost().getHostAddress());
			stmt.setDate(9, new Date(consumidor.getCn_lastlogin().getTimeInMillis()));

			// executa
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * getLista consumidores
	 * @return
	 */
	public List<Consumidor> getLista() {
		try {
			List<Consumidor> consumidores = new ArrayList<Consumidor>();
			PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("select * from consumidor");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Consumidor consumidor = new Consumidor();
				consumidor.setCn_id(rs.getLong("cn_id"));
				consumidor.setCn_nome(rs.getString("cn_nome"));
				consumidor.setCn_email(rs.getString("cn_email"));
				consumidor.setCn_telb1(rs.getString("cn_telb1"));
				consumidor.setCn_telb2(rs.getString("cn_telb2"));
				consumidor.setCn_telb3(rs.getString("cn_telb3"));
				consumidor.setCn_telb4(rs.getString("cn_telb4"));
				consumidor.setCn_bltmk(rs.getInt("cn_bltmk"));
				consumidor.setCn_lastip(rs.getString("cn_lastip"));	

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("cn_lastlogin"));
				consumidor.setCn_lastlogin(data);

				consumidores.add(consumidor);
			}
			rs.close();
			stmt.close();
			return consumidores;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * 
	 * @param consumidor
	 * @throws UnknownHostException
	 */
	public void altera(Consumidor consumidor) throws UnknownHostException {
		String sql = "update consumidor set cn_nome=?, cn_email=?, "+
				"cn_telb1=?, cn_telb2=?, cn_bltmk=?, cn_lastip=?, cn_lastlogin=? where cn_id=?";
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, consumidor.getCn_nome());
			stmt.setString(2, consumidor.getCn_email());
			stmt.setString(3, consumidor.getCn_telb1());
			stmt.setString(4, consumidor.getCn_telb2());
			stmt.setInt(5, consumidor.getCn_bltmk());
			stmt.setString(6, InetAddress.getLocalHost().getHostAddress());		
			stmt.setDate(7, new Date(consumidor.getCn_lastlogin().getTimeInMillis()));
			
			stmt.setLong(8, consumidor.getCn_id());	
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * remove consumidor
	 * @param consumidor
	 */
	public void remove(Consumidor consumidor) {
		String sql = "delete from consumidor where id=?";
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setLong(1, consumidor.getCn_id());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}