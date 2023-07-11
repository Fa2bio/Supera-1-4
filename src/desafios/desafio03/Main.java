package desafios.desafio03;

public class Main {
	
	public static void main(String[] args) {
		
		int tamanho=4;
		int k=1;
		int hit = 0;
		
        int[] arr = {1,2,3,4};
        
        for (int i = 0; i < tamanho-1; i++) {
        	int temp=i;
			temp=arr[++temp];
			if(Math.abs(temp-arr[i]) == k) hit++;
		}
       System.out.println(hit);
       
	}
}
