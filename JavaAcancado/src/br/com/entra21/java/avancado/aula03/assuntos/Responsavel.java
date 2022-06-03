package br.com.entra21.java.avancado.aula03.assuntos;

/**
* Um TODO voltado para grupos
* de desenvolvedores, onde pode-se
* especificar a pessoa a quem se destina o item
*/
public @interface Responsavel {
	public enum OrdemPrioridade {
		CRITICO, IMPORTANTE, TRIVIAL, DOCUMENTAR
	};

	OrdemPrioridade ordemPrioridade() default OrdemPrioridade.IMPORTANTE;

	String item();

	String quemAssume();
}