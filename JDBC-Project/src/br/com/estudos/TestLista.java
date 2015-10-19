package br.com.estudos;

import java.util.List;

import br.com.jdbc.dao.ConsumidorDAO;
import br.com.modelo.Consumidor;

public class TestLista {

	public static void main(String[] args) {
		ConsumidorDAO dao = new ConsumidorDAO();
		List<Consumidor> consumidores = dao.getLista();

		for (Consumidor consumidor : consumidores) {
			System.out.println("ID: " + consumidor.getCn_id());
			System.out.println("Nome: " + consumidor.getCn_nome());
			System.out.println("Email: " + consumidor.getCn_email());
			System.out.println("TelBlock1: " + consumidor.getCn_telb1());
			System.out.println("TelBlock2: " + consumidor.getCn_telb2());
			System.out.println("TelBlock3: " + consumidor.getCn_telb3());
			System.out.println("LastLogin: " + consumidor.getCn_lastlogin().getTime() + "\n");
		}

	}

}
