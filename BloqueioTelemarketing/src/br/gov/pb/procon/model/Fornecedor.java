package br.gov.pb.procon.model;

import java.util.Calendar;

public class Fornecedor {
	private long fn_id;
	private String fn_razao_social;
	private String fn_cnpj;
	private String fn_email;
	private String fn_telb4;
	private int fn_ativo;
	private String fn_lastip;
	private Calendar fn_lastlogin;

	public long getFn_id() {
		return fn_id;
	}

	public void setFn_id(long fn_id) {
		this.fn_id = fn_id;
	}

	public String getFn_razao_social() {
		return fn_razao_social;
	}

	public void setFn_razao_social(String fn_razao_social) {
		this.fn_razao_social = fn_razao_social;
	}

	public String getFn_cnpj() {
		return fn_cnpj;
	}

	public void setFn_cnpj(String fn_cnpj) {
		this.fn_cnpj = fn_cnpj;
	}

	public String getFn_email() {
		return fn_email;
	}

	public void setFn_email(String fn_email) {
		this.fn_email = fn_email;
	}

	public String getFn_telb4() {
		return fn_telb4;
	}

	public void setFn_telb4(String fn_telb4) {
		this.fn_telb4 = fn_telb4;
	}

	public int getFn_ativo() {
		return fn_ativo;
	}

	public void setFn_ativo(int fn_ativo) {
		this.fn_ativo = fn_ativo;
	}

	public String getFn_lastip() {
		return fn_lastip;
	}

	public void setFn_lastip(String fn_lastip) {
		this.fn_lastip = fn_lastip;
	}

	public Calendar getFn_lastlogin() {
		return fn_lastlogin;
	}

	public void setFn_lastlogin(Calendar fn_lastlogin) {
		this.fn_lastlogin = fn_lastlogin;
	}

}
