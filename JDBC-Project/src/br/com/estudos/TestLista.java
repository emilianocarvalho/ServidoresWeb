package br.com.estudos;

import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.jdbc.dao.ConsumidorDAO;
import br.com.modelo.Consumidor;

public class TestLista {

	public static void printList() {
		ConsumidorDAO dao = new ConsumidorDAO();
		List<Consumidor> consumidores = dao.getLista();

		for (Consumidor consumidor : consumidores) {
			System.out.println("ID: " + consumidor.getCn_id());
			System.out.println("Nome: " + consumidor.getCn_nome());
			System.out.println("Email: " + consumidor.getCn_email());
			System.out.println("TelBlock1: " + consumidor.getCn_telb1());
			System.out.println("TelBlock2: " + consumidor.getCn_telb2());
			System.out.println("TelBlock3: " + consumidor.getCn_telb3());
			System.out.println("Last IP: " + consumidor.getCn_lastip());
			System.out.println("LastLogin: " + consumidor.getCn_lastlogin().getTime() + "\n");
		}
		System.out.println("Consumidor id: " + consumidores.get(0).getCn_id());
		System.out.println("--------------------");
	}
	
	public static void main(String[] args) throws UnknownHostException, SQLException {

		printList();
		
		Consumidor consumidor = new Consumidor();
		consumidor.setCn_nome("Roberto Carlos");
		consumidor.setCn_email("robertocarlos@gmail.com");
		consumidor.setCn_telb1("83 99201-0022");
		consumidor.setCn_telb2("83 99201-0022");
		consumidor.setCn_telb3("83 99201-0022");
		consumidor.setCn_bltmk(1);
		consumidor.setCn_lastlogin(Calendar.getInstance());

		ConsumidorDAO dao = new ConsumidorDAO();
		dao.adiciona(consumidor);
		
		printList();
		
		consumidor.setCn_nome("Robert Carl");
		dao.altera(consumidor);
		
		printList();

	}

}
