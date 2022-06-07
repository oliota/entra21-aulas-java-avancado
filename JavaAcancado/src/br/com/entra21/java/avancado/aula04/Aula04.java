package br.com.entra21.java.avancado.aula04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;

public class Aula04 extends Aula {

	public Aula04(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();
		switch (opcao) { 
		case 1:
			aprenderHashSet();
			break;
		case 2:
			manipularCRUD();
			break;
		default:
			System.out.println("Opção inválida para o menu de " + super.getTitulo());
			break;
		}
		return opcao;
	}

	private void aprenderHashSet() {

		System.out.println("Caracteristicas do HashSet");
		System.out.println("- Não possui uma ordenação natural (incremento ou alfabetica)");
		System.out.println("- Não é ordenavel");
		System.out.println("- Não permite duplicidades");

		System.out.println("===========================");
		HashSet<String> linguagens = new HashSet<String>();

		System.out.println("A lista está vazia ? " + (linguagens.isEmpty() ? "Sim" : "Não"));
		System.out.println("Quantidade de itens ? " + linguagens.size());

	}

	private void manipularCRUD() {

		System.out.println("======== CRUD ============");
		HashSet<String> linguagens = new HashSet<String>();
		C(linguagens);// create
		R(linguagens);// read
		U(linguagens);// update
		D(linguagens);// delete

	}

	private void C(HashSet<String> linguagens) {
		System.out.println("========  CREATE  verificar debug ================");
		linguagens.add("Java");
		linguagens.add("C#");
		linguagens.add("Java");
		linguagens.add("Javascript");
		linguagens.add("Delphi");
		linguagens.add("Kotlin");
		linguagens.add("Java");
		linguagens.add("RubemOliotaLang");
		linguagens.add("C");
		linguagens.add("C#");

		linguagens.addAll(new ArrayList<>(Arrays.asList("Angular", "Typescript")));

	}

	private void R(HashSet<String> linguagens) {

		System.out.println("========  READ ================");
		System.out.println("A lista está vazia ? " + (linguagens.isEmpty() ? "Sim" : "Não"));
		System.out.println("Quantidade de elementos " + linguagens.size());

		System.out.println("------  Listando elementos -----");
		System.out.println(linguagens);
		System.out.println("-------------");
		for (String linguagen : linguagens) {
			System.out.println("Linguagem = " + linguagen);
		}

		System.out.println(" -----  Procurando elementos -----");
		System.out.println("Java esta nessa lista? " + (linguagens.contains("Java") ? "Sim" : "Não"));
		System.out.println("Advpl esta nessa lista? " + (linguagens.contains("Advpl") ? "Sim" : "Não"));

	}

	private void U(HashSet<String> linguagens) {

		System.out.println("======== UPDATE não é possivel atualizar STRING================");
		System.out.println("----- para trocar ele por outro seria necessario remover e depois adicionar outro");
		System.out.println(
				"----- para outras classes que contem atributos é possivel atualizar pois o objeto continua existindo na lista");
		System.out.println("mas é necessario percorrer a lista para encontrar e fazer alterações");

		System.out.println("----------------------------");
		System.out.println(linguagens);
		System.out.println("-----");
		if (linguagens.contains("Javascript")) {
			linguagens.remove("Javascript");
			linguagens.add("Javascript2");
		}
		System.out.println("Removendo Javascript e incluindo Javascript2");
		System.out.println(linguagens);

		Pessoa pessoa1 = new Pessoa("Rubem", (byte) 33);
		Pessoa pessoa2 = new Pessoa("Fulano", (byte) 14);
		Pessoa pessoa3 = new Pessoa("Teste", (byte) 55);

		HashSet<Pessoa> pessoas = new HashSet<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		System.out.println("--------- listando pessoas antes --------------");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + "-" + pessoa.getIdade());
		}
		Pessoa busca = null;
		if (pessoas.contains(pessoa2)) {
			for (Pessoa pessoa : pessoas) {
				if (pessoa.getNome().equals(pessoa2.getNome())) {
					pessoa.setNome("OUTRO NOME");
					break;
				}
			}

		}

		System.out.println("--------- listando pessoas depois --------------");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + "-" + pessoa.getIdade());
		}

	}

	private void D(HashSet<String> linguagens) {

		System.out.println("======== DELETE ================");
		System.out.println("--------- listando linguagens antes --------------");
		for (String linguagem : linguagens) {
			System.out.println(linguagem);
		}
		System.out.println("Deletando Typescript");
		linguagens.remove("Typescript");
		System.out.println("Deletando GoLang que nao existe");
		linguagens.remove("GoLang");
		System.out.println("--------- listando linguagens depois --------------");
		for (String linguagem : linguagens) {
			System.out.println(linguagem);
		}
		linguagens.clear();
	}

}
