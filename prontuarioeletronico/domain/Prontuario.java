package br.com.prontuarioeletronico.domain;

import java.util.Date;
import java.util.List;

public class Prontuario {
	
	private Long codigo;
	private Date dataDoAtendimento;
	private Paciente paciente;
	private List<Sintoma> sintomas;	
	private List<Diagnostico> diagnosticos;
	
	public Prontuario() {
		
	}

	public Prontuario(Date dataDoAtendimento, Paciente paciente, List<Sintoma> sintomas,
			List<Diagnostico> diagnosticos) {
		super();
		this.dataDoAtendimento = dataDoAtendimento;
		this.paciente = paciente;
		this.sintomas = sintomas;
		this.diagnosticos = diagnosticos;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Date getDataDoAtendimento() {
		return dataDoAtendimento;
	}

	public void setDataDoAtendimento(Date dataDoAtendimento) {
		this.dataDoAtendimento = dataDoAtendimento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Sintoma> getSintomas() {
		return sintomas;
	}

	public void setSintomas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}

	public List<Diagnostico> getDiagnosticos() {
		return diagnosticos;
	}

	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}
	
	
}
