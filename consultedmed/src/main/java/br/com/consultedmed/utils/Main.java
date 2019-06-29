package br.com.consultedmed.utils;


import br.com.consultedmed.model.Contato;
import br.com.consultedmed.model.Endereco;
import br.com.consultedmed.model.Paciente;
import br.com.consultedmed.service.ContatoService;
import br.com.consultedmed.service.PacienteService;

public class Main {

	public static void main(String[] args) {
		
		PacienteService service = new PacienteService();
		ContatoService serviceContato = new ContatoService();
		
		
		Contato contato = new Contato();
		contato.setId(null);
		contato.setEmail("cicranosilva@gmail.com");
		contato.setTelefone("83 95555 5555 ");
		
		Endereco endereco = new Endereco();
		endereco.setPais("Brasil");
		endereco.setEstado("Paraiba");
		endereco.setCidade("Joao Pessoa");
		endereco.setRua("rua sem nome");
		
		Paciente paciente = new Paciente();
		paciente.setContato(contato);
		paciente.setCpf("123.123.123-12");
		paciente.setNome("Andre Henrique");
		paciente.setRg("1.123.123");
		
		
		serviceContato.salvar(contato);
		service.salvar(paciente);
		
		
		
		System.out.print("o paciente " + paciente.getNome() + " foi salvo com sucesso");
	
		
		
	
	}

}
