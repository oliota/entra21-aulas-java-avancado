package br.com.entra21.java.avancado.aula01.wrappers;

public class Wrappers {

	public static void aprender() {
		
		System.out.println("As classes Wrapper são classes que possuem a implementação necessária para realizar casts primitivos de forma simples sem o uso do (cast_manual)");

		System.out.println("\n\n--------- NUMEROS INTEIROS ---------------------------");
		byte variavelByte = Byte.parseByte("127");
		System.out.println("Classe Byte com método parseByte recebe uma string como argumento e retorna um valor byte "
				+ variavelByte); 

		short variavelShort = Short.parseShort("12000");
		System.out.println("Classe Short com método parseShort recebe uma string como argumento e retorna um valor short "
				+ variavelByte);

		int variavelInt = Integer.parseInt("300000");
		System.out.println("Classe Integer com método parseInt recebe uma string como argumento e retorna um valor int "
				+ variavelByte);

		

		System.out.println("\n\n--------- NUMEROS REAIS ---------------------------");
		long variavelLong = Long.parseLong("400000000");
		System.out.println("Classe Long com método parseLong recebe uma string como argumento e retorna um valor long "
				+ variavelByte);

		float variavelFloat = Float.parseFloat("100.123");
		System.out.println("Classe Float com método parseFloat recebe uma string como argumento e retorna um valor float "
				+ variavelByte); 

		double variavelDouble = Double.parseDouble("123456.4321");
		System.out.println("Classe Double com método parseDouble recebe uma string como argumento e retorna um valor double "
				+ variavelByte);


		System.out.println("\n\n--------- caracter ---------------------------");
		char variavelChar = Character.valueOf('c');
		System.out.println("Classe Character com método valueOf recebe um char como argumento e retorna um valor char, (NEM PECISAVA NÉ?) "
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
					"Classe Boolean possui vários métodos que aceitam Strings ou ENUM e retorna valores booleanos, verifique com o debug o motivo do valor = "
							+ vetorPossivilidadesBooleans[logico]);
		}
	}

}
