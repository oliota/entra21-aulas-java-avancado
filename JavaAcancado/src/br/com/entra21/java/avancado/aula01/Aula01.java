package br.com.entra21.java.avancado.aula01;

import java.util.Scanner;

import br.com.entra21.java.avancado.aula01.enuns.Enuns;
import br.com.entra21.java.avancado.aula03.anotacoes.Lembrete;

public class Aula01 {

	static Scanner entrada = new Scanner(System.in);
	 
	public static void aprender() {

		System.out.println("Assuntos da aula 01");

		byte opcao;
		do {
			System.out.println("Menu - AULA 01:");
			System.out.println("-1 - SAIR");
			System.out.println(" 0 - Voltar");
			System.out.println(" 1 - Classes wrapper");
			System.out.println(" 2 - Enum escrito separado"); 
			opcao = entrada.nextByte();

			switch (opcao) {
			case -1:
				System.exit(1);
				break;
			case 0:
				System.out.println("Voltando...");
				break;
			case 1: 
				Enuns.aprender();
				break;
			case 2: 
				break;
			case 3: 
				break;
			default:
				System.out.println("Escolha uma opção válida");
				break;
			}

		} while (opcao != 0);
		System.out.println("Obrigado, volse sempre que quiser aprender mais");

	}
}
