package desafios.desafio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int n;
		int valor;
		
		Scanner entrada = new Scanner (System.in);
        n = entrada.nextInt();
 
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
			valor = entrada.nextInt();
			if(valor%2==0) pares.add(valor);
			else impares.add(valor);
		}
        
        pares.sort((o1, o2) -> o1.compareTo(o2));
        impares.sort((o1, o2) -> o2.compareTo(o1));
        
        pares.forEach(System.out::println);
        impares.forEach(System.out::println);
        
        entrada.close();
	}
}
