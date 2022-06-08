package br.com.entra21.java.avancado.aula06;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;
import br.com.entra21.java.avancado.aula06.cruds.PessoaCrud;
import br.com.entra21.java.avancado.aula06.cruds.ProdutoCrud;

public class Aula06 extends Aula {

	public static HashMap<String, Pessoa> pessoas = new HashMap<>();

	public Aula06(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();
		switch (opcao) {
		case 1:
			aprenderGenerics();
			break;
		case 2:
			praticarUso();
			break;
		}
		return opcao;
	}

	private void aprenderGenerics() {
		System.out.println("Criar uma interface para a��es de um CRUD que se repetem em todos os CRUD");
		System.out.println("Cada crud gerencia um collection ou modelo diferente e interfaces simples n�o resolveriam");
		System.out.println("Na declara��o da interface informe <LETRA_AQUI> para informar que:");
		System.out.println("Sempre que LETRA_AQUI foi declarada na interface considere como TIPO_DESCONHECIDO");
		System.out.println("Nas classes que implementarem a interface utilize");
		System.out.println("implements IMinhaInterface<SUA_CLASSE_OU_TIPO_AQUI>");
		System.out.println(
				"Ao solicitar que gere os m�todos automaticamente eles ser�o criados j� com o tipo solicitado");
	}

	private void praticarUso() {
		byte opcao;

		do {

			System.out.println("0 - VOLTAR");
			System.out.println("1 - gerenciar pessoas");
			System.out.println("2 - gerenciar produtos");
			opcao = getEntrada().nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo dos CRUDS...");
				break;
			case 1:
				new PessoaCrud().gerenciar();
				break;
			case 2:
				new ProdutoCrud().gerenciar(); 
				break;

			default:
				System.out.println("N�o � um op��o v�lida");
				break;
			}

		} while (opcao != 0);

	}

}
