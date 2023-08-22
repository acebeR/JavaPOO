
public class View {
	public static Senior cadastrarSenio(Senior s) {
		s.setNome(Leitor.lerString("Nome: "));
		s.setCpf(Leitor.lerString("CPF: "));
		s.setQtdCertifica�oes(Leitor.lerInt("Quantidade de certificacao: "));
		s.setQtdProjetos(Leitor.lerInt("Quantidades de projeto: "));
		return s;
	}
	public static Pleno  cadastrarPlenio(Pleno p) {
		p.setNome(Leitor.lerString("Nome: "));
		p.setCpf(Leitor.lerString("Cpf: "));
		//p.setSalario(Leitor.);
		p.setAnoConclusao(Leitor.lerInt("Ano de conclusao: "));
		p.setAnoTempoNaEmpresa(Leitor.lerInt("Quantidade de anos na empresa: "));
		return p;
	}
	public static void cadastrarProgramadores(Fabrica f){
		char r,p;
		Programador aux = new Programador();
		Senior auxS = new Senior();
		Pleno auxP = new Pleno();
		do{
			
			p = Leitor.lerChar("Seu programador � Pleno(P) ou Senior(S):\n->", "Op��o incorreta...", 'P', 'S');
			if(p == 'P'){
				aux = cadastrarPlenio(auxP);
			}else
				aux = cadastrarSenio(auxS);
			f.addProgramador(aux);
			r = Leitor.lerChar("Deseja continuar cadastrando Programadores? Sim(S) N�o(N)", "Olha algo est� errado!", 'S', 'N');
		}while(r == 'S');
	}
	public static void showProgramador(Fabrica f) {
		for (Programador prog : f.getProgramadores()) {
			System.out.println(prog.toString());
		}
	}
	public static void menu(Fabrica f){
		System.out.println("_____ Todods os Programadores_____");
		showProgramador(f);
		System.out.println("-----------------------------------------------------------------------------------\n" +
				"_______Programador com o Menor S�lario_____\n");
		System.out.println(f.getMaiorSalario().toString());
		System.out.println("________Programador com Maior sal�rio_____\n");
		System.out.println(f.getMaiorSalario().toString());
		
		System.out.println("\n-> Media dos Sal�rios dos Programadores = R$ "+ f.mediaSalarios());
		
	}
	
}
