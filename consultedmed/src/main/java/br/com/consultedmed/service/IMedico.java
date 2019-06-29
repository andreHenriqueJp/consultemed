package br.com.consultedmed.service;

import java.util.List;

import br.com.consultedmed.model.Medico;


public interface IMedico {
	
	public void salvar(Medico medico);
	public void remove(Long idMedico);
	public List<Medico> listarMedicos();
	public void editar(Medico medico);
	public Medico buscaMedicoId(Long idMedico);
	public Medico buscaMedicoNome(String nome);
	public Medico buscaMedicoCpf(String cpf);

}
