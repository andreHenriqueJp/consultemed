package br.com.consultedmed.service;



import br.com.consultedmed.model.Endereco;


public interface IEndereco {
	
	public void salvar(Endereco endereco);
	public void remove(Long idEnderecp);
	public Endereco buscaEnderecoId(Long idEndereco);

}
