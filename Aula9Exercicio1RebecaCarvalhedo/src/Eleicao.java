import java.util.ArrayList;


public class Eleicao {
	//Candidato[] candidatos = new Candidato[0]; é a msm coisa que private 
	//ArrayList<Candidato> cadidatos = new ArrayList<Candidato>()
	private ArrayList<Candidato> cadidatos;
	
	public ArrayList<Candidato> getReeleitos(){
		ArrayList<Candidato> aux = new ArrayList<Candidato>();
		for (Candidato candidato : getCadidatos()) {
			if(candidato.getReeleito() == 'S'){
				aux.add(candidato);
			}
		}
		return aux;
	}
	public ArrayList<Candidato> getNome(String nome){
		ArrayList<Candidato> aux = new ArrayList<Candidato>();
		for (Candidato candidato : getCadidatos()) {
			if(candidato.getNome().equalsIgnoreCase(nome)){
				aux.add(candidato);
			}
		}
		return aux;
	}
	public double mediaCusto(){
		double soma = 0;
		for (Candidato c : getCadidatos()) {
			soma++;
		}
		return getSalarios()/soma;
	}
	public double getSalarioEleito(char resposta){
		double soma = 0;
		for (Candidato c : getCadidatos()) {
			if(c.getReeleito() == resposta){
				soma += c.getSalarioReal();
			}
		}
		return soma;
	}
	public  double getSalarios(){
		double soma = 0;
		for (Candidato c : getCadidatos()) {
			soma += c.getSalarioReal();
		}
		return soma;
	}
	
	public Eleicao(){
		setCadidatos(new ArrayList<Candidato>());
	}
	
	public void addCandidato(Candidato candidato){
		getCadidatos().add(candidato);
	}
	
	public ArrayList<Candidato> getCadidatos() {
		return cadidatos;
	}

	public void setCadidatos(ArrayList<Candidato> cadidatos) {
		this.cadidatos = cadidatos;
	}

}
