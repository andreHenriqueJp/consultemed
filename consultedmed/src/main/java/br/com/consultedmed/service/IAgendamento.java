package br.com.consultedmed.service;

import java.util.List;

import br.com.consultedmed.model.Agendamento;



public interface IAgendamento {
	
	public void salvar(Agendamento agendamento);
	public void remove(Long idAgendamento);
	public List<Agendamento> listarAgendamento();
	public void editar(Agendamento agendamento);
	public Agendamento buscaAgedamento(Long idAgendamento);
	public Agendamento buscaAgedamentoIdPaciente(Long idPaciente);

	
}
