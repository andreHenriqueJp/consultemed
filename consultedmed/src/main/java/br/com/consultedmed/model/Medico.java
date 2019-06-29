package br.com.consultedmed.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "medicos")
public class Medico extends Pessoa {
	
	String especialidade;
	//List<Date> listaDeHorariosDisponiveis;
	

	
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
	
}
