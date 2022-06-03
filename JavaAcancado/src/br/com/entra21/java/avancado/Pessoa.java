package br.com.entra21.java.avancado;

public class Pessoa {

	private String nome;
	private byte idade;
	public Pessoa() {
		
	}
	public Pessoa(String nome, byte idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
	
}
