/**
 * Aluna: Rebeca Carvalhedo
 * Exercicio: O casamento tem movimentado milh�es anualmente nos v�rios estados do pa�s.
	 * Uma grande empresa do ramo deseja realizar uma melhor gest�o dos servi�os prestados 
	 * atrav�s do sistema desenvolvido em Java. Um servi�o tem descri��o, dia, pre�o, 
	 * tamanho da equipe e o tipo do servi�o (Fotografia ou Filmagem). 
	 * Fazendo uso da estrutura Array, receba os dados de v�rios servi�os enquanto o usu�rio 
	 * desejar. Sabe-se que um servi�o para ser criado deve conter ao menos a descri��o e o pre�o.
	 * Na sua aplica��o, exceto o m�todo main, n�o pode conter m�todos
 */
import java.io.ObjectInputStream.GetField;


public class Aula7Execicio2 {
	public static void main(String[] args) {
		View view = new View();
		Gerencia g = new Gerencia();
		view.popular(g);
		view.menu(g);
	}
}
