package br.com.prontuarioeletronico.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.prontuarioeletronico.domain.Medico;
import br.com.prontuarioeletronico.domain.Prontuario;
import br.com.prontuarioeletronico.repository.dao.MedicoDAO;

public class RepositoryFactory {
	
	private static List<Prontuario> bancoDadosFakeProntuario = null;
	private static List<Medico> bancoDadosFakeMedico = null;
					
	public static List<Prontuario> getInstanceProntuario() {
		if(bancoDadosFakeProntuario==null) {
			bancoDadosFakeProntuario = new ArrayList<Prontuario>();
		}		
		return bancoDadosFakeProntuario;
	}
	public static List<Medico> getInstanceMedico() {
		if(bancoDadosFakeMedico==null) {
			bancoDadosFakeMedico = new ArrayList<Medico>();
		}		
		return bancoDadosFakeMedico;
	}
}
