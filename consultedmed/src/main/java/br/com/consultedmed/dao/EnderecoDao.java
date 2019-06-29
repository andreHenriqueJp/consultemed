package br.com.consultedmed.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultedmed.model.Endereco;
import br.com.consultedmed.utils.JPAUtils;

public class EnderecoDao {
	
	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = emf.createEntityManager();

	public void salvar(Endereco endereco) {
		
		this.factory.getTransaction().begin();
		this.factory.persist(endereco);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public void remover(Long idEndereco) {
		
		this.factory.getTransaction().begin();
		this.factory.remove(buscaPorId(idEndereco));
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public Endereco buscaPorId(Long idEndereco) {
		this.factory.getTransaction().begin();
		Endereco enderecoRemover = this.factory.find(Endereco.class, idEndereco);
		return enderecoRemover;
	}
}
