package br.com.consultedmed.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.consultedmed.model.Agendamento;
import br.com.consultedmed.model.Paciente;
import br.com.consultedmed.utils.JPAUtils;

public class AgendamentoDao {
	
	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = emf.createEntityManager();
	
	public void salvar(Agendamento agendamento) {
		
		this.factory.getTransaction().begin();
		this.factory.persist(agendamento);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public void remover(Long idAgendamento) {
		
		this.factory.getTransaction().begin();
		this.factory.remove(buscaPorId(idAgendamento));
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public Agendamento buscaPorId(Long idAgendamento) {
		this.factory.getTransaction().begin();
		Agendamento agendamentoRemover = this.factory.find(Agendamento.class, idAgendamento);
		return agendamentoRemover;
	}
	
	
	public void editar(Agendamento agendamento) {
		this.factory.getTransaction().begin();
		this.factory.merge(agendamento);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public List<Agendamento> agendamentos(){
		this.factory.getTransaction().begin();
		Query query = this.factory.createQuery("SELECT c FROM Agendamento c");
		List<Agendamento> agendamentos = query.getResultList(); 
		this.factory.close();
		return agendamentos;
	}
	
	public Agendamento buscarPorIdCliente(Long idPaciente) {
		this.factory.getTransaction().begin();
		Query query = 
				this.factory.createQuery("SELECT c FROM Agendamento c WHERE c.idPaciente = :idPaciente");
		query.setParameter("idPaciente", idPaciente);
		Agendamento agendamento = (Agendamento) query.getSingleResult();
		return agendamento;
	}
	
}
