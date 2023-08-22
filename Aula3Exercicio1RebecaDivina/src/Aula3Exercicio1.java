import java.util.Scanner;
/*
 * Objetivo: Ler 100 numero do usuário depois apresentar a media e o maior valor informado. 
 */

public class Aula3Exercicio1 {
	public static void main(String[] args){
		int max = 3;
		int[] valores = new int[max];
		int soma = 0,aux1;
		double media;
		
		
		
		
		for(aux1 = 0;aux1 < valores.length ;aux1++ ){
			System.out.println("Digite um numero:");
			valores[aux1] = new Scanner(System.in).nextInt();
			
			
		}
		
		
		for(int aux = 0;aux < valores.length; aux++){
			soma += valores[aux];
			
		}
		
		media = media(soma,aux1);
		System.out.println(media);
		
		int maior = 0;
		
		for (int i = 0; i < valores.length; i++) {
			if(maior < valores[i]){
				maior = valores[i];
			}
		}
		
		
	}
	
	public static double media(int soma,int aux){
		double media;
		media = (double)soma/aux;
		return media;
	}
	
}
