package br.com.entra21.java.avancado;

import java.util.ArrayList;
import java.util.Arrays;

public class BocaSujaUtils {

	
	public static ArrayList<String> palavroes=new ArrayList<>(Arrays.asList("$%¨$¨%","*****"));
	
	public void inicializarPalavroes() {
		palavroes.add("p******");
		palavroes.add("f2ewrf***");
		palavroes.add("v23rv23****");
	}
	
	public static boolean podeIssoArnaldo(String suspeita) {
		
		for (String palavrao : palavroes) {
			if(suspeita.equalsIgnoreCase(palavrao)) {
				return false;
			}
		}
		
		
		return true;
	}
}
