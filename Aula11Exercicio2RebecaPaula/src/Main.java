
public class Main {
	public static void main(String[] args) {
		Fabrica f = new Fabrica();
		
		View.cadastrarProgramadores(f);
		View.menu(f);
	}
}
