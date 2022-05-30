package br.com.entra21.java.avancado.aula01.wrappers;

public class Wrappers {

	public static void aprender() {
		
		System.out.println("As classes Wrapper s�o classes que possuem a implementa��o necess�ria para realizar casts primitivos de forma simples sem o uso do (cast_manual)");

		System.out.println("\n\n--------- NUMEROS INTEIROS ---------------------------");
		byte variavelByte = Byte.parseByte("127");
		System.out.println("Classe Byte com m�todo parseByte recebe uma string como argumento e retorna um valor byte "
				+ variavelByte); 

		short variavelShort = Short.parseShort("12000");
		System.out.println("Classe Short com m�todo parseShort recebe uma string como argumento e retorna um valor short "
				+ variavelByte);

		int variavelInt = Integer.parseInt("300000");
		System.out.println("Classe Integer com m�todo parseInt recebe uma string como argumento e retorna um valor int "
				+ variavelByte);

		

		System.out.println("\n\n--------- NUMEROS REAIS ---------------------------");
		long variavelLong = Long.parseLong("400000000");
		System.out.println("Classe Long com m�todo parseLong recebe uma string como argumento e retorna um valor long "
				+ variavelByte);

		float variavelFloat = Float.parseFloat("100.123");
		System.out.println("Classe Float com m�todo parseFloat recebe uma string como argumento e retorna um valor float "
				+ variavelByte); 

		double variavelDouble = Double.parseDouble("123456.4321");
		System.out.println("Classe Double com m�todo parseDouble recebe uma string como argumento e retorna um valor double "
				+ variavelByte);


		System.out.println("\n\n--------- caracter ---------------------------");
		char variavelChar = Character.valueOf('c');
		System.out.println("Classe Character com m�todo valueOf recebe um char como argumento e retorna um valor char, (NEM PECISAVA N�?) "
				+ variavelByte);


		System.out.println("\n\n--------- logico ---------------------------");
		boolean vetorPossivilidadesBooleans[] = {
				//utilizando vetor para mostrar mais exemplos
				Boolean.parseBoolean("true"), // true
				Boolean.parseBoolean("TRUE"), // true
				Boolean.parseBoolean("tRuE"), // true
				Boolean.parseBoolean("tru"), // false
				Boolean.parseBoolean("1"), // false
				Boolean.valueOf("TRUE"), // true
				Boolean.valueOf("true"), // true
				Boolean.TRUE // true
		};
		for (int logico = 0; logico < vetorPossivilidadesBooleans.length; logico++) {
			System.out.println(
					"Classe Boolean possui v�rios m�todos que aceitam Strings ou ENUM e retorna valores booleanos, verifique com o debug o motivo do valor = "
							+ vetorPossivilidadesBooleans[logico]);
		}
	}

}
