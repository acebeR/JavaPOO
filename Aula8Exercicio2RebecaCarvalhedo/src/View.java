import java.io.ObjectInputStream.GetField;


public class View {
	private static final int MAXMES = 12;
	private static final int MINMES = 1;
	private static final int MAXDIA = 30;
	private static final int MINDIA = 1;

	public static Servico cadastrServico(Servico s){
		char r;
	
		s.setDescricao(Leitor.lerTexto("Descricao: "));
		s.setPreco(Leitor.lerDouble("Preco: "));
		r = Leitor.lerChar("Deseja continar  o cadastro(Voce pode parar por aqui)?(S)sim (N)nao","Opcao Invalida",'S','N');
		if(r == 'S'){
			do{
				s.getData().setDia(Leitor.lerInt("Dia: "));
				if(s.getData().isVerificaDia(MINDIA, MAXDIA) == false){
					System.out.println("Dia invalido!!");
				}
			}while(s.getData().isVerificaDia(MINDIA, MAXDIA) == false);
			
			do{
				s.getData().setMes(Leitor.lerInt("Mes: "));
				if(s.getData().isVerificaMes(MINMES, MAXMES) == false){
					System.out.println("Mes incorreto!!");
				}
			}while(s.getData().isVerificaMes(MINMES, MAXMES) == false);
			s.getData().setAno(Leitor.lerInt("Ano: "));
			s.setTamEquipe(Leitor.lerInt("Tamanho da equipe: "));
			s.setTipo(Leitor.lerChar("Tipo do servico /n(F)Fotografia (V)Filmagem", "Opcao incorreta!", 'F', 'V'));
		}
		
		return s;
	}

	public static void popularServicos(Empresa e){
		char r;
		System.out.println("      __ Cadastro ___");
		do{
			Servico temp = new Servico();
			temp = cadastrServico(temp);
			e.addServico(temp);
			r = Leitor.lerChar("Deseja continuar cadastrando? (S)sim (N)nao", "Op incorreta!!", 'S', 'N');
		}while(r == 'S');
	}
	public static void mostrarServico(Servico s){
		System.out.println("Descricao: "+s.getDescricao());
		System.out.println("Preco: "+s.getPreco());
		if(s.getTipo() == 'V'){
			System.out.println("Preco Modificado: "+s.precoModificado(s.getTipo()));
		}else
			System.out.println("Preco Modificado: "+s.precoModificado(s.getTipo()));

		System.out.println("Tamanho da equipe:"+s.getTamEquipe());
		System.out.println("Tipo do Servico"+tipoServico(s.getTipo()));
		System.out.println(s.getData().getDia()+" / "+s.getData().getMes()+" / "+s.getData().getAno());
	}

	public static String tipoServico(char a){
		if(a == 'F'){
			return "Fotografia";
		}
		return "Fimagem";
	}
	public static void mostrarServicosTipo(char tipoS,Empresa e){
		mostrarServicos(e.getServicosTipo(tipoS));
	}
	public static void mostrarServicoExisteTexto(String texto,Empresa e){
		mostrarServicos(e.getServicoTexto(texto));
	}
	public static void mostrarServicos(Servico[] servicos){
		for (Servico temp : servicos) {
			mostrarServico(temp);
			System.out.println("\n");
		}
	}
	public static void menu(Empresa empresa){
		char r,s;
		do{
			cabecalho();
			r = Leitor.lerChar("Escolha: ");
			switch(r){
			case 'A':
				System.out.println("___Servicos___");
				View.mostrarServicos(empresa.getServicos());
				break;
			case 'B':
				System.out.println("___ Mais caro ____");
				View.mostrarServico(empresa.maisCaro());
				break;
			case 'C':
				System.out.println("Quantidade de Filmagens: "+empresa.getQtdTipo('V'));
				break;
			case 'D':
				System.out.println("___Servicos com o tipo Filmagem ____");
				View.mostrarServicosTipo('F', empresa);
				break;
			case 'E':
				System.out.println("____Descricao com Save Date ____");
				View.mostrarServicoExisteTexto("SAVE DATE", empresa);
				break;
			}
			s = Leitor.lerChar("Deseja continuar vendo? (S)sim (N)nao\n->", "Opcao incorreta!!", 'S', 'N');
		}while(s == 'S');
	}
	public static void cabecalho(){
		System.out.println("(a) Todos os dados de todos os serviços.\n" +
				"(b) O serviço mais caro.\n" +
				"(c) Quantidadde que contem tipo Filmagem .\n" +
				"(d) Serviços do tipo Fotografia.\n" +
				"(e) Apresente as descrição com SAVE DATE\n");
	}
}
