
public class View {
	public static final int MIN_SALARIO = 0;
	public static final int MIN_FILHOS = 0;
	
	 public static Governo lerDadosGoverno(){
   	     Governo governo = new Governo();
   	     addVariasPessoas(governo);
         return governo;
     }
	 public static void addVariasPessoas(Governo g){
     	char opcao;
     	Pessoa novaPessoa;
     	do{
     		novaPessoa = View.obtemInfoPessoa();
     		g.adicionar(novaPessoa);
     		opcao = Leitor.leChar("Deseja cadastrar mais pessoas(S/N)", "Erro ... O dado informado não é válido", 'S', 'N');
     	}while(opcao == 'S');
   } 
	
	
	public static Pessoa obtemInfoPessoa() {
		Pessoa pessoa = new Pessoa(); 
		System.out.println("\n***********************\n");
		pessoa.nome = Leitor.leString("Informe o nome do cidadão: ");
		
		pessoa.cpf = Leitor.leString("Informe o CPF: ");
			
		pessoa.salario = Leitor.leDouble("Informe o salario: ", "Erro ... O dado informado não é válido", MIN_SALARIO);
		pessoa.dependente = Leitor.leInt("Informe a quantidade de filhos: ", "Erro ... O dado informado não é válido", MIN_FILHOS);
		System.out.println("\n***********************\n");
		return pessoa;
	}
	
	public static void print(String cabecalho, Pessoa pessoa){
		System.out.println(cabecalho);
		print(pessoa);
	}
	public static void print(String cabecalho,String rodape, Pessoa pessoa){
		print(cabecalho, pessoa);
		System.out.println(rodape);
	}
	
	public static void print(Pessoa pessoa){
		System.out.println("******* Cadastrados *********");
		System.out.println("Nome       : "+pessoa.nome);
		System.out.println("CPF        : "+pessoa.cpf);
		System.out.println("Dependentes: "+pessoa.dependente);
		System.out.println("Salario    : "+pessoa.salario);
		System.out.println("INSS       : "+pessoa.getInss());
		System.out.println("IR         : "+pessoa.getIR());
		System.out.println("*******************************");

	}
	
	public static void print(Governo gov) {
		
		for (int i = 0; i < gov.pessoas.length; i++) {
			print("Pessoa: "+(i+1), 
					gov.pessoas[i]);
		}
	}
	public static char menu() {
		return Leitor.leChar("A - Quanto de IR foi arrecadado.\n" +
				"B - Quanto de INSS foi arrecadado.\n" +
				"C- Quantos dependentes foram informados.\n" +
				"D- O contribuinte que mais contribuiu\n" +
				"E- Sair ");
		
	}
	public static void apresentaPesquisa(Governo g) {
		char r;
		do{
			r = menu();
			switch(r){
			case'A':
				System.out.println("IR arrecadado por mes  : R$ "+g.getIR());
				break;
			case'B':
				System.out.println("INSS arrecadado        : R$ "+g.getINSS());
				break;
			case'C':
				System.out.println("Dependentes total      : "+g.getQtdDependentes());
				break;
			case'D':
				System.out.println("\n      Dados do Maior Contribuinte         \n");
				print("Maior contribuinte ", g.getMaiorContribuinte());
				break;
				
			}
		}while(r != 'E');
		System.out.println("*** Pessoas Cadastradas ***");
		print(g);
	}
}
