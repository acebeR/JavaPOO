
public class Atleta {
	public static final int MAXTEMPO = 5;
	private int inscricao;
	private String nome;
	private Tempo tempo = new Tempo();
	private int idade;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Tempo getTempo() {
		return tempo;
	}
	public void setTempo(Tempo tempo) {
		this.tempo = tempo;
	}
	public int getInscricao() {
		return inscricao;
	}
	public void setInscricao(int inscricao) {
		this.inscricao = inscricao;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isVerificaNome(){
		if(getNome().length() < 3 || getNome().length() > 50){
			return false;
		}else{
			this.nome = nome;
			return true;
		}
	}
	public boolean isVerificaElite(){
		if(getTempo().getHoras() < MAXTEMPO){
			return true;
		}
		return false;
	}
	
}
