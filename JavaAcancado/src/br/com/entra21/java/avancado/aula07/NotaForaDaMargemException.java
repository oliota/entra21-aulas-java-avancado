package br.com.entra21.java.avancado.aula07;

public class NotaForaDaMargemException extends Exception{
	
	public NotaForaDaMargemException() {
		super("Uma nota n�o pode ser menor que 0 nem maior que 10");
	}
	
	public NotaForaDaMargemException(String mensagem) {
		super(mensagem);
	}

}
