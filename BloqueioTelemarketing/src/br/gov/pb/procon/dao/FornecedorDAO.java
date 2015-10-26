package br.gov.pb.procon.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import br.gov.pb.procon.jdbc.ConnectionFactory;
import br.gov.pb.procon.model.Fornecedor;

import com.mysql.jdbc.PreparedStatement;

public class FornecedorDAO {
	private Connection connection;

	/**
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public FornecedorDAO() throws SQLException, ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Fornecedor fornecedor) throws SQLException, UnknownHostException {
		try {
			String sql = "INSERT INTO fornecedor" +
					"(fn_razao_social, fn_cnpj, fn_email, fn_telb4, fn_ativo, fn_lastip, fn_lastlogin)" +
					" VALUES (?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, fornecedor.getFn_razao_social());
			stmt.setString(2, fornecedor.getFn_cnpj());
			stmt.setString(3, fornecedor.getFn_email());
			stmt.setString(4, fornecedor.getFn_telb4());
			stmt.setInt(5, fornecedor.getFn_ativo());
			stmt.setString(6, InetAddress.getLocalHost().getHostAddress());
			stmt.setDate(7, new Date(fornecedor.getFn_lastlogin().getTimeInMillis()));

			// executa
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
