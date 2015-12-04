package br.gov.pb.procon.model;

public class Formulario {
	private String denominacao;
	private String rua;
	private String numero;
	private String bairro;
	private String cep;
	private String municipio;
	private UF estado;
	private String telefone;

	public Formulario(String denominacao, String rua, String numero,
			String bairro, String cep, String municipio, UF estado,
			String telefone) {
		this.denominacao = denominacao;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.municipio = municipio;
		this.estado = estado;
		this.telefone = telefone;
	}
	
	public enum UF {
		PB, PE, RN, CE, AL, SE;
	}
	
	public String toString() {
		return this.denominacao + " - " + this.rua;
	}
}
