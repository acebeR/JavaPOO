
public class Menu {
	public static void menu(Piloto pilotos[]){
		float media;
		char op,resposta;
		
		Piloto fast = new Piloto();
		Piloto slow = new Piloto();
		
		do{
			op = Leitor.lerChar("A - O piloto mais rápido." +
					"\nB - O piloto mais lento." +
					"\nC - A Média dos tempos. " +
					"\nD - Todos os pilotos ordenados pelo tempo." +
					"\n Escolha uma opcao: ");
			switch (op){
				case 'A':
					fast = Math.plusFast(pilotos, fast);
					System.out.println("O piloto mais rapido: "+fast.nome+"\n Esuderia: "+fast.escuderia+"\n Tempo:"+fast.tempo);
					break;
				case 'B':
					slow = Math.plusSlow(pilotos, slow);
					System.out.println("O piloto mais lento: "+slow.nome+"\n Esuderia: "+slow.escuderia+"\n Tempo:"+slow.tempo);
					break;
				case 'C':
					media = Math.media(pilotos);
					System.out.println("Media: "+media);
					break;
				case 'D':
					pilotos = View.ordenar(pilotos);
					for (int i = 0; i < pilotos.length; i++) {
						System.out.println(" Name: "+pilotos[i].nome+"\n Esuderia: "+pilotos[i].escuderia+"\n Tempo:"+pilotos[i].tempo+"\n");
						
					}
					break;
				
			}
			resposta = Leitor.lerChar("Deseja continuar no menu? (S)sim (N)nao", "Informacao incorreta!", 'S', 'N');
		
		}while((op < 'A' || op > 'D')|| resposta == 'S');
		
	}
}
