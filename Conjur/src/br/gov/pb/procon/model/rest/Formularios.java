package br.gov.pb.procon.model.rest;

import java.util.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.pb.procon.model.Formulario;

@XmlRootElement
public class Formularios {
	
	private List<Formulario> formularios = new ArrayList<Formulario>();
	
	@XmlElement
	public List<Formulario> getFormulario() {
		return formularios;
	}
	
	public void setFormularios(List<Formulario> formularios) {
		this.formularios = formularios;
	}

}
