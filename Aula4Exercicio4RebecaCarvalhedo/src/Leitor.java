import java.util.Scanner;


public class Leitor {
	/*
	 * Objetivo: Ler um double.
	 */

	public static double lerDouble(){
		return new Scanner(System.in).nextDouble();
	}
	/*
	 * Objetivo: Ler um double e escrever um titulo.
	 */
	public static double lerDouble(String texto){
		System.out.println(texto);
		return lerDouble();
	}
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
		System.out.println(msg);
		return lerChar();
	}
	/*
	 * Objetivo: Mostrar uma mensagem e ler um caracter e validar se é M ou F.
	 */
	public static char lerChar(String msg,String msgErro,char caracter1,char caracter2){
		char auxCaracter;
		do{
			auxCaracter = lerChar(msg);
			if(auxCaracter != caracter1 && auxCaracter != caracter2)
				System.out.println(msgErro);
		}while(auxCaracter != caracter1 && auxCaracter != caracter2);

		return auxCaracter;
	}
	
	public static String lerString(){
		return new Scanner(System.in).nextLine();
	}
	public static String lerString(String msg){
		System.out.println(msg);
		return lerString();
	}
	
}
