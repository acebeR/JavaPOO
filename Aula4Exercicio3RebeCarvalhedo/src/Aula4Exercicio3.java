/**
 * 
 * @author Rebeca Carvalhedo
 * Receba do usu�rio a quantidade de crian�as de um orfanato e receba seus dados (sexo e idade) 
 * e apresente a m�dia das idades, a quantidade de meninas, quantas crian�as possuem 10 anos.
 */
public class Aula4Exercicio3 {
	public static void main(String[] args){
		int qtdCriancas = 0;
		qtdCriancas = Leitor.lerInt("Quantidade de criancas: ", 1000, 1, "Quantidade invalida!");
		
		Crianca[] criancas = new Crianca[qtdCriancas];
		for (int i = 0; i < criancas.length; i++) {
			criancas[i] = new Crianca();
		}
		Service.encrementarVetor(criancas);
		float media = Math.media(criancas);
		View.mostrarMedia(media);
		int qtdMeninas = 0;
		View.mostrarQtdF(criancas, qtdMeninas);
		int criancasCom10 = 0;
		View.mostrarQtd10(criancas, criancasCom10);
		
		
	}
}