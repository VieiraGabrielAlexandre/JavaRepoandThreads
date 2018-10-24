package br.com.prontuarioeletronico.domain;

import java.util.List;

public class Medico {
	private Long codigo;
	private String nome;
	private List<String> especialidades;
	
	public Medico() {
		
	}

	public Medico(String nome, List<String> especialidades) {
		super();
		this.nome = nome;
		this.especialidades = especialidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	
	
}
