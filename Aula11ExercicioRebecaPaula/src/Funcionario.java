import java.util.ArrayList;


public class Funcionario {

	private double imposto;
	private String nome;
	private String matricula;
	private String cpf;
	private double salário;
	

	public char equalsTipo(Object obj){
		if(obj instanceof Professor){
			return 'P';
			
		}
		return 'D';
	}
	
	public boolean existeMatricula(){
		if(getMatricula().equals(null)){
			return false;
		}
		return true;
	}
	public String toString(){
		return("Nome: "+getNome()+"Matricula: "+getMatricula()+"CPF: "+getCpf()+"Salário: "+getSalário()+"Imposto: "+getImposto());
	}
	
	public double getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalário() {
		return salário;
	}

	public void setSalário(double salário) {
		this.salário = salário;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	

}
