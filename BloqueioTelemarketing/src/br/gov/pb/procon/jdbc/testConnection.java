package br.gov.pb.procon.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.gov.pb.procon.jdbc.*;

public class testConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();


	}

}
