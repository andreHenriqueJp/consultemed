package br.com.consultedmed.service;

import br.com.consultedmed.dao.EnderecoDao;
import br.com.consultedmed.model.Endereco;

public class EnderecoService implements IEndereco {
	
	EnderecoDao dao = new EnderecoDao();

	@Override
	public void salvar(Endereco endereco) {
		dao.salvar(endereco);
		
	}

	@Override
	public void remove(Long idEndereco) {
		dao.remover(idEndereco);
		
	}

	@Override
	public Endereco buscaEnderecoId(Long idEndereco) {
		return dao.buscaPorId(idEndereco);
	}
}
