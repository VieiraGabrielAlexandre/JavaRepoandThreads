package br.com.prontuarioeletronico.domain;

public class Paciente {

	private Long codigo;
	private String nome;
	private Integer idade;
	private String endereco;

	public Paciente() {
		
	}	
	public Paciente(Long codigo, String nome, Integer idade, String endereco) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
