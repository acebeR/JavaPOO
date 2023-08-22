
public class Math {
	public static double calcularMedia(int qtd,double vet[]){
		double soma = 0;
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma/qtd;
	}
}
