/*
 * Aluna: Rebeca Divina   Matricula: UC15101831
 */
import java.util.Scanner;

/*
 *  O objetivo do programa é : Mostrar um menu e o usuário selecionará o 
 *  metodo que deseja usar;
*/
public class Exercicio2Aula2 {
	public static void main(String[] args) {
		
		int escolha = 0,numDado,expoente,tempo;
		boolean resposta;
		long fatorial;
		double juros,capitalInicial,taxaDeJuros,exponencial,base;
		char decisao;
	
		do{
			escolha = lerInt("Digite um dos numeros do menu para fazer o que deseja:\n(1) Numero Perfeito\n(2) Fatorial\n(3) Exponencial\n(4) Juros Compostos");
			
			switch(escolha){
				case 1:
					
					numDado = lerInt("Numero para saber se é perfeito:");
					resposta = isPerfeito(numDado);
					apresentar("Este numero e perfeito? "+resposta);
					
					break;
				case 2:
					
					numDado = lerInt("Um numero fatoria,por favor; ");
					fatorial = getFatorial(numDado);
					apresentar("O valor do fatorial: "+fatorial);
					
					break;
				case 3:
					
					base = lerDouble("Por favor digite o numero da Base:  ");
					expoente = lerInt("Expoente:  ");
					exponencial = exponencial(base,expoente);
					apresentar("Resultado do exponencial:"+exponencial);
					
					break;
				case 4:
				
					capitalInicial = lerDouble("Por favor digite o capital inicial:  ");
					taxaDeJuros = lerDouble("Por favor digite a taxa de juros :  ");
					tempo = lerInt("Por favor digite o tempo:  ");
					juros = JurosCompostos(capitalInicial,taxaDeJuros,tempo);
					apresentar("Resultado do juros:"+juros);
					break;
			}
			decisao = lerChar("Deseja continuar? (s)Para sim");
		}while(decisao == 'S');
		apresentar("Obrigado por usar meu programa!!");
	}
	
	/* 
	 * Objetivo: Retornar verdadeiro para um numero perfeito.
	 */

	public static boolean isPerfeito(int numDado){
		int divisor,resto,soma = 0;
		boolean duvida = true;

		for(divisor = 1;divisor < numDado;divisor++){
			resto = numDado % divisor;
			
			if(resto  == 0){
				soma = soma + divisor;		
			}  
		}
		if(soma == numDado){
			return duvida;
		}else{
			duvida = false;
			return duvida;
		}

	}
	/*
	 * Objetivo: Essa funcao retornará o resultado do valor que deseja fatoriar.
	 */

	public static long getFatorial(int numero){
		int auxiliar,resultado = 1;
		for(auxiliar = numero ;auxiliar != 0 ;auxiliar--){
			resultado = resultado * auxiliar;
		}	
		return resultado;
	}
	
	/*
	 * Objetivo: Simular o calculo da funcao exponencial
	 */

	public static double exponencial(double base,int expoente){
		double resposta = 1;
		int aux;

		if(base == 0){
			resposta = 0;
			return resposta;
		}
		for(aux = 0;aux < expoente;aux++){
			resposta = resposta * base;
		}	
		return resposta;
	}
	/*
	 * Objetivo: Calcular os juros compostos dos brasileiros.
	 */

	public static double JurosCompostos(double capitalInicial,double taxaDeJuros,int tempo){
		double montante,numAux,aux;
		numAux = 1 + taxaDeJuros;
		aux = exponencial(numAux,tempo);
		montante = capitalInicial * aux;
		return montante;

	}
	/*
	 * Objetivo: Ler um número inteiro.
	 */
	
	public static int lerInt() {
		return  new Scanner(System.in).nextInt();
	}
	/*
	 * Objetivo: Mostrar uma mensagem e ler um inteiro.
	 */
	
	public static int lerInt(String msg ) {
		System.out.println(msg);
		return lerInt();
	}
	/*
	 * Objetivo: Ler um numero double.
	 */
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	/*
	 * Objetivo: Mostrar uma mensagem e ler um double.
	 */
	public static double lerDouble(String msg ) {
		System.out.println(msg);
		return lerDouble();
	}
	/*
	 * Objetivo: Ler um caracter.
	 */
	public static char lerChar(){
		return new Scanner(System.in).next().toUpperCase().charAt(0);
	}
	/*
	 * Objetivo: Mostrar uma mensagem e ler um caracter.
	 */
	public static char lerChar(String msg){
		System.out.println(msg);
		return lerChar();
	}
	/*
	 * Objetivo: Apresentar uma mensagem desejada.
	 */
	
	public static void apresentar(String msg){
		System.out.println(msg);
	}
}


