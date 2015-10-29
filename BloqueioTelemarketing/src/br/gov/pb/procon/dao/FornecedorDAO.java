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
import br.gov.pb.procon.model.Fornecedor;

import com.mysql.jdbc.PreparedStatement;

public class FornecedorDAO {
	private Connection connection;

	/**
	 * construct
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public FornecedorDAO() throws SQLException, ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}

	/**
	 * adiciona
	 * @param fornecedor
	 * @throws SQLException
	 * @throws UnknownHostException
	 */
	public void adiciona(Fornecedor fornecedor) throws SQLException, UnknownHostException {
		try {
			String sql = "INSERT INTO fornecedor " +
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

	/**
	 * lista
	 * @return
	 */
	public List<Fornecedor> getLista() {
		try {
			List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
			PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("select * from fornecedor");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.setFn_id(rs.getLong("fn_id"));
				fornecedor.setFn_razao_social(rs.getString("fn_razao_social"));
				fornecedor.setFn_cnpj(rs.getString("fn_cnpj"));
				fornecedor.setFn_email(rs.getString("fn_email"));
				fornecedor.setFn_telb4(rs.getString("fn_telb4"));
				fornecedor.setFn_ativo(rs.getInt("fn_ativo"));
				fornecedor.setFn_lastip(rs.getString("fn_lastip"));	

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("fn_lastlogin"));
				fornecedor.setFn_lastlogin(data);

				fornecedores.add(fornecedor);
			}
			rs.close();
			stmt.close();
			return fornecedores;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	

}
