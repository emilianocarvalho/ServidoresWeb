package br.gov.pb.procon.model;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Arquivo {
	
	public Arquivo() {
		Formulario primeiroForm = new Formulario("Processo crédito não tributado", "Parque Solon de Lucena", "256", "Centro",
				"58000000", "João Pessoa", Formulario.UF.PB, "151");
		Formulario segundoForm = new Formulario("Processo crédito não tributado 2", "Epitacio Pessoa", "1000", "Torre",
				"58000000", "João Pessoa", Formulario.UF.PB, "161035");
		this.formularios.add(primeiroForm);
		this.formularios.add(segundoForm);
	}
	
	private Collection<Formulario> formularios = new ArrayList<Formulario>();
	
	public Collection<Formulario> listarFormularios() {
		return new ArrayList<Formulario>(this.formularios);
	}
	
	public void adicionarFormulario(Formulario formulario) {
		this.formularios.add(formulario);
	}

}
