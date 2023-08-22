import java.io.ObjectInputStream.GetField;


public class View {
	public static Iten popularIten(Iten i){
		
		i.setCodigo(Leitor.lerInt("Codigo: "));
		i.setDescricao(Leitor.lerString("Descricao: "));
		i.setPreco(Leitor.lerDouble("Preco: "));
		i.setTipo(Leitor.lerChar("Tipo: tecnologia(T) Outros(O)", "Opçao incorreta!", 'T', 'O'));
		return i;
	}
	public static void popularItens(Laboratorio l){
		char r;
		System.out.println("____ Cadastrando Itens ______");
		do{
			Iten temp = new Iten();
			temp = popularIten(temp);
			l.addIten(temp);

			r = Leitor.lerChar("Deseja continuar a cadastrar Itens? (S)sim (N)nao", "Opcao invalida!", 'N', 'S');
		}while(r == 'S');
	}
	public static Laboratorio popularLaboratorio(Laboratorio l){
		l.setLocal(Leitor.lerString("Local: "));
		System.out.println("___ Cadastro Responsavel____");
		popularResponsavel(l.getResponsavel());
		popularItens(l);
		return l;
	}
	public static void popularlaboratorios(Ucb ucb){
		char r;
		System.out.println("___ Cadastro do Laboratorio_____");
		do{
			Laboratorio temp = new Laboratorio();
			temp = popularLaboratorio(temp);
			ucb.addLaboratorio(temp);

			r = Leitor.lerChar("Deseja continuar a cadastrar Laboratorios? (S)sim (N)nao", "Opcao invalida!", 'N', 'S');
		}while(r == 'S');
	}
	public static Responsavel popularResponsavel(Responsavel r){
		r.setNome(Leitor.lerString("Nome: "));
		r.setCargo(Leitor.lerChar("Cargo: (T) Tecnico (A) Analista", "Opcao incorreta!!", 'T', 'A'));
		r.setMatricula(Leitor.lerString("Matricula: "));

		return r;
	}
	public static void apresentarIten(Iten i){
		System.out.println("Codigo: "+i.getCodigo());
		System.out.println("Descricao: "+i.getDescricao());
		System.out.println("Preco: "+i.getPreco());
		System.out.println("Tipo: "+i.getTipoTexto());
		
	}
	
	public static void apresentarItens(Iten[] itens){
		for (Iten iten : itens) {
			apresentarIten(iten);
			System.out.println("_______________________");
		}
	}
	public static void apresentarResponsavel(Responsavel r){
		System.out.println("Nome: "+r.getNome());
		System.out.println("Matricula: "+r.getMatricula());
		System.out.println("Cargo: "+r.getCargoTexto());
		
		
	}
	public static void apresentarLaboratorio(Laboratorio l){
		System.out.println("Local: "+l.getLocal());
		System.out.println("___ Responsavel ____");
		apresentarResponsavel(l.getResponsavel());
		System.out.println("____ Itens ____");
		apresentarItens(l.getItens());
	}
	public static void getLaboratorio(Laboratorio l){
		System.out.println("Local: "+l.getLocal());
		System.out.println("Quantidade de Itens: "+l.getQtdItens());
	}
	
	public static  void getLaboratorios(Laboratorio[] laboratorios){
		for (Laboratorio laboratorio : laboratorios) {
			getLaboratorio(laboratorio);
			System.out.println("_______________________");
		}
	}
	public static  void apresentarLaboratorios(Laboratorio[] laboratorios){
		for (Laboratorio l: laboratorios) {
			apresentarLaboratorio(l);
			System.out.println("_______________________");
		}
	}
	public static void menu(Ucb ucb){
		char m,r;
		do{
			menuCabecalho();
			m = Leitor.lerChar("Escolha>>");
			switch (m) {
			case 'A':
				System.out.println("____ Laboratorios Inscritos____");
				apresentarLaboratorios(ucb.getLaboratorios());
				break;
			case 'B':
				System.out.println("____Laboratorios com responsaveis como Analista____");
				apresentarLaboratorios(ucb.getLaboratoriosCargo('A'));
				break;
			case 'C':
				System.out.println("Quantidade te itens de tecnologia na UCB: "+ucb.getQtdTipoItens('T'));
				break;
			case 'D':
				System.out.println("Custo total dos Laboratorios da UCB: "+ ucb.custoTotalLaboratorios());
				break;
			case 'E':
				System.out.println("____ Laboratorios_____");
				getLaboratorios(ucb.getLaboratorios());
				break;
			default:
				break;
			}
			r = Leitor.lerChar("Deseja continuar pesquisando? (S)sim (N)nao", "Opcao invalida!", 'N', 'S');	
		}while(r == 'S');
	}
	public static void menuCabecalho(){
		System.out.println("(A) Apresentar todos os dados do laboratorio\n" +
				"(B)Apresentar os dados dos laboratorios que tem responsaveis ANALISTA\n" +
				"(C) Quantidade de itens de TECNOLOGIA\n(D)O custo total dos laboratorios\n" +
				"(E) Localidade e quantitativo de itens de todos os Laboratorios");
	}
}
