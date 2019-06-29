package br.com.consultedmed.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.consultedmed.model.Medico;
import br.com.consultedmed.utils.JPAUtils;

public class MedicoDao {
	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = emf.createEntityManager();
	

	public void salvar(Medico medico) {
		
		this.factory.getTransaction().begin();
		this.factory.persist(medico);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public void remover(Long idMedico) {
		
		this.factory.getTransaction().begin();
		this.factory.remove(buscaPorId(idMedico));
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public Medico buscaPorId(Long idMedico) {
		this.factory.getTransaction().begin();
		Medico contatoRemover = this.factory.find(Medico.class, idMedico);
		return contatoRemover;
	}
	
	public Medico buscaPorNome(String nome) {
		this.factory.getTransaction().begin();
		Query query = 
				this.factory.createQuery("SELECT c FROM Medico c WHERE c.nome = :nome");
		query.setParameter("nome", nome);
		Medico medico = (Medico) query.getSingleResult();
		return medico;
	}
	
	public Medico buscarPorCpf(String cpfMedico) {
		this.factory.getTransaction().begin();
		Query query =
				this.factory.createQuery("SELECT c FROM Medico c WHERE c.cpf = :cpf");
		query.setParameter("cpf", cpfMedico);
		Medico medico = (Medico) query.getSingleResult();
		return medico;
	}

	
	public void editar(Medico medico) {
		this.factory.getTransaction().begin();
		this.factory.merge(medico);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public List<Medico> medicos(){
		this.factory.getTransaction().begin();
		Query query = this.factory.createQuery("SELECT c FROM Medico c");
		List<Medico> medicos = query.getResultList(); 
		for (Medico medico : medicos) {
			System.out.println(medico.getNome());
		}
		
		this.factory.close();
		return medicos;
	}
}
