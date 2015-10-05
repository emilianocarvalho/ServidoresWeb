package br.com.estacio.client;

import org.w3c.dom.NodeList;

public class Pessoa {
	private String nome;
	private Double peso;
	private Double altura;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	
	public void listaPessoas(NodeList listaPessoas) {
		
	}
	
	public Integer countPessoas(NodeList listaPessoas) {
		return listaPessoas.getLength();
	}

}
