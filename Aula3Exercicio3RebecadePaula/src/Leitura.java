import java.util.Scanner;

public class Leitura {
	/*
	 * Objetivo: Ler um caracter.
	 */
	public static char lerChar(){
		return new Scanner(System.in).next().toUpperCase().charAt(0);
	}
	/*
	 * Objetivo: Mostrar uma mensagem e ler um caracter.
	 */
	public static char lerChar(String msg){
		printf(msg);
		return lerChar();
	}
	
	/*
	 * Objetivo: Ler um número inteiro.
	 */
	
	public static double lerDouble() {
		return  new Scanner(System.in).nextDouble();
	}
	/*
	 * Objetivo: Mostrar uma mensagem e ler um inteiro.
	 */
	
	public static double lerDouble(String msg ) {
		printf(msg);
		return lerDouble();
	}
	/*
	 * Objetivo: Mostrar na tela o text desejado.
	 */
	public static void printf(String texto){
		System.out.println(texto);
	}
}	
