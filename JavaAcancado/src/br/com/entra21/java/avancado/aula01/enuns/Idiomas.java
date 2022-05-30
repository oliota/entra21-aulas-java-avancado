package br.com.entra21.java.avancado.aula01.enuns;

public enum Idiomas { 
		BRASIL("Português"), EUA("Inglês")  , ALEMANHA("Alemão") , ARGENTINA("Espanhol");
		

        private final String valor;
        private Idiomas(String valor) {
            this.valor = valor;
        }
 
        public String getValor() {
            return this.valor;
        } 
}
