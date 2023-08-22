
public class View {
	public static int menu(int min,int max){
		int resposta;
		do{
			
			System.out.println("0 - Sair" +
					"\n1 - Cadastrar Aluno " +
					"\n2 - Apresentar Todos " +
					"\n3 - Apresentar Aprovados " +
					"\n4 - Apresentar Reprovados " +
					"\n5 - Média da Turma " +
					"\n6 - Melhor Aluno " +
					"\n7 - Pior Aluno " +
					"\n8 - Percentual de Aprovados " +
					"\n9 - Quantidade de Aprovados" +
					"\n10 - Quantidade de Reprovados.");
			resposta = Leitura.lerInt();
		}while(resposta < min || resposta > max);
		return resposta;
	}
	public static void mostrarMedia(float media){
		System.out.println("Media da turma: "+media);
	}
	public static void mostrarMelhor(Aluno melhor) {
		System.out.println("Notas do melhor aluno: "+melhor.nota1+"/"+melhor.nota2);
		System.out.println("Media: "+melhor.media);
		
	}
	public static void mostrarPior(Aluno pior) {
		System.out.println("Notas do Pior aluno: "+pior.nota1+"/"+pior.nota2);
		System.out.println("Media: "+pior.media);
		
	}
	public static void mostrarPercentual(float percentual) {
		System.out.println("Percentual: "+percentual);
	}
	public static void mostrarQtdAprovados(int qtdA) {
		System.out.println("Quantidade de aprovados: "+qtdA);
	}
	public static void mostrarQtdReprvados(int qtdR) {
		System.out.println("Quantidade de reprovados: "+qtdR);

	}
	public static void mostrarFinal() {
		System.out.println("Obrigada por usar o meu programa: ");

	}
	
}
