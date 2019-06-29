package br.com.consultedmed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="exames")
public class Exame {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long idExame;
	
	@OneToOne
	@JoinColumn (name = "idPaciente")
	Paciente paciente;
	String descricaoExame;
	
	public Long getIdExame() {
		return idExame;
	}
	public void setIdExame(Long idExame) {
		this.idExame = idExame;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getDescricaoExame() {
		return descricaoExame;
	}
	public void setDescricaoExame(String descricaoExame) {
		this.descricaoExame = descricaoExame;
	}
	
	
}
