package br.com.consultedmed.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;


import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "pacientes")
public class Paciente extends Pessoa {
	
	
	@OneToOne
	@JoinColumn (name = "idEndereco")
	Endereco endereco;

	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
}
