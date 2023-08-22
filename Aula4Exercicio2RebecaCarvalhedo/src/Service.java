
public class Service {
	public static float media(Aluno aluno,int qtd){
		float soma = 0;

		soma = (aluno.nota1 + aluno.nota2);
		return soma/qtd;


	}

	public static Aluno[] retornarVetor(Aluno[] alunos,Aluno aluno){
		Aluno aux[] = new Aluno[alunos.length + 1];

		for (int i = 0; i < alunos.length; i++) {
			aux[i] = alunos[i];
		}

		aux[alunos.length] = aluno;

		return aux;
	}

	public static Aluno popular(Aluno aluno) {
		aluno.nota1 = Leitura.lerFloat("Nota 1: ");
		aluno.nota2 = Leitura.lerFloat("Nota 2: ");
		aluno.media = Service.media(aluno,2);
		aluno.faltas = Leitura.lerInt("Faltas: ");
		return aluno;
	}
	

}
