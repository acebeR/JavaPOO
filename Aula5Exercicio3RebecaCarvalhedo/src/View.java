
public class View {
	
	public static Prefeitura lerDados(){
		Habitante habitantes;
		
		Prefeitura prefeitura = new Prefeitura(); 
		char resposta;
		System.out.println("*===================Prefeito====================*\n");
		prefeitura.prefeito = lerPrefeito();
		
		do{
			System.out.println("\n*=======================================*");
			habitantes = lerHabitante();
			System.out.println("\n*=======================================*");
			prefeitura.retornarVetor(habitantes);
			resposta = Leitor.leChar("Deseja continuar cadastrando?");
		}while(resposta == 'S');
		
		
		return prefeitura;
	}
	
	public static Habitante lerHabitante(){
		Habitante h = new Habitante(); 
		h.idade = Leitor.leInt("Idade: ");
		h.salario = Leitor.leDouble("Salario: ");
		h.qtdfilhos = Leitor.leInt("Quantidade de filhos:");
		h.sexo = Leitor.leChar("Sexo (M)Masc (F)Fem: ", "Invalido...", 'M', 'F');
		return h;
	}
	
	public static Prefeito lerPrefeito(){
		Prefeito p = new Prefeito();
		p.nome = Leitor.leString("Nom do prefeito: ");
		p.partido = Leitor.leString("Partido: ");
		
		return p;
	}
	
	public static void mostrarDados(Prefeitura p){
		System.out.println("*===============*Dados da Pesquisa*===============*");
		System.out.println("Menor idade: "+p.menorIdade());
		System.out.println("Média do número de filhos: "+Math.media(p.somaNroFilhos(), p.habitantes.length));
		System.out.println("Média do salário das pessoas registradas: "+p.getMediaSalario());
		System.out.println("Média dos homens com salário superior a R$300,00: " + Math.media(p.contaSexoSalario(300, 'M'), p.somaSexoQtd(300, 'M')));
		System.out.println("Quantidade de pessoas que tem salário maior que a média de todas as pessoas pesquisadas: " + Math.media(p.somaSalarioAcima(p.getMediaSalario()), p.somaQtdAcima(p.getMediaSalario())));
		System.out.println("---- Todos os dados da Prefeitura ----- \nNome do prefeito: "+p.prefeito.nome);
		System.out.println("Partido: "+p.prefeito.partido);
		exibeHabitantes(p.habitantes);
		
	}
	
	public static void exibeHabitantes(Habitante[] h){
		for (int i = 0; i < h.length; i++) {
			System.out.println("\n*=====================" + (i + 1) + "º Habitante=====================*");
			System.out.println("Salario: " +h[i].salario);
			System.out.println("Idade: " +h[i].idade);
			System.out.println("Numero de filhos: " +h[i].qtdfilhos);
			System.out.println("Sexo: " +h[i].sexo);
			
		}
	}
}
