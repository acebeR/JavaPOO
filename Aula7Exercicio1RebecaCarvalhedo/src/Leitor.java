import java.util.Scanner;

public class Leitor {
	
	public  char lerChar(){
		return new Scanner(System.in).next().toUpperCase().charAt(0);	
	}
	public  char lerChar(String msg){
		System.out.println(msg);
		return lerChar();
	}
	public  char lerChar(String msgErro,String msg,char a,char b){
		char c;
		do{
			c = lerChar(msg);
			if(c != a || c != b){
				System.out.println(msgErro);
			}
		}while(c != a || c != b);
		return c;
	}
	public  int lerInt(){
		return new Scanner(System.in).nextInt();
	}
	public  int lerInt(String msg){
		System.out.println(msg);
		return lerInt();
	}
	public  double lerDouble(){
		return new Scanner(System.in).nextDouble();
	}
	public  double lerDouble(String msg){
		System.out.println(msg);
		return lerDouble();
	}
	public String lerString(){
		return new Scanner(System.in).nextLine().toUpperCase();
	}
	public String lerString(String msg){
		System.out.println(msg);
		return lerString();
	}
}
