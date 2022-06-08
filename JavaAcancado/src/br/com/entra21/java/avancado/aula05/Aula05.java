package br.com.entra21.java.avancado.aula05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import br.com.entra21.java.avancado.Aula;

public class Aula05 extends Aula {

	HashMap<String, String> estados = new HashMap<>();

	public Aula05(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();
		switch (opcao) {
		case 1:
			aprenderHashMap();
			break;
		case 2:
			aprenderCreate();
			break;
		case 3:
			aprenderRead();
			break;
		case 4:
			aprenderUpdate();
			break;
		case 5:
			aprenderDelete();
			break;
		case 6:
			aprenderExemplo();
			break;
		}
		return opcao;
	}

	private void aprenderHashMap() {

		System.out.println("Caracteristicas do HashMap");
		System.out.println("- Não possui uma ordenação natural (incremento ou alfabetica)");
		System.out.println("- Não é ordenavel");
		System.out.println("- Não permite duplicidades");

		System.out.println("===========================");
		HashMap<String, String> linguagens = new HashMap<>();

		System.out.println("A lista está vazia ? " + (linguagens.isEmpty() ? "Sim" : "Não"));
		System.out.println("Quantidade de itens ? " + linguagens.size());

	}

	private void aprenderCreate() {
		System.out.println("========  CREATE  verificar debug ================");
		System.out.println("PUT por padrão o PUT inserte ou atualiza ");
		estados.clear();
		estados.put("CE", "Ceará");
		estados.put("AL", "Alagoas");
		estados.put("DF", "Distrito Federal");
		estados.put("AC", "Acre");
		estados.put("ES", "Espírito Santo");
		estados.put("AP", "Amapá");
		estados.put("AM", "Amazonas");
		estados.put("BA", "Bahia");
		estados.put("PB", "Paraíba");
		estados.put("GO", "Goiás");
		estados.put("SC", "Santa Catarina");

		System.out.println(estados);

	}

	private void aprenderRead() {

		System.out.println("========  READ ================");
		System.out.println("A lista está vazia ? " + (estados.isEmpty() ? "Sim" : "Não"));
		System.out.println("Quantidade de elementos " + estados.size());

		System.out.println("------  Listando elementos -----");
		System.out.println(estados);
		System.out.println("-----listar as chaves por padrão--------");
		for (String estado : estados.keySet()) {
			System.out.println("Estado : " + estado);
		}
		System.out.println("--------listar apenas valores----------------");
		for (String estado : estados.values()) {
			System.out.println("Estado : " + estado);
		}

		System.out.println("--------listar todos os detalhes----------------");
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
		}

		System.out.println(" -----  Procurando elementos por chave-----");
		System.out.println("PB é uma chave nessa lista? " + (estados.containsKey("PB") ? "Sim" : "Não"));
		System.out.println("PE é  uma chave nessa lista? " + (estados.containsKey("PE") ? "Sim" : "Não"));

		System.out.println(" -----  Procurando elementos por valor-----");
		System.out.println("Paraíba é um valor nessa lista? " + (estados.containsValue("Paraíba") ? "Sim" : "Não"));
		System.out
				.println("Pernambuco é um valor nessa lista? " + (estados.containsValue("Pernambuco") ? "Sim" : "Não"));

		System.out.println(" -----  Obter um elemento por chave-----");
		String obter1 = estados.get("DF");
		System.out.println("Tentei buscar pela chave DF será que existe? " + (obter1 != null ? "Sim" : "Não"));

		String obter2 = estados.get("RR");
		System.out.println("Tentei buscar pela chave RR será que existe? " + (obter2 != null ? "Sim" : "Não"));

		String obter3 = estados.getOrDefault("RO", "Não achei, tentei usar a chave RO");
		System.out.println("Tentei buscar pela chave RO ... " + obter3);

		String obter4 = estados.getOrDefault("BA", "eu sei que tem");
		System.out.println("Tentei buscar pela chave BA ... " + obter4);

	}

	private void aprenderUpdate() {

		System.out.println("======== UPDATE por padrão o PUT inserte ou atualiza ================");
		System.out.println("----- basta informar uma chave existente e um valor novo");

		System.out.println("--------- listando estados antes --------------");
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
		}

		estados.put("SC", "Santa Catarina (Atualizado)");

		System.out.println("--------- listando estados depois --------------");
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
		}

	}

	private void aprenderDelete() {

		System.out.println("======== DELETE ================");
		System.out.println("--------- listando estados antes =" + estados.size() + "--------------");
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
		}

		estados.remove("OPA");
		estados.remove("PB");
		estados.remove("SC", "Santa Catarina (Atualizado)");

		System.out.println("--------- listando estados depois =" + estados.size() + "--------------");
		for (Entry<String, String> estado : estados.entrySet()) {
			System.out.println("Estado : " + estado);
			System.out.println("\tKey : " + estado.getKey());
			System.out.println("\tValue : " + estado.getValue());
		}
	}

	private void aprenderExemplo() {
		System.out.println("Gerenciar as notas dos alunos");

		HashMap<String, float[]> alunos = new HashMap<>();
		System.out.println(" ------------- Criando 4 alunos e suas 3 notas --------------");
		alunos.put("Oliota", new float[] { 7, 8, 9 });
		alunos.put("Fulano", new float[] { 7, 8, 8, 8 });
		alunos.put("Zé", new float[] { 7, 9, 9 });
		alunos.put("Maria", new float[] { 7, 9, 10 });

		System.out.println("---------- listar todos os alunos");

		for (String aluno : alunos.keySet()) {
			System.out.println("Aluno:" + aluno);
		}

		System.out.println("---------- listar todos os alunos e suas respectivas notas");
		listarAlunosDetalhes(alunos);

		System.out.println("------- alterando as notas do Zé -------------");
		alunos.put("Zé", new float[] { 10, 7, 10 });

		System.out.println("-------buscar e ler notas do Zé -------------");
		for (float nota : alunos.get("Zé")) {
			System.out.println("\tnota = " + nota);
		}

		System.out.println("---------- listar todos os alunos e suas respectivas notas após a alteração");
		listarAlunosDetalhes(alunos);

		System.out.println("---------- excluindo o Fulano");
		
		if(alunos.containsKey("Fulano")) {
			alunos.remove("Fulano");
		}else {
			System.out.println("Fulano? nunca nem vi");
		}
		

		System.out.println("---------- listar todos os alunos e suas respectivas notas após exluir o Fulano");
		listarAlunosDetalhes(alunos);

	}

	private void listarAlunosDetalhes(HashMap<String, float[]> alunos) {
		for (Entry<String, float[]> aluno : alunos.entrySet()) {
			System.out.println("Aluno:" + aluno.getKey());
			float soma = 0;
			for (int nota = 0; nota < aluno.getValue().length; nota++) {
				System.out.println("\t" + (nota + 1) + "º nota = " + aluno.getValue()[nota]);
				soma += aluno.getValue()[nota];
			}
			System.out.println("\tMédia = " + soma / aluno.getValue().length);
		}
		System.out.println("----------------- total de alunos" + alunos.size() + " -----------");
	}
}
