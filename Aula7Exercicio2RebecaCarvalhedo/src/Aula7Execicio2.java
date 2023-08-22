/**
 * Aluna: Rebeca Carvalhedo
 * Exercicio: O casamento tem movimentado milhões anualmente nos vários estados do país.
	 * Uma grande empresa do ramo deseja realizar uma melhor gestão dos serviços prestados 
	 * através do sistema desenvolvido em Java. Um serviço tem descrição, dia, preço, 
	 * tamanho da equipe e o tipo do serviço (Fotografia ou Filmagem). 
	 * Fazendo uso da estrutura Array, receba os dados de vários serviços enquanto o usuário 
	 * desejar. Sabe-se que um serviço para ser criado deve conter ao menos a descrição e o preço.
	 * Na sua aplicação, exceto o método main, não pode conter métodos
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
