package br.com.entra21.java.avancado.aula03.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Datas {
	

	static Scanner entrada = new Scanner(System.in);
	
	public static void aprenderDatasComputador() {
		System.out.println("O computador entende o tempo de forma diferente");
		Instant inicio = Instant.now();
		System.out.println("Escolha um numero qualquer, vamos contar o tempo que vc gastou pensando");
		byte numero= entrada.nextByte();
		
		Instant fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		System.out.println("--------------------------------------------");
		System.out.println("Milisegundos gastos escolhendo = " + duracao.toMillis());
		System.out.println("Segundos gastos escolhendo = " + duracao.toSeconds());
		System.out.println("Minutos gastos escolhendo = " + duracao.toMinutes());
		System.out.println("Horas gastos escolhendo = " + duracao.toHours());
		System.out.println("É assim que o computador entende o tempo, como uma duração iniciada em 01/01/1970 até a data atual em nanosegundos");
		System.out.println("--------------------------------------------");
		
		

	}
 
	
	public static void aprenderDatasHumanizadas() {
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
 

}
