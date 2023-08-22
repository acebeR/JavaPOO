import java.util.InputMismatchException;
import java.util.Scanner;
public class Leitor {
	
	
	
	public static char lerChar(){
		return new Scanner(System.in).next().toUpperCase().charAt(0);
	}
	public static char lerChar(String msg){
		System.out.println(msg);
		return lerChar();
	}
	public static char lerChar(String msg,String msgErro,char a,char b){
		char r;
		do{
			r = lerChar(msg);
			if(r != a && r != b){
				System.out.println(msgErro);
			}
		}while(r != a && r != b);
		return r;
	}
	
	public static int lerInt(){
		return new Scanner(System.in).nextInt();
	}
	public static int lerInt(String msg){
		System.out.println(msg);
		return lerInt();
	}
	public static int lerInt(String msg,int max,int min){
		int aux = 0;
		boolean erro;
		do{
			try{
				erro = false;
				aux = lerInt("Numero de filiação: ");
			}catch(InputMismatchException ex){
				System.out.println("Você clicou letras tem que ser números!");
				erro = true;
			}
		}while(erro && aux < min || aux > max);
		return aux;
		
	}
	
	public static String lerString(){
		return new Scanner(System.in).nextLine().toUpperCase();
	}
	public static String lerString(String msg){
		System.out.println(msg);
		return lerString();
	}
	
	
	
}
