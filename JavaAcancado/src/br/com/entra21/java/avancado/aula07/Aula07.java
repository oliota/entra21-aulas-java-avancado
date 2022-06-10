package br.com.entra21.java.avancado.aula07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;
import br.com.entra21.java.avancado.aula06.cruds.PessoaCrud;
import br.com.entra21.java.avancado.aula06.cruds.ProdutoCrud;

public class Aula07 extends Aula {
	Pessoa pessoa;
	public static HashMap<String, Pessoa> pessoas = new HashMap<>();

	public Aula07(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();
		switch (opcao) {
		case 1:
			aprenderComoTratarErros();
			break;
		case 2:
			obterInformacoesErro();
			break;

		case 3:
			usarMinhaCustomException();
			break;
		case 4:

			seraQuePrecisoUsarFinally(pessoa);
			break;

		case 5:
			praticar();
			break;
		}
		return opcao;
	}

	private void aprenderComoTratarErros() {

		System.out.println("Por favor informe um valor pequeno");
		byte naoEstoupronto = getEntrada().nextByte();

		try {
			System.out.println("INFORME UM VALOR PEQUENO");
			byte estouPreparado = getEntrada().nextByte();
		} catch (InputMismatchException e) {
			setEntrada(new Scanner(System.in));
		}

		System.out.println("Vou fazer um calculo simples");
		System.out.println("Informe um numero");
		byte numeroA = getEntrada().nextByte();

		System.out.println("Informe outro numero");
		byte numeroB = getEntrada().nextByte();

		System.out.println("Tentando dividir " + numeroA + "/" + numeroB);
		try {
			System.out.println("Resultado " + (numeroA / numeroB));
		} catch (ArithmeticException e) {
			System.out.println("Tentando dividir um inteiro por zero?  se não quer dividir não divida ueh");
		}

	}

	private void obterInformacoesErro() {

		try {
			System.out.println("INFORME UM VALOR PEQUENO");
			byte estouPreparado = getEntrada().nextByte();
		} catch (InputMismatchException e) {
			System.out.println("OPA o que aconteceu aqui ? " + e.getMessage());
			System.out.println("------------------------------------------------");
			System.out.println("Eu estava esperando por isso, não vou parar o programa por sua causa");
			System.out.println("Esse tipo de coisa quebra o Scanner, ç tá doido?");

			setEntrada(new Scanner(System.in));
		}

		System.out.println("Vou fazer um calculo simples");
		System.out.println("Informe um numero");
		byte numeroA = getEntrada().nextByte();

		System.out.println("Informe outro numero");
		byte numeroB = getEntrada().nextByte();

		System.out.println("Tentando dividir " + numeroA + "/" + numeroB);
		try {
			System.out.println("Resultado " + (numeroA / numeroB));
		} catch (ArithmeticException e) {
			System.out.println("O que deu errado? " + e.getMessage());
		}

	}

	private void usarMinhaCustomException() {

		System.out.println("Informe sua data de nascimento no formato yyyy-mm-dd");
		try {
			LocalDate dataNascimento = LocalDate.parse(getEntrada().next());
			System.out.println("Nasceu em " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

			if (dataNascimento.isAfter(LocalDate.now())) {
				throw new DataFuturaException();
			}

			if (dataNascimento.isEqual(LocalDate.now())) {
				throw new DataFuturaException("Nasceu hoje foi?");
			}

		} catch (DateTimeParseException e) {
			System.out.println("Alguma coisa errada com a data ? " + e.getMessage());
		} catch (DataFuturaException e) {
			System.out.println("E agora o que eu errei ?" + e.getMessage());
		}

	}

	private void seraQuePrecisoUsarFinally(Pessoa pessoa) {

		try {
			System.out.println("Informe o nome da pessoa");
			pessoa.setNome(getEntrada().next());

			System.out.println("Informe a idade da pessoa");
			pessoa.setIdade(getEntrada().nextByte());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("Não é possivel utilizar métodos de um objeto que não foi instanciado");
		} finally {
			this.pessoa = new Pessoa();
		}

	}

	private void praticar() {
		System.out.println("Capturar nome e varias notas do aluno");
		System.out.println("A cada nota informada perguntar se deseja capturar outra");
		System.out.println(
				"Não pode informar uma nota menor que zero ou maior que 10, caso isso ocorra uma mensagem deve ser informada");
		System.out
				.println("A captura de informações nao pode quebrar, caso isso ocorra uma mensagem deve ser informada");
		System.out.println("=========================");
		System.out.println("Informar a média no final");

		System.out.println("Informe o nome do aluno");
		String nome = getEntrada().next();
		ArrayList<Float> notas = new ArrayList<>();
		float soma = 0;
		do {

			notas.add(capturarNota());
		} while (querContinuar());

		for (Float nota : notas) {
			System.out.println("Nota:" + nota);
			soma += nota;
		}
		System.out.println("Média do aluno " + nome + " = " + (soma / notas.size()));

	}

	private Float capturarNota() {
		Float nota = null;
		try {
			System.out.println("Informe a nota do aluno ");
			nota = getEntrada().nextFloat();

			if (nota < 0 || nota > 10) {
				throw new NotaForaDaMargemException();
			}
		} catch (InputMismatchException e) {
			System.out.println("Formato invalido para a nota do aluno");
		} catch (NotaForaDaMargemException e) {
			System.out.println(nota+" não parece ser uma nota válida: " + e.getMessage());
			nota=null;
		} catch (Exception e) {
			System.out.println("Erro inesperado: " + e.getMessage());
		} finally {
			if (nota == null) {
				System.out.println("Tente novamente a captura");
				setEntrada(new Scanner(System.in));
				return capturarNota();
			} else {
				System.out.println("Nota capturada com sucesso");
			}
		}

		return nota;
	}

	private boolean querContinuar() {
		System.out.println("Gostaria de capturar mais uma nota? (S/N)");
		return getEntrada().next().equalsIgnoreCase("s");
	}
}
