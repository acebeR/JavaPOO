import java.util.Scanner;
public class Leitor {
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
	
	public static String lerString(){
		return new Scanner(System.in).nextLine().toUpperCase();
	}
	public static String lerString(String msg){
		System.out.println(msg);
		return lerString();
	}
	
	public static char lerChar(){
		return new Scanner(System.in).next().toUpperCase().charAt(0);
	}
	public static char lerChar(String msg){
		System.out.println(msg);
		return lerChar();
	}
	public static char lerChar(String msg,String msgErro,char a,char b){
		char w;
		do{
			w = lerChar(msg);
			if(w != a && w != b){
				System.out.println(msgErro);
			}
		}while((w != a) && (w!= b));
		return w;
	}
	
}
