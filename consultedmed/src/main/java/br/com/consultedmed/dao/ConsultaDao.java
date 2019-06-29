package br.com.consultedmed.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultedmed.model.Consulta;
import br.com.consultedmed.utils.JPAUtils;

public class ConsultaDao {
	
	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = emf.createEntityManager();
	
	public void salvar(Consulta consulta) {
		
		this.factory.getTransaction().begin();
		this.factory.persist(consulta);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public void remover(Long idConsulta) {
		
		this.factory.getTransaction().begin();
		this.factory.remove(buscaPorId(idConsulta));
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public Consulta buscaPorId(Long idConsulta) {
		this.factory.getTransaction().begin();
		Consulta consultaRemover = this.factory.find(Consulta.class, idConsulta);
		return consultaRemover;
	}
	
	
}
