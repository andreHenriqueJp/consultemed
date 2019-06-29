package br.com.consultedmed.service;

import java.util.List;

import br.com.consultedmed.model.Exame;



public interface IExame {
	
	public void salvar(Exame exame);
	public void remove(Long idExame);
	public List<Exame> listarExames();
	public Exame buscaExameId(Long idPaciente);
	public Exame buscaExameNome(String nome);


}
