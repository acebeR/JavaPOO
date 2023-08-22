import java.util.Arrays;
public class View {
	Gerencia gerencia = new Gerencia();
	private Leitor leitor = new Leitor();


	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}

	public Gerencia getGerencia() {
		return gerencia;
	}

	public void setGerencia(Gerencia gerencia) {
		this.gerencia = gerencia;
	}

	public void popular(Gerencia gerencia){
		
		char r;
		do{
			Servico servico = lerServiso();
			gerencia.addServico(servico);
			r = getLeitor().Lerchar("Deseja continuar? (S)sim");
		}while(r == 'S');
	}
	public Servico lerServiso(){
		Servico servico = new Servico();
		servico.setDescricao(getLeitor().lerString("Descricao: "));
		
		do{
			servico.getData().setDia(getLeitor().LerInt("Dia: "));
			if(servico.getData().isDias() == false){
				System.out.println("O dia é inválido");
			}
		}while(servico.getData().isDias() == false);
		do{
			servico.getData().setMes(getLeitor().LerInt("Mes: "));
			if(servico.getData().isMes() == false){
				System.out.println("O mes é inválido");
			}
		}while(servico.getData().isMes() == false);
		servico.setPreco(getLeitor().LerDouble("Preco: "));
		servico.setTamEquipe(getLeitor().LerInt("Tamanho da equipe: "));
		do{
			servico.setTipoServico(getLeitor().lerString("Tipo de servico(Fotografia ou Filmagem)"));

			if(servico.isTipoServicoo() == true){
				System.out.println("Deu bom!!");
			}else
				System.out.println("Deu ruim!!");
		}while(!servico.isTipoServicoo());
		return servico;
	}
	
	public void apresentaServico(Servico servico,String msg){
		double custo = 0;
		System.out.println(msg);
		System.out.println("Descricao: "+servico.getDescricao());
		System.out.println("Preco: "+servico.getPreco());
		if(servico.getTipoServico().equals("filmagem")){
			custo = servico.precoAjusteFilmagem(50);
		}else
			custo = servico.precoAjusteFotografia(0.1);
		System.out.println("Custo: "+custo);
		System.out.println("Tamanho da equipe: "+servico.getTamEquipe());
		System.out.println("Tipo de servico: "+servico.getTipoServico());
		System.out.println(+servico.getData().getDia()+"/"+servico.getData().getMes());
	}
	public void apresentaServicos(Servico[] servicos,String msg){
		
		for (Servico temp : servicos) {
			apresentaServico(temp,msg);
		}
	}
	public void menu(Gerencia g){
		char r,resp;
		do{
			r = getLeitor().Lerchar("Escolha uma opcao:\n a - Todos os dados de todos os serviços.\n b -  O serviço mais caro\n c - Quantos serviços do tipo Filmagem foram realizados\n d - Os dados dos serviços do tipo Fotografia devem ser apresentados.\n e -Apresente todos os serviços tenham em sua descrição: SAVE DATE\n");
			switch(r){
			case 'a':
				apresentaServicos(g.getServicos(),"\n-- Servicos --");
				break;
			case 'b':
				apresentaServico(g.maisCaro(g.getServicos()),"\n-- Mais Caro --");
				break;
			case 'c':
				System.out.println("\n-- Quantidade Filmagemm --\nQuantidade de serviços do tipo Filmagem: " + g.getArrayByServico("Filmagem", g.getServicos()).length);
				
				break;
			case 'd':
				apresentaServicos(g.getArrayByServico("Fotografia", g.getServicos()), "\n-- Fotografia --\n");

				break;
			case 'e':
				apresentaServicos(g.getArrayByDescricao("SAVE DATE", g.getServicos()),"Descricao que possui SAVE DATE");
				break;
			}
			resp = getLeitor().Lerchar("Deseja continuar pesquisando? (S)sim");
		}while(resp == 'S');
		
	}
}

