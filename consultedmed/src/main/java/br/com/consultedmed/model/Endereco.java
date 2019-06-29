package br.com.consultedmed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String pais;
	String estado;
	String cidade;
	String rua;
	
	
	public Long getIdEndereco() {
		return id;
	}
	public void setIdEndereco(Long idEndereco) {
		this.id = idEndereco;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	
	
	
}
