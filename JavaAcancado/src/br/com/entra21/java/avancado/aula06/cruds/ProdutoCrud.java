package br.com.entra21.java.avancado.aula06.cruds;

import br.com.entra21.java.avancado.aula03.anotacoes.InProgress;
import br.com.entra21.java.avancado.aula03.anotacoes.Responsavel;

public class ProdutoCrud {

	@InProgress
	@Responsavel(
			ordemPrioridade = Responsavel.OrdemPrioridade.CRITICO,
			item = "Exercitar o conteito de interface generica",
			quemAssume = "Alunos"
			)
	public void gerenciar() {
		System.out.println("Esperando vc implementar...");
	}
	
	


	

}
