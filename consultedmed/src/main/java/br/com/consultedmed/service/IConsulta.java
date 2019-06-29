package br.com.consultedmed.service;



import br.com.consultedmed.model.Consulta;


public interface IConsulta {
	
	public void salvar(Consulta consulta);
	public void remove(Long idConsulta);
	public Consulta buscaConsultaId(Long idConsulta);
	

}
