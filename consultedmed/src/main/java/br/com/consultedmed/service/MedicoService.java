package br.com.consultedmed.service;

import java.util.List;

import br.com.consultedmed.dao.MedicoDao;
import br.com.consultedmed.model.Medico;

public class MedicoService implements IMedico {
	
	MedicoDao dao = new MedicoDao();
	
	@Override
	public void salvar(Medico medico) {
		dao.salvar(medico);
		
	}

	@Override
	public void remove(Long idMedico) {
		dao.remover(idMedico);
		
	}

	@Override
	public List<Medico> listarMedicos() {
		return dao.medicos();
	}

	@Override
	public void editar(Medico medico) {
		dao.editar(medico);
		
	}

	@Override
	public Medico buscaMedicoId(Long idMedico) {
		return dao.buscaPorId(idMedico);
	}

	@Override
	public Medico buscaMedicoNome(String nome) {
		return dao.buscaPorNome(nome);
	}

	@Override
	public Medico buscaMedicoCpf(String cpfMedico) {
		return dao.buscarPorCpf(cpfMedico);
	}

}
