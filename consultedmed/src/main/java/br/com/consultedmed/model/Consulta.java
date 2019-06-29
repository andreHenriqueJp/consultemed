package br.com.consultedmed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@OneToOne
	@JoinColumn (name = "idMedico")
	Medico medico;
	
	@OneToOne
	@JoinColumn (name = "idPaciente")
	Paciente paciente;
	
	@OneToOne
	@JoinColumn (name = "idAgendamento")
	Agendamento agendamento;
	
	Date dateInicial;

	
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Date getDateInicial() {
		return dateInicial;
	}
	public void setDateInicial(Date dateInicial) {
		this.dateInicial = dateInicial;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Agendamento getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
	
	
	
	
}
