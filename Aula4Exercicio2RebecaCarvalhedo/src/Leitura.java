import java.util.Scanner;

/**
 * 
 * @author Rebeca
 * Objetivo: Fazer metodos para ler e validar o que for pedido.
 */
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
	/*
	 * Objetivo: Ler um inteiro.
	 */

	public static int lerInt(){
		return new Scanner(System.in).nextInt();
	}
	/*
	 * Objetivo: Ler um inteiro e escrever um titulo.
	 */
	public static int lerInt(String texto){
		System.out.println(texto);
		return lerInt();
	}
	/*
	 * Objetivo: Ler um inteiro,escrever um titulo e validar o numero inteiro.
	 */
	public static int lerInt(String msg, int max, int min, String msgErro){
		int num;
		boolean check = true;

		num = lerInt(msg);
		check = num < min || num > max;
		if(check){
			System.out.println(msgErro);
			num = lerInt(msg, max, min, msgErro);
		}
		return num;
	}
	/*
	 * Objetivo: Ler um inteiro.
	 */

	public static float lerFloat(){
		return new Scanner(System.in).nextFloat();
	}
	/*
	 * Objetivo: Ler um inteiro e escrever um titulo.
	 */
	public static float lerFloat(String texto){
		System.out.println(texto);
		return lerFloat();
	}
	/*
	 * Objetivo: Ler um inteiro,escrever um titulo e validar o numero inteiro.
	 */
	public static float lerFloat(String msg, float max, float min, String msgErro){
		float num;
		boolean check = true;

		num = lerFloat(msg);
		check = num < min || num > max;
		if(check){
			System.out.println(msgErro);
			num = lerFloat(msg, max, min, msgErro);
		}
		return num;
	}




}

