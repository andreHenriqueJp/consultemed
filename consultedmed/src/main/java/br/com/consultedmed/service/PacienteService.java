package br.com.consultedmed.service;

import java.util.List;

import br.com.consultedmed.dao.PacienteDao;
import br.com.consultedmed.model.Paciente;

public class PacienteService implements IPaciente {
	
	private PacienteDao dao;
	
	public PacienteService() {
		this.dao = new PacienteDao();
	}
	
	@Override
	public void salvar(Paciente paciente) {
		dao.salvar(paciente);
		
	}

	@Override
	public void remove(Long idPaciente) {
		dao.remover(idPaciente);
		
	}

	@Override
	public List<Paciente> listarPacientes() {
		return dao.pacientes();
	}

	@Override
	public void editar(Paciente paciente) {
		dao.editar(paciente);
		
	}

	@Override
	public Paciente buscaPacienteId(Long idPaciente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente buscaPacienteNome(String nome) {
		return dao.buscaPorNome(nome);
	}

	@Override
	public Paciente buscaPacienteCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

}
