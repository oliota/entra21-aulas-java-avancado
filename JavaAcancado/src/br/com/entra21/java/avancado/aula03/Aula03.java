package br.com.entra21.java.avancado.aula03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import br.com.entra21.java.avancado.aula03.anotacoes.InProgress;
import br.com.entra21.java.avancado.aula03.anotacoes.Lembrete;
import br.com.entra21.java.avancado.aula03.anotacoes.Responsavel;
import br.com.entra21.java.avancado.aula03.datas.Datas;

public class Aula03 {

	static Scanner entrada = new Scanner(System.in);

	@Responsavel(
			ordemPrioridade = Responsavel.OrdemPrioridade.CRITICO,
			item = "Mostrar API de datas e anotações",
			quemAssume = "Rubem Oliota"
			)
	static public  void aprender() {
		System.out.println(
				"Com a nova API de datas ficou mais facil programar e as anotações facilitam a configuração do código");

		Instant inicio = Instant.now();
		byte opcao;
		do {
			System.out.println("Menu - AULA 03:");
			System.out.println("0 - Voltar");
			System.out.println("1 - Datas");
			System.out.println("2 - Anotações");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Até a proxima!");
				break;
			case 1:
				Datas.aprenderDatasComputador();
				Datas.aprenderDatasHumanizadas();
				break;
			case 2:
				aprenderAnotacoes();
				break;
			default:
				System.out.println("Escolha uma opção válida para aprender sobre Datas e Anotações");
				break;
			}

		} while (opcao != 0);
		Instant fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);

		System.out.println("--------------------------------------------");
		System.out.println("Milisegundos dedicados ao aprendizado = " + duracao.toMillis());
		System.out.println("Segundos dedicados ao aprendizado = " + duracao.toSeconds());
		System.out.println("Minutos dedicados ao aprendizado = " + duracao.toMinutes());
		System.out.println("Horas dedicadas ao aprendizado = " + duracao.toHours());
		System.out.println("Obrigado, volte sempre que quiser aprender mais sobre Datas e Anotações");
		System.out.println("--------------------------------------------");

		exemplo();
		
	}
 
	 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void aprenderAnotacoes() {
		System.out.println("Assunto anotações");
		ArrayList lista = new ArrayList();
		lista.add("dado");

		aindaNaoFiz();

		detalharAtributo();

		exercitar();
	}

	@InProgress
	private static void aindaNaoFiz() {
		// eu avisei que não fiz né?
	}

	@Lembrete(value = "o value esta lá na interface e o conteudo fica aqui")
	private static void detalharAtributo() {
		// TODO Auto-generated method stub

	}

	@Responsavel(item = "Praticar o que aprendeu", quemAssume = "Alunos")
	private static void exercitar() {
		// TODO Auto-generated method stub

	}
	
	@Lembrete(value="Isso serve de exemplo para aprender anotações com valor")
	private static void exemplo() {
		//somente exemplo
	}

}
