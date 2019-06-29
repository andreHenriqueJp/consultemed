package br.com.consultedmed.utils;



import br.com.consultedmed.model.Consulta;
import br.com.consultedmed.model.Contato;
import br.com.consultedmed.model.Endereco;
import br.com.consultedmed.model.Medico;
import br.com.consultedmed.model.Paciente;
import br.com.consultedmed.service.ConsultaService;
import br.com.consultedmed.service.ContatoService;
import br.com.consultedmed.service.EnderecoService;
import br.com.consultedmed.service.MedicoService;
import br.com.consultedmed.service.PacienteService;

public class MainCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 3;
		ContatoService contatoService = new ContatoService();
		MedicoService medicoService = new MedicoService();
		EnderecoService enderecoService = new EnderecoService();
		PacienteService pacienteService = new PacienteService();
		ConsultaService consultaService = new ConsultaService();
		
		switch(opcao) {
			case 1:
				Medico medico = new Medico();
				medico.setNome("Lauro");
				medico.setCpf("123");
				medico.setRg("123");
				medico.setCpf("123");
				medico.setEspecialidade("123");
				Contato contatoMedico = new Contato();
				contatoMedico.setTelefone("123");
				contatoMedico.setEmail("123");
				medico.setContato(contatoMedico);
					
				contatoService.salvar(contatoMedico);
				medicoService.salvar(medico);
				
				break;
			case 2:
				Paciente paciente = new Paciente();
				paciente.setNome("Andre");
				paciente.setCpf("789");
				paciente.setRg("789");
				Contato contatoPaciente = new Contato();
				contatoPaciente.setTelefone("789");
				contatoPaciente.setEmail("789");
				Endereco enderecoPaciente = new Endereco();
				enderecoPaciente.setPais("789");
				enderecoPaciente.setEstado("789");
				enderecoPaciente.setCidade("789");
				enderecoPaciente.setRua("789");
				paciente.setContato(contatoPaciente);
				paciente.setEndereco(enderecoPaciente);
				
				
				contatoService.salvar(contatoPaciente);
				enderecoService.salvar(enderecoPaciente);
				pacienteService.salvar(paciente);
		
				break;
			case 3:
				Consulta consulta = new Consulta();
				Medico medicoDaConsulta = medicoService.buscaMedicoNome("Lauro");
				if(medicoDaConsulta != null) {
					consulta.setMedico(medicoDaConsulta);
				}
				else {
					System.out.println("medico inexistente");
				}
				Paciente pacienteDaConsulta = pacienteService.buscaPacienteNome("Andre");
				if(pacienteDaConsulta != null) {
					consulta.setPaciente(pacienteDaConsulta);
				}
				else {
					System.out.println("Paciente inexistente");
				}	
				
				consultaService.salvar(consulta);
				
				break;
			default:
				System.out.println("numero invalido");
		}

	}

}
