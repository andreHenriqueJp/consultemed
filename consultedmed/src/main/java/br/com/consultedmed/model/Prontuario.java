package br.com.consultedmed.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prontuarios")
public class Prontuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@OneToMany
	@JoinColumn (name = "idExame")
	List<Exame> listaExame = new ArrayList<Exame>();
	
	@OneToOne
	@JoinColumn (name = "idPaciente")
	Paciente paciente;
	
	@OneToMany
	@JoinColumn (name = "idConsulta")
	List<Consulta> listaConsuta = new ArrayList<Consulta>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Exame> getListaExame() {
		return listaExame;
	}

	public void setListaExame(List<Exame> listaExame) {
		this.listaExame = listaExame;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Consulta> getListaConsuta() {
		return listaConsuta;
	}

	public void setListaConsuta(List<Consulta> listaConsuta) {
		this.listaConsuta = listaConsuta;
	}
	
	
	

}
