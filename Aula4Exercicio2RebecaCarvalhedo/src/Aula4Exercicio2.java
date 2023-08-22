/**
 * 
 * @author Rebeca Carvalhedo
 * 
 */

public class Aula4Exercicio2 {
	public static void main(String[] args){
		Aluno[] alunos = new Aluno[0];
		char op;
		int resposta,qtdR = 0,qtdA = 0;

		do{
			resposta = View.menu(0, 10);
			switch(resposta){
			case 1:	
				float nota1, nota2;
				int faltas;
				Aluno aluno = new Aluno();
				aluno = Service.popular(aluno);
				alunos = Service.retornarVetor(alunos, aluno);
				break;
			case 2:	
				Menu.apresentarTodosOsAlunos(alunos);
				break;
			case 3:	
				Menu.mostrarAprovados(alunos);
				break;
			case 4:	
				Menu.mostrarReprovados(alunos);
				break;
			case 5:	
				float mediaDaTurma = Menu.mediaDaTurma(alunos);
				View.mostrarMedia(mediaDaTurma);
				break;
			case 6:	
				Aluno melhor = new Aluno();
				melhor = Menu.melhorAluno(alunos);
				View.mostrarMelhor(melhor);
				break;
			case 7:	
				Aluno pior = new Aluno();
				pior = Menu.piorAluno(alunos);
				View.mostrarPior(pior);
				break;
			case 8:	
				float percentual;
				percentual = Menu.percentualDeAprovados(alunos,qtdA);
				View.mostrarPercentual(percentual);
				break;
			case 9:	
				View.mostrarQtdAprovados(qtdA);
				break;
			case 10:	
				View.mostrarQtdReprvados(qtdR);
				break;
			case 0:	
				View.mostrarFinal();
				break;
			}
			qtdA = Menu.aprovados(alunos);
			qtdR = Menu.reprovados(alunos);
			op = Leitura.lerChar("Deseja continuar? (S)Sim (N)Nao","Caracter invalido", 'S', 'N');
		}while(op == 'S');

	}


}
