package desafios.desafio02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
        int[] cedulas = {100,50,20,10,5,2};
        double[] moedas = {1,0.50,0.25,0.10,0.05,0.01};
        int[] qtdCedulas = new int[6];
        int[] qtdMoedas = new int[6];
        double valor;
      
		Scanner entrada = new Scanner (System.in);
        valor = entrada.nextDouble();
        
        System.out.println("NOTAS:");
        for (int i=0; i<6 ; i++){
            if (valor >= cedulas[i]){
                qtdCedulas[i] = (int) (valor/cedulas[i]);
                valor = valor%cedulas[i];
            }
            System.out.println(qtdCedulas[i]+" nota(s) de R$ "+cedulas[i]+".00");
        }
        
        System.out.println("MOEDAS:");
        for(int i=0;i<6;i++) {
            if (valor >= moedas[i]){
            	qtdMoedas[i] = (int) (valor/moedas[i]);
                valor = valor%moedas[i];
            }
            System.out.println(qtdMoedas[i]+" moeda(s) de R$ "+String.format("%.2f",moedas[i]).replace(",", "."));
        }
        
        entrada.close();
	}
}
