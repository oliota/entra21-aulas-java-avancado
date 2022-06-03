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

import br.com.entra21.java.avancado.aula03.assuntos.InProgress;
import br.com.entra21.java.avancado.aula03.assuntos.Lembrete;
import br.com.entra21.java.avancado.aula03.assuntos.Responsavel;

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
				aprenderDatas();
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
 
	private static void aprenderDatas() {
		System.out.println("Assunto datas");

		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	  
	    	
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); // YYYY-MM-DD(formato ISO-8601)
		System.out.println(formatters.format(hoje)); 
		
		LocalDate nascimento = LocalDate.of(1990, 12, 30);
		System.out.println(nascimento); 
		System.out.println(nascimento); 

		LocalDate essaQuinta = LocalDate.of(2022, Month.JUNE, 2);

		Period periodo = Period.between(nascimento, essaQuinta);
		
		System.out.println("Entre meu nascimento e essa quinta");
		System.out.println("anos = " + periodo.getYears());
		System.out.println("meses = " + periodo.getMonths());
		System.out.println("dias = " + periodo.getDays());
		System.out.println("Mas quem esta contando? a API de datas do Java :)  ");

		LocalTime horarioDeEntrada = LocalTime.of(18, 15);
		System.out.println(horarioDeEntrada); // 09:00
		
		

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
