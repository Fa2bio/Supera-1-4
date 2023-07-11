package desafios.desafio04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt();
		clearBuffer(entrada);
		ArrayList<String> escopo = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String frase = entrada.nextLine();
		
			StringBuilder frase1 = new StringBuilder(frase
				.substring(0, frase.length()/2));
		
			StringBuilder frase2 = new StringBuilder(frase
				.substring(frase.length()/2, frase.length()));
		
			frase1.reverse();
			frase2.reverse();
		
			escopo.add(frase1.toString() + frase2.toString());
		}
    
		escopo.forEach(System.out::println);
		entrada.close();
	}

	static void clearBuffer(Scanner entrada) {
		if(entrada.hasNextLine()) entrada.nextLine();
	}
}
