import java.util.Scanner;
public class Leitor {
	public char LerChar(){
		return new Scanner(System.in).next().toUpperCase().charAt(0);
	}
	public char Lerchar(String msg){
		System.out.println(msg);
		return LerChar();
	}
	public int LerInt(){
		return new Scanner(System.in).nextInt();
	}
	public int LerInt(String msg){
		System.out.println(msg);
		return LerInt();
	}
	public double LerDouble(){
		return new Scanner(System.in).nextDouble();
	}
	public double LerDouble(String msg){
		System.out.println(msg);
		return LerDouble();
	}
	public String lerString(){
		return new Scanner(System.in).nextLine().toUpperCase();
	}
	public String lerString(String msg){
		System.out.println(msg);
		return lerString();
	}
}
