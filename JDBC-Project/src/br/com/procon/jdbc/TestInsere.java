package br.com.procon.jdbc;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Random;

import br.com.procon.jdbc.dao.ConsumidorDAO;
import br.com.procon.model.Consumidor;

public class TestInsere {

	public static void main(String[] args) throws SQLException, UnknownHostException {
		Consumidor consumidor = new Consumidor();
		consumidor.setCn_nome("Emiliano Carvalho");
		consumidor.setCn_email("emilianocarvalho@email.com");
		consumidor.setCn_telb1("83 99693-3678");
		consumidor.setCn_telb2("83 99693-3678");
		consumidor.setCn_telb3("83 99693-3678");
		consumidor.setCn_telb4("");
		consumidor.setCn_bltmk(0);
		consumidor.setCn_lastip(InetAddress.getLocalHost().getHostAddress());		
		consumidor.setCn_lastlogin(Calendar.getInstance());

		ConsumidorDAO dao = new ConsumidorDAO();
		dao.adiciona(consumidor);
		System.out.println("Gravado!");
	}

}
