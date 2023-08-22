import java.util.Scanner;

public class Leitor {
	
	
	public static double leDouble (){
		return new Scanner(System.in).nextDouble();
	}
	
	public static double leDouble(String msg){
		System.out.println(msg);
		return leDouble();
	}
	
	public static double leDouble(String msgInfo, String msgErro, double min) {
		double valor;
		boolean check;
	
		do{
			valor = leDouble(msgInfo);
			check = valor < min;
			if(check){
				System.out.println(msgErro + "\n");
			}
		}while(check);
		return valor;
	}
	
	public static double leDouble(String msgInfo, String msgErro, double min, double max) {
		double valor;
		boolean check;
		
		do{
			valor = leDouble(msgInfo);
			check = valor < min || valor > max;
			if(check){
				System.out.println(msgErro + "\n");
			}
		}while(check);//teste == true
		return valor;
	}
	//========================================================================================================

	public static int leInt(String msgInfo, String msgErro, int min) {
		int valor;
		boolean check;
			
		do{
			valor =leInt(msgInfo);
			check = valor < min;
			if(check){
				System.out.println(msgErro + "\n");
			}
		}while(check);//teste == true
		return valor;
	}
	
	public static int leInt(String msgInfo, String msgErro, int min, int max) {
		int valor;
		boolean check;
					
		do{
			valor = leInt(msgInfo);
			check = valor < min || valor > max;
			if(check){
				System.out.println(msgErro + "\n");
			}
		}while(check);
		return valor;
	}
	
	
	public static int leInt(){
		return new Scanner(System.in).nextInt();
	}
	
	public static int leInt(String msg){
		System.out.println(msg);
		return leInt();
	}
	//========================================================================================================
	public static char leChar (String msgInfo, String msgErro, char opcao1, char opcao2){
		char caracter;
		boolean check;
		do{
			System.out.println(msgInfo);
			caracter = leChar();
			
			check = (caracter != opcao1 && caracter != opcao2);
			
			if(check)
				System.out.println(msgErro + "\n");
		}while(check);
		
		return caracter;
	}
	
	
	public static char leChar(String msg){
		System.out.println(msg);
		return leChar();
	}
	

	public static char leChar(){
		return new Scanner(System.in).next().toUpperCase().charAt(0);
	}
	//========================================================================================================
	public static String leString(String msg){
		System.out.println(msg);
		return leString();
	}

	public static String leString(){
		return new Scanner(System.in).next();
	}
	
}