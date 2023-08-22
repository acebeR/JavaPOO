
public class EspecificoDoProblema {
	public static double[] retornarVetor(double vet[],int qtd,double valor){
		double auxVet[] = new double[qtd + 1];
		
		auxVet[qtd] = valor;
		for (int i = 0; i < qtd; i++) {
			
			auxVet[i] = vet[i];	
			
		}
		
		return auxVet;
		
	}
}
