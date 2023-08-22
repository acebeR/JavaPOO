import java.util.ArrayList;


public class Fabrica {

	private ArrayList<Programador> programadores;
	
	public Programador getMaiorSalario(){
		Programador maior = getProgramadores().get(0); //[0]
		for (Programador p : getProgramadores()) {
			if(maior.getSalario() < p.getSalario()){
				maior = p;
			}
		}
		return maior;
	}
	public Programador getMenorSalario(){
		Programador menor = getProgramadores().get(0); //[0]
		for (Programador p : getProgramadores()) {
			if(menor.getSalario() > p.getSalario()){
				menor = p;
			}
		}
		return menor;
	}
	public Fabrica() {
		setProgramadores(new ArrayList<Programador>());
	}
	public double mediaSalarios(){
		return somaSalarios() / getProgramadores().size();
	}
	public double somaSalarios(){
		double soma = 0;
		for (Programador aux : getProgramadores()) {
			soma += aux.getSalario();
		}
		return soma;
	}
	public ArrayList<Programador> getProgramadores() {
		return programadores;
	}

	public void setProgramadores(ArrayList<Programador> programadores) {
		this.programadores = programadores;
	}
	public boolean addProgramador(Programador aux) {
		if(getProgramadores().contains(aux)){
			return false;
		}
		else{
			getProgramadores().add(aux);
			return true;
		}
		
	}
	
	
}
