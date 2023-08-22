
public class Responsavel {
	private String nome;
	private char cargo;//(T) tecnico (A)Analista
	private String matricula;
	
	private static final char CARGO1 = 'T';
	private static final char CARGO2 = 'A';
	
	public String getCargoTexto(){
		if(getCargo() == 'T'){
			return "TECNICO";
		}
		return "ANALISTA";
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getCargo() {
		return cargo;
	}
	public void setCargo(char cargo) {
		this.cargo = cargo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
