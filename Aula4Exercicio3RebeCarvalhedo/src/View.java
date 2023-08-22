
public class View {
	
	public static void mostrarMedia(float media){
		
		System.out.println("Media das Idades: "+media);
	}
	
	public static void mostrarQtdF(Crianca criancas[],int qtdMeninas){
		qtdMeninas = Math.somarQtdSexo(criancas, 'F');
		System.out.println("Quantidade de meninas: "+qtdMeninas);
	}
	public static void mostrarQtd10(Crianca criancas[],int criancasCom10){
		criancasCom10 = Math.somarQtdCriancasIdade(criancas, 10);
		System.out.println("Quantidade de criancas com 10: "+criancasCom10);
	}
}
