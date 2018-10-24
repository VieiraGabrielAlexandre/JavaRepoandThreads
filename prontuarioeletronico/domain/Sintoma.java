package br.com.prontuarioeletronico.domain;

public class Sintoma {

	private String nomeDoSintoma;
	private Integer periodoDoSintoma;
	
	public Sintoma() {
		
	}
	
	public Sintoma(String nomeDoSintoma, Integer periodoDoSintoma) {
		this.nomeDoSintoma = nomeDoSintoma;
		this.periodoDoSintoma = periodoDoSintoma;
	}


	public String getNomeDoSintoma() {
		return nomeDoSintoma;
	}

	public void setNomeDoSintoma(String nomeDoSintoma) {
		this.nomeDoSintoma = nomeDoSintoma;
	}

	public Integer getPeriodoDoSintoma() {
		return periodoDoSintoma;
	}

	public void setPeriodoDoSintoma(Integer periodoDoSintoma) {
		this.periodoDoSintoma = periodoDoSintoma;
	}
	
	
	
}
