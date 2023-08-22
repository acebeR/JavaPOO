/**
 * 
 * @author Rebeca Carvalhedo 
 * Um piloto tem nome, escuderia e tempo de volta. Faça um programa Java que receba os dados dos pilotos de uma corrida. Ao final mostre o seguinte:

                    A - O piloto mais rápido.

                    B - O piloto mais lento.

                    C - A Média dos tempos.

                    D - Todos os pilotos ordenados pelo tempo. (Use o bubblesort)
 */

public class Aula4Exercicio4 {
	public static void main(String[] args){
		Piloto[] pilotos = new Piloto[0];
		char resposta;
		
		
		do{
			Piloto piloto = new Piloto();
			
			View.popular(piloto);
					
			pilotos = EspecificoDoPrograma.retornaVetorDeStruct(pilotos, piloto);
			
			resposta = Leitor.lerChar("Deseja continuar? (S)sim (N)nao", "Informacao incorreta!", 'S', 'N');
		}while(resposta == 'S');
		
		Menu.menu(pilotos);
	}
}

