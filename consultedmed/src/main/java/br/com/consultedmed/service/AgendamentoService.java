package br.com.consultedmed.service;

import java.util.List;

import br.com.consultedmed.dao.AgendamentoDao;
import br.com.consultedmed.model.Agendamento;

public class AgendamentoService implements IAgendamento {
	
	AgendamentoDao dao = new AgendamentoDao();
	
	@Override
	public void salvar(Agendamento agendamento) {
		dao.salvar(agendamento);
		
	}

	@Override
	public void remove(Long idAgendamento) {
		dao.remover(idAgendamento);
		
	}

	@Override
	public List<Agendamento> listarAgendamento() {
		return dao.agendamentos();
	}

	@Override
	public void editar(Agendamento agendamento) {
		dao.editar(agendamento);
		
	}

	@Override
	public Agendamento buscaAgedamento(Long idAgendamento) {
		return dao.buscaPorId(idAgendamento);
	}

	@Override
	public Agendamento buscaAgedamentoIdPaciente(Long idPaciente) {
		return dao.buscarPorIdCliente(idPaciente);
	}

}
