package br.com.prontuarioeletronico.domain;

import java.util.Date;
import java.util.List;

public class Prontuario {
	
	private Long codigo;
	private Date dataDoAtendimento;
	private Paciente paciente;
	private List<Sintoma> sintomas;
	
	
	public Prontuario() {
		
	}
	
	public Prontuario(Paciente paciente,
					List<Sintoma> sintomas,
					Date dataDoAtendimento) {
	
	this.paciente = paciente;
	this.sintomas = sintomas;
	this.dataDoAtendimento = dataDoAtendimento;
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
	
	
}
