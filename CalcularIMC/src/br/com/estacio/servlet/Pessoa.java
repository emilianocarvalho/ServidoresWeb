package br.com.estacio.servlet;

public class Pessoa {
	private String nome;
	private Double peso;
	private Double altura;
	
	private Double IMC;

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

	public Double getIMC() {
		return IMC;
	}

	public void setIMC(Double iMC) {
		IMC = iMC;
	}
}
