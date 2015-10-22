package br.gov.pb.procon.model;

import java.util.Calendar;

public class Consumidor {
	private long cn_id;
	private String cn_nome;
	private String cn_email;
	private String cn_telb1;
	private String cn_telb2;
	private String cn_telb3;
	private String cn_telb4;
	private int cn_bltmk;
	private String cn_lastip;
	private Calendar cn_lastlogin;
	
	public long getCn_id() {
		return cn_id;
	}
	public void setCn_id(long cn_id) {
		this.cn_id = cn_id;
	}
	public String getCn_nome() {
		return cn_nome;
	}
	public void setCn_nome(String cn_nome) {
		this.cn_nome = cn_nome;
	}
	public String getCn_email() {
		return cn_email;
	}
	public void setCn_email(String cn_email) {
		this.cn_email = cn_email;
	}
	public String getCn_telb1() {
		return cn_telb1;
	}
	public void setCn_telb1(String cn_telb1) {
		this.cn_telb1 = cn_telb1;
	}
	public String getCn_telb2() {
		return cn_telb2;
	}
	public void setCn_telb2(String cn_telb2) {
		this.cn_telb2 = cn_telb2;
	}
	public String getCn_telb3() {
		return cn_telb3;
	}
	public void setCn_telb3(String cn_telb3) {
		this.cn_telb3 = cn_telb3;
	}
	public String getCn_telb4() {
		return cn_telb4;
	}
	public void setCn_telb4(String cn_telb4) {
		this.cn_telb4 = cn_telb4;
	}
	public int getCn_bltmk() {
		return cn_bltmk;
	}
	public void setCn_bltmk(int cn_bltmk) {
		this.cn_bltmk = cn_bltmk;
	}
	public String getCn_lastip() {
		return cn_lastip;
	}
	public void setCn_lastip(String cn_lastip) {
		this.cn_lastip = cn_lastip;
	}
	public Calendar getCn_lastlogin() {
		return cn_lastlogin;
	}
	public void setCn_lastlogin(Calendar cn_lastlogin) {
		this.cn_lastlogin = cn_lastlogin;
	}
}
