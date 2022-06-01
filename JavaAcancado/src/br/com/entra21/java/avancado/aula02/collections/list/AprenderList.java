package br.com.entra21.java.avancado.aula02.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AprenderList {

	static Scanner entrada = new Scanner(System.in);

	public static void aprender() {
		System.out.println("Com collections podemos agrupar dados sem limite definido");

		byte opcao;
		do {
			System.out.println("Menu - LIST:");
			System.out.println("0 - Voltar");
			System.out.println("1 - ArrayList");
			System.out.println("2 - LinkedList");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Até a proxima!");
				break;
			case 1:
				aprenderArrayList();
				break;
			case 2:
				aprenderLinkedList();
				break;
			default:
				System.out.println("Escolha uma opção válida para aprender sobre Collections - LIST");
				break;
			}

		} while (opcao != 0);
		System.out.println("Obrigado, volse sempre que quiser aprender mais sobre ENUM");

	}

	private static void aprenderArrayList() {
		
		System.out.println("---------------Criando ARRAYS ------------------");
		ArrayList<String> cidades = new ArrayList<>(Arrays.asList("João Pessoa", "Blumenau", "Florianopolis"));
		System.out.println("Quantas cidades ? " + cidades.size());

		ArrayList<String> cores = new ArrayList<>() {
			{
				add("Azul");
				add("Verde");
			}

		};
		System.out.println("Quantas cores ? " + cores.size());

		

		System.out.println("---------------Inserindo itens no ARRAY ------------------");
		
		ArrayList<String> cargos = new ArrayList<>();
		cargos.add("Programador jr"); 
		cargos.add("Programador pl");
		cargos.add("Programador sr");
		System.out.println("Quantos cargos ? " + cargos.size());

		cores.add(0, "Branco");//inserindo na primeira posição


		System.out.println("---------------Acessando itens no ARRAY ------------------");
		System.out.println("Qual foi o meu primeiro cargo? " + cargos.get(0));
		System.out.println("Qual foi o meu ultimo cargo? " + cargos.get(cargos.size() - 1));


		System.out.println("---------------Percorrendo itens no ARRAY com iteração em array------------------");
		System.out.println("Historicos de cargo");
		for (String cargo : cargos) {
			System.out.println("Cargo = " + cargo);
		} 


		System.out.println("---------------Percorrendo itens no ARRAY com index em array------------------");
		System.out.println("De forma inversa");
		for (int cargo = cargos.size() - 1; cargo >= 0; cargo--) {

			System.out.println("(" + cargo + ") cargo = " + cargos.get(cargo));

		} 
		

		System.out.println("---------------Removendo itens no ARRAY ------------------");
		System.out.println("Removendo quem estava no indice 0 ou seja "+cargos.get(0));
		cargos.remove(0);//removi o item no indice 0
		

		System.out.println("Removendo quem tem o cargo \"Programador sr\" pelo valor, sem saber que esta no indice "+cargos.indexOf("Programador sr"));
		cargos.remove("Programador sr");//remove o elemento que tiver esse valor, o indice será procurado

		System.out.println("---------------Percorrendo itens no ARRAY com forEach------------------");
		cargos.forEach(cargo -> { 
		    System.out.println("Cargo " + cargo);
		});
		
		 

		 
	}

	private static void aprenderLinkedList() {
LinkedList<String> nomes = new LinkedList<>();


System.out.println("---------------Inserindo itens no LINKED ------------------");
nomes.add("Rubem");
nomes.add("Fulano");
nomes.addFirst("Teste");
nomes.addLast("Ultimo");
nomes.add(2, "Inserido");

System.out.println("Quantos nomes? "+nomes.size());


System.out.println("---------------Acessando itens no LINKED ------------------");
System.out.println("Quem é o primeiro? " + nomes.getFirst());
System.out.println("Quem é o segundo? " + nomes.get(1));
System.out.println("Quem é o ultimo? " + nomes.getLast()); 
		
 
System.out.println("---------------Percorrendo itens no LINKED com iteração em array------------------");
System.out.println("Ordem de inserção");
for (String nome : nomes) {
	System.out.println("nome = " + nome);
} 


System.out.println("---------------Percorrendo itens no LINKED com index em array------------------");
System.out.println("De forma inversa");
for (int nome = nomes.size() - 1; nome >= 0; nome--) {

	System.out.println("(" + nome + ") cargo = " + nomes.get(nome));

} 


System.out.println("---------------Removendo itens no LINKED ------------------");
System.out.println("Removendo quem estava no indice 0 ou seja "+nomes.getFirst());
nomes.removeFirst();//removi o item no indice 0


System.out.println("Removendo quem tem o nome \"Fulano\" pelo valor, sem saber que esta no indice "+nomes.indexOf("Fulano"));
nomes.remove("Fulano");//remove o elemento que tiver esse valor, o indice será procurado

System.out.println("---------------Percorrendo itens no LINKED com forEach------------------");
nomes.forEach(nome -> { 
    System.out.println("nome " + nome);
});


	}

}
