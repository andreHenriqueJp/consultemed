package br.com.consultedmed.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.consultedmed.model.Agendamento;
import br.com.consultedmed.model.Medico;
import br.com.consultedmed.model.Paciente;
import br.com.consultedmed.service.AgendamentoService;
import br.com.consultedmed.service.MedicoService;
import br.com.consultedmed.service.PacienteService;

public class MainAgendamento {

	public static void main(String[] args) {
		
		AgendamentoService agendamentoService = new AgendamentoService();
		PacienteService pacienteService = new PacienteService();
		MedicoService medicoService = new MedicoService();
		Agendamento agendamento = new Agendamento();
		Date data = new Date(2019, 07, 02);
		Date hoje = new Date();
	
		
		Paciente paciente = pacienteService.buscaPacienteNome("Andre");
		Medico medico = medicoService.buscaMedicoNome("Lauro");
		List<Agendamento> listaAgendamento = agendamentoService.listarAgendamento();
		List<Date> listaData = new ArrayList<Date>();
		
		for (Agendamento agend : listaAgendamento){
			if(agend.getData()==data) {
				listaData.add(agend.getData());
			}
		}
		if(listaData.isEmpty()&&(data.getTime()>hoje.getTime())) {
			agendamento.setMedico(medico);
			agendamento.setPaciente(paciente);
			agendamento.setData(data);
			agendamentoService.salvar(agendamento);
		}else {
			System.out.println("data indisponivel");
		}
		
		

	}

}
