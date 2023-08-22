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
	public static double lerDouble(){
		return new Scanner(System.in).nextDouble();
	}
	public static double lerDouble(String msg){
		System.out.println(msg);
		return lerDouble();
	}
	public static String lerTexto(){
		return new Scanner(System.in).nextLine().toUpperCase();
	}
	public static String lerTexto(String msg){
		System.out.println(msg);
		return lerTexto();
	}
}
