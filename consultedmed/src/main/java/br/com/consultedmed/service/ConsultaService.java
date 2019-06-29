package br.com.consultedmed.service;

import br.com.consultedmed.dao.ConsultaDao;
import br.com.consultedmed.model.Consulta;

public class ConsultaService implements IConsulta {
	
	ConsultaDao dao = new ConsultaDao();
	
	@Override
	public void salvar(Consulta consulta) {
		dao.salvar(consulta);
		
	}

	@Override
	public void remove(Long idConsulta) {
		dao.remover(idConsulta);
		
	}

	@Override
	public Consulta buscaConsultaId(Long idConsulta) {
		return dao.buscaPorId(idConsulta);
	}

}
