
public class Menu {

	public static void apresentarTodosOsAlunos(Aluno alunos[]){
		for (int i = 0; i < alunos.length; i++) {

			System.out.println("Nota 1"+" do aluno"+(i+1)+": "+alunos[i].nota1);
			System.out.println("Nota 2"+" do aluno"+(i+1)+": "+alunos[i].nota2);

			System.out.println("Faltas do aluno"+(i + 1)+": "+alunos[i].faltas);
			System.out.println("Media do aluno "+(i + 1)+": "+alunos[i].media+"\n");

		}
	}

	public static int aprovados(Aluno[] alunos){
		int i,qtdA = 0;
		for ( i = 0; i < alunos.length; i++) {
			if((alunos[i].media >= 7) && (alunos[i].nota2 > 4)){
				qtdA++;
			}
		}
		return qtdA;

	}
	public static void mostrarAprovados(Aluno[] alunos){
		for (int i = 0; i < alunos.length; i++) {
			if((alunos[i].media >= 7) && (alunos[i].nota2 > 4)){
				System.out.println("Aluno "+i+" !!APROVADO!!");
				System.out.println("Notas: "+alunos[i].nota1+"\n"+alunos[i].nota2+"");
				System.out.println("Faltas:"+alunos[i].faltas);
				System.out.println("Media do aluno "+(i + 1)+": "+alunos[i].media+"\n");
			}
		}
	}
	public static int reprovados(Aluno[] alunos){
		int i,soma = 0;

		for (i = 0; i < alunos.length; i++) {
			if(alunos[i].media < 7){
				soma++;
			}
		}
		return soma;
	}
	public static void mostrarReprovados(Aluno[] alunos){
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i].media < 7){
				System.out.println("Aluno "+i+" !!REPROVADO!!");
				System.out.println("Notas: "+alunos[i].nota1+"\n"+alunos[i].nota2+"");
				System.out.println("Faltas:"+alunos[i].faltas);
				System.out.println("Media do aluno "+(i + 1)+": "+alunos[i].media);
			}
		}
	}
	public static float mediaDaTurma(Aluno[] alunos){
		int j;
		float soma = 0;
		for (j = 0; j < alunos.length; j++) {
			soma += alunos[j].media;
		}
		return soma/j;
	}

	public static Aluno melhorAluno(Aluno[] alunos){
		Aluno melhor = new Aluno(); 
		melhor = alunos[0];
		for (int i = 0; i < alunos.length; i++) {
			if(melhor.media < alunos[i].media){
				melhor = alunos[i];
			}else
				melhor = melhor;
		}
		return melhor;
	}
	public static Aluno piorAluno(Aluno[] alunos){
		Aluno pior = new Aluno(); 
		pior = alunos[0];
		for (int i = 0; i < alunos.length; i++) {
			if(pior.media > alunos[i].media){
				pior = alunos[i];
			}else
				pior = pior;
		}
		return pior;
	}

	public static float percentualDeAprovados(Aluno[] alunos,int qtdAprovado){
		float mul = qtdAprovado*100;
		return mul/alunos.length;
	}
}
