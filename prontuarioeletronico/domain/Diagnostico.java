package br.com.prontuarioeletronico.domain;

import java.util.List;

public class Diagnostico {
	
	private String descricao;
	private Medico medico;
	private List<Medicacao> medicacoes;
	
	public Diagnostico() {
		
	}

	public Diagnostico(String descricao, Medico medico, List<Medicacao> medicacoes) {
		super();
		this.descricao = descricao;
		this.medico = medico;
		this.medicacoes = medicacoes;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public List<Medicacao> getMedicacoes() {
		return medicacoes;
	}

	public void setMedicacoes(List<Medicacao> medicacoes) {
		this.medicacoes = medicacoes;
	}
	
	
	
}
