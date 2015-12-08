package br.gov.pb.procon.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.pb.procon.jdbc.ConnectionFactory;
import br.gov.pb.procon.model.Consumidor;
import br.gov.pb.procon.model.Usuario;

import com.mysql.jdbc.PreparedStatement;

public class UsuarioDAO {
	private Connection connection;

	/**
	 * Constructor
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public UsuarioDAO() throws ClassNotFoundException, SQLException {
		this.connection = new ConnectionFactory().getConnection();

	}
	
	public boolean isExiste(Usuario usuario)  {
		boolean saved = false;
		String sql = "select cn_nome from consumidor where cn_nome=?";
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				saved = true;
			}				
			rs.close();
			stmt.close();
			
			return saved;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
