package br.com.consultedmed.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.consultedmed.model.Contato;
import br.com.consultedmed.model.Paciente;
import br.com.consultedmed.utils.JPAUtils;

public class PacienteDao {
	
	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = emf.createEntityManager();
	

	public void salvar(Paciente paciente) {
		
		this.factory.getTransaction().begin();
		this.factory.persist(paciente);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public void remover(Long idPaciente) {
		
		this.factory.getTransaction().begin();
		this.factory.remove(buscaPorId(idPaciente));
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public Paciente buscaPorId(Long idPaciente) {
		this.factory.getTransaction().begin();
		Paciente pacienteRemover = this.factory.find(Paciente.class, idPaciente);
		return pacienteRemover;
	}
	
	public Paciente buscaPorNome(String nome) {
		this.factory.getTransaction().begin();
		Query query = 
				this.factory.createQuery("SELECT c FROM Paciente c WHERE c.nome = :nome");
		query.setParameter("nome", nome);
		Paciente paciente = (Paciente) query.getSingleResult();
		return paciente;
	}
	
	
	public Contato buscaPorEmail(String email) {
		this.factory.getTransaction().begin();
		Query query = 
				this.factory.createQuery("SELECT c FROM Contato c WHERE c.email = :email" );
		query.setParameter("email", email);
		Contato contato = (Contato) query.getSingleResult();
		return contato;
	}
	
	public void editar(Paciente paciente) {
		this.factory.getTransaction().begin();
		this.factory.merge(paciente);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public List<Paciente> pacientes(){
		this.factory.getTransaction().begin();
		Query query = this.factory.createQuery("SELECT c FROM Contato c");
		List<Paciente> pacientes = query.getResultList(); 	
		this.factory.close();
		return pacientes;
	}
}


