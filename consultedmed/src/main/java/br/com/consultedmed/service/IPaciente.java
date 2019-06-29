package br.com.consultedmed.service;

import java.util.List;

import br.com.consultedmed.model.Paciente;

public interface IPaciente {
	
	public void salvar(Paciente paciente);
	public void remove(Long idPaciente);
	public List<Paciente> listarPacientes();
	public void editar(Paciente paciente);
	public Paciente buscaPacienteId(Long idPaciente);
	public Paciente buscaPacienteNome(String nome);
	public Paciente buscaPacienteCpf(String cpf);
		

}
