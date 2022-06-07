package br.com.entra21.java.avancado;

import java.util.ArrayList;

public class Pessoa {//modelo de unidade pessoa

	private String nome;
	private byte idade;
	private ArrayList<Pessoa> filhos;
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
	public ArrayList<Pessoa> getFilhos() {
		return filhos;
	}
	public void setFilhos(ArrayList<Pessoa> filhos) {
		this.filhos = filhos;
	}
	
	
}
