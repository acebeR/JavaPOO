import java.awt.image.ImagingOpException;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class View {
	
	public static Candidato lerCandidato(){
		Candidato c = new Candidato();
		
		c.setNome(Leitor.lerString("Nome: "));
		validaCandidato(c);
		c.setNumeroFiliacao(Leitor.lerInt("Numero de filiação: ", 1000, 1));
		 
		c.setReeleito(Leitor.lerChar("Foi reeleito? ", "Deu ruim ai!!", 'S', 'N'));
		return c;
	}
	public static void validaCandidato(Candidato c){
		boolean erro = false;
		do{
			c.setCandidatura(Leitor.lerString("Candidatura: (FEDERAL) ou (DISTRITAL) ou (SENADOR)"));
			if(c.getCandidatura().equalsIgnoreCase("FEDERAL") || c.getCandidatura().equalsIgnoreCase("DISTRITAL") || c.getCandidatura().equalsIgnoreCase("SENADOR")){
				erro = true;
			}else
				System.out.println("Opço inválida...");
		}while(erro == false);
	}
	public static void lerCandidatos(Eleicao e){
		int numero = 1;
		int max = Leitor.lerInt("Quantidade de Candidatos...");
		do{
			Candidato aux = lerCandidato();
			e.addCandidato(aux);
			numero++;
		}while(numero <= max);
	}
	public static void mostrarCandidato(Candidato c){
		System.out.println("Candidatura: "+c.getCandidatura());
		System.out.println("Nome: "+c.getNome());
		System.out.println("Numero de Filiacao: "+c.getNumeroFiliacao());
		System.out.println("Foi reeleito? "+c.reeleito());
		System.out.println("Salario: "+c.getSalarioReal());
	}
	
	public static void menu(Eleicao e){
		System.out.println("___ Todos os candidatos _____");
		mostrarCandidatos(e.getCadidatos());
		System.out.println("___ Todos reeleitos ____");
		mostrarCandidatos(e.getReeleitos());
		System.out.println(" Soma dos salarios dos Reeleitos: "+e.getSalarioEleito('S'));
		System.out.println(" Soma dos salarios dos  não Reeleitos: "+e.getSalarioEleito('N'));
		System.out.println(" Soma de todos os salarios: "+e.getSalarios());
		System.out.println("____ Todos que se chamam Tiririca ____");
		mostrarCandidatos(e.getNome("TIRIRICA"));
		System.out.println("Media de Custo: "+e.mediaCusto());
		
		
	}
public static void mostrarCandidatos(ArrayList<Candidato> cadidatos) {
	for (Candidato candidato : cadidatos) {
		mostrarCandidato(candidato);
		System.err.println("-----------------------------");
	}
}

//	}
}
