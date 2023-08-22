import java.util.Scanner;
/**
 * 
 * @author Rebeca 
 * Objetivo: Fazer com que o usuário insira varios
 *         numeros doubles,enquanto o programa vai quardando os numeros na memoria de um vetor,
 *          sendo que este vetor nao tenha a quantidade no inicio,depois irá printar os valores 
 *          informados e a média.
 */
public class Exercicio3Aula3 {
	public static void main(String[] args){
		double vet[] = new double[1];
		int qtd = 0;
		double valor,media = 0;
		char resposta;
		
		do{
			valor = Leitura.lerDouble("Digite um valor:");
			resposta = Leitura.lerChar("Deseja continuar? (s) sim (Qulaquer letra) nao");

			vet = EspecificoDoProblema.retornarVetor(vet, qtd, valor);
			qtd++;
		}while(resposta == 'S');
		
		Leitura.printf("Valores Digitados:");
		
		for (int i = 0; i < vet.length; i++) {
			Leitura.printf("Valor " + (i+1) + " = " + vet[i]);
		}
		
		media = Math.calcularMedia(qtd, vet);
		Leitura.printf("\nMedia =  " + media);
	}
	
	
	
	
	
		
	
}
