package br.com.entra21.java.avancado.aula01.enuns;

public enum Esportes {
	BASQUETE("Pessoas altas tem vantagem aqui"), FUTEBOL("Esporte mais rent�vel"), VOLEI("tem um t�cnico surtado"),
	NATACAO("Aprenda a nadar antes");

	private final String valor;

	private Esportes(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return this.valor;
	}
}
