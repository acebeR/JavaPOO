//nome, numero de filiação, se a candidatura é para deputado federal, distrital ou senador.
public class Candidato {
	private String nome;
	private int numeroFiliacao;
	private String candidatura;
	private char reeleito;

	

	public double getSalarioReal(){
		double salario = 0;
		switch (getCandidatura()) {
		case "FEDERAL":
			salario =  170000.00;
			if(getReeleito() == 'S'){
				salario =  (170000.00 * 2);
			}
			break;
		case "DISTRITAL":
			salario = (250000.00);
			if(getReeleito() == 'S'){
				salario =  (250000.00 * 2);
			}
		case "SENADOR":
			salario =  350000.00;
			if(getReeleito() == 'S'){
				salario =  (350000.00 * 2);
				}
		
		}
		return salario;
	}
	public String reeleito(){
		String texto;
		if(getReeleito() == 'S'){
			return "Sim";
		}
		return "Não";
	}
	public char getReeleito() {
		return reeleito;
	}

	public void setReeleito(char reeleito) {
		this.reeleito = reeleito;
	}

	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroFiliacao() {
		return numeroFiliacao;
	}
	public void setNumeroFiliacao(int numeroFiliacao) {
		this.numeroFiliacao = numeroFiliacao;
	}
	public String getCandidatura() {
		return candidatura;
	}
	public void setCandidatura(String candidatura) {
		this.candidatura = candidatura;
	}


}
