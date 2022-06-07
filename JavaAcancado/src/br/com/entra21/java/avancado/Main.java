package br.com.entra21.java.avancado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.entra21.java.avancado.aula01.Aula01;
import br.com.entra21.java.avancado.aula01.enuns.Enuns;
import br.com.entra21.java.avancado.aula01.wrappers.Wrappers;
import br.com.entra21.java.avancado.aula02.Aula02;
import br.com.entra21.java.avancado.aula03.Aula03;
import br.com.entra21.java.avancado.aula03.anotacoes.Responsavel;
import br.com.entra21.java.avancado.aula04.Aula04;
import br.com.entra21.java.avancado.aula05.Aula05;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		do {
			System.out.println(montarMenu());
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Até a proxima!");
				break;
			case 1:
				Aula01.aprender();
				break;
			case 2:
				Aula02.aprender();
				break;
			case 3:
				Aula03.aprender();
				break;
			case 4:
				String titulo = "Aula04 - Collections - SET - HashSet";

				ArrayList<String> assuntos = new ArrayList<>();
				assuntos.add("Definir");
				assuntos.add("CRUD");

				Aula04 aula04 = new Aula04(titulo, assuntos);
				aula04.aprender();
				break;
			case 5:
				new Aula05("Aula05 - Collections - MAP - HashMap",
						new ArrayList<>(Arrays.asList("Definir", "Create", "Read", "Update", "Delete","Exemplo prático"))).aprender();

				break;
			case 6:
				pedirPaciencia();
				break;
			case 7:
				pedirPaciencia();
				break;
			case 8:
				pedirPaciencia();
				break;
			case 9:
				pedirPaciencia();
				break;
			case 10:
				pedirPaciencia();
				break;

			default:
				System.out.println("Escolha uma opção válida para aprender um assunto avançado sobre JAVA");
				break;
			}

		} while (opcao != 0);
		System.out.println("Obrigado, volse sempre que quiser aprender mais sobre JAVA AVANÇADO");

	}

	private static String montarMenu() {
		String menu = "Módulo sobre JAVA AVANÇADO:";
		menu += "\n  0 - Sair";
		menu += "\n  1 - Aula 01  ENUM e Classes Wrapper";
		menu += "\n  2 - Aula 02 - Collections - LIST";
		menu += "\n  3 - Aula 03 - Annotations e Datas";
		menu += "\n  4 - Aula 04 - Collections - SET";
		menu += "\n  5 - Aula 05 - Collections - MAP";
		menu += "\n  6 - Aula 06 - Generics";
		menu += "\n  7 - Aula 07 - Exceções e tratamento de erros";
		menu += "\n  8 - Aula 08 - Funções Lambda";
		menu += "\n--------------------------------------------------------";
		menu += "\n Escolha uma opção para aprender:";
		menu += "\n--------------------------------------------------------";

		return menu;
	}

	@Responsavel(ordemPrioridade = Responsavel.OrdemPrioridade.DOCUMENTAR, item = "Mostrar que não ta na hora", quemAssume = "Rubem Oliota")
	private static void pedirPaciencia() {
		System.out.println("CALMA CALMA CALMA, muita CALMA... ainda não esta pronto.");
		System.out.println("--------------------------------------------------------");

	}

}
