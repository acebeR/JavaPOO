
public class Math {
	public static float media(Crianca criancas[]){
		int i;
		int soma = 0;
		
		for (i = 0; i < criancas.length; i++) {
			soma += criancas[i].idade;
		}
		return soma/i;
	}
	public static int somarQtdSexo(Crianca criancas[],char sexo){
		int soma = 0;
		for (int i = 0; i < criancas.length; i++) {
			if(criancas[i].sexo == sexo){
				soma++;
			}
		}
		return soma;
	}
	public static int somarQtdCriancasIdade(Crianca criancas[],int idade){
		int soma = 0;
		for (int i = 0; i < criancas.length; i++) {
			if(criancas[i].idade == idade)
				soma++;
		}
		return soma;
	}
	
}


