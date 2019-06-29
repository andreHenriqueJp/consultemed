package br.com.consultedmed.utils;

import br.com.consultedmed.model.Agendamento;
import br.com.consultedmed.model.Paciente;
import br.com.consultedmed.service.AgendamentoService;
import br.com.consultedmed.service.ConsultaService;
import br.com.consultedmed.service.PacienteService;

public class MainMedico {

	public static void main(String[] args) {
				
		String opcao="cancelamento";
		
		switch(opcao) {
			case "cancelamento":
				PacienteService pacienteService = new PacienteService();
				Paciente paci = pacienteService.buscaPacienteNome("Andre");
				AgendamentoService agendamentoService = new AgendamentoService(); 
				Agendamento agendamento = agendamentoService.buscaAgedamentoIdPaciente(paci.getId());
				agendamentoService.remove(agendamento.getId());
				break;
			case "consultar":
				System.out.print("ddd");
				break;
		}
		
	}

}
