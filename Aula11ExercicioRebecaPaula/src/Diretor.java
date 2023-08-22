
public class Diretor extends Funcionario {

	private Tempo t = new Tempo();
	
	public double getImposto(){
		return getImposto() - (getImposto() * 0.23);
	}

	public Tempo getT() {
		return t;
	}

	public void setT(Tempo t) {
		this.t = t;
	} 
	
	public String toString(){
		return (super.toString()+"Tempo: "+getT().getAno()+getT().getMes());
	}
	
	
}
