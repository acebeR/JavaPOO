
public class Professor extends Funcionario {

	
	private int ano;
	
	
	public double getImposto(){
		return getImposto() - (getImposto() * 0.2);
	}
	
	public String toString(){
		return (super.toString()+"ano: "+getAno());
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
