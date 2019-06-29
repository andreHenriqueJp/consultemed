package br.com.consultedmed.service;



import br.com.consultedmed.model.Prontuario;

public interface IProntuario {

	public void salvar(Prontuario prontuario);
	public void remove(Long iProntuario);

}
