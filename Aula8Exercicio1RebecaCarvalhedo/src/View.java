import java.util.Scanner;
public class View {
	
	public static int lerInt(){
		return new Scanner(System.in).nextInt();
	}
	
	public static int lerInt(String msg){
		System.out.println(msg);
		return lerInt();
	}
	
	public static String lerString(){
		return new Scanner(System.in).next().toString();
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
	
	public static char lerChar(String msg,char a,char b,String msgErro){
		char flag;
		
		do{
			flag = lerChar(msg);
			if(flag != a && flag != b){
				System.out.println(msgErro);
			}
		}while(flag != a && flag != b);
		return flag;
	}
	
	
	
}
