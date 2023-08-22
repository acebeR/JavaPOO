
public class View {
	private Leitor leitor =  new Leitor();

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	

	public Atleta lerDados(){
		Atleta  atleta = new Atleta();
		atleta.setInscricao(getLeitor().lerInt("Inscricao: "));
		atleta.getTempo().setHoras(getLeitor().lerInt("Hora: "));
		atleta.getTempo().setMinutos(getLeitor().lerInt("Minutos: "));
		atleta.getTempo().setSegundos(getLeitor().lerInt("Segundos: "));
		atleta.setIdade(getLeitor().lerInt("Idade:"));
		boolean r;
		do{
			atleta.setNome(getLeitor().lerString("Nome: "));
			if(atleta.isVerificaNome()){
				r = true;
				System.out.println("Deu bom");
			}else{
				r = false;
				System.out.println("Deu ruim");
			}
		}while(r == false);
		return atleta;
	}
	public void popular(Competicao competicao){
		char r;
		boolean f;
		do{
			Atleta atleta = lerDados();
			f = competicao.addAtletas(atleta);
			if(f == true){
				System.out.println("Deu bom!!");
			}else
				System.out.println("Deu ruim!!");
			r = getLeitor().lerChar("Deseja continuar cadastrando? (S)sim");
		}while(r == 'S');
		
	}
	//competicao.categoria(idadeMaior,idadeMenor)
	public void apresenta(Atleta[] atletas ,String msg){
		
		System.out.println(msg);
		for (Atleta temp : atletas) {
			apresenta(temp);
		}
			
		
	}
	public void apresenta(Atleta temp){
		//System.out.println(msg);
		//for (Atleta temp : competicao.elite()) {
			System.out.println("Nome: "+temp.getNome());
			System.out.println("Idade: "+temp.getIdade());
			System.out.println("Inscricao: "+temp.getInscricao());
			System.out.println(" -- Tempo --");
			System.out.println(temp.getTempo().getHoras()+":"+temp.getTempo().getMinutos()+"'"+temp.getTempo().getSegundos());
		//}
		
	}
	public void apresentarMedia(Competicao competicao){
		System.out.println("-- Media --");
		System.out.println(competicao.mediaTempo());
	}
}