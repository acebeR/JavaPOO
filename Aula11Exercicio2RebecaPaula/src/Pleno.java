import java.util.Calendar;


public class Pleno extends Programador{
	private int anoConclusao;
	private int anoTempoNaEmpresa;
	
	
	@Override
	public String toString() {
		return "----- Classe: Pleno ----\n"+super.toString()+ "\nAno de conclusao: "+getAnoConclusao()+"\nTempo na Empresa: "+getAnoTempoNaEmpresa()+"\nSalário: "+getSalario()
				;
	}
	public int getAnoConclusao() {
		return anoConclusao;
	}
	public void setAnoConclusao(int anoConclusao) {
		this.anoConclusao = anoConclusao;
	}
	public int getAnoTempoNaEmpresa() {
		return anoTempoNaEmpresa;
	}
	public void setAnoTempoNaEmpresa(int anoTempoNaEmpresa) {
		this.anoTempoNaEmpresa = anoTempoNaEmpresa;
	}
	@Override
	public double getSalario() {
		return ((75 * getTempoDeFormacao()) + (1000 * getAnoTempoNaEmpresa()));
	}
	public int getTempoDeFormacao(){
		return (Calendar.getInstance().get(Calendar.YEAR) - getAnoConclusao());
	}
}
