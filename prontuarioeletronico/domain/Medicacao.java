package br.com.prontuarioeletronico.domain;

public class Medicacao {
	
	private String medicacao;
	private Integer periodoEmDias;
	private Integer vezesAoDia;
	
	public Medicacao(){
		
	}

	public Medicacao(String medicacao, Integer periodoEmDias, Integer vezesAoDia) {
		super();
		this.medicacao = medicacao;
		this.periodoEmDias = periodoEmDias;
		this.vezesAoDia = vezesAoDia;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}

	public Integer getPeriodoEmDias() {
		return periodoEmDias;
	}

	public void setPeriodoEmDias(Integer periodoEmDias) {
		this.periodoEmDias = periodoEmDias;
	}

	public Integer getVezesAoDia() {
		return vezesAoDia;
	}

	public void setVezesAoDia(Integer vezesAoDia) {
		this.vezesAoDia = vezesAoDia;
	}
		
}
