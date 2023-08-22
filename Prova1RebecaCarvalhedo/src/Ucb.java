import java.util.Arrays;


public class Ucb {
	Laboratorio[] laboratorios = new Laboratorio[0];

	public double custoTotalLaboratorios(){
		double soma = 0;
		for (Laboratorio l : getLaboratorios()) {
			soma += l.precoTotalItens();
		}
		return soma;
	}
	public Laboratorio[] getLaboratoriosCargo(char caractercargo){
		Laboratorio[] contemCargo = new Laboratorio[0];
		for (Laboratorio laboratorio : getLaboratorios()) {
			if(laboratorio.getResponsavel().getCargo() == caractercargo){
				contemCargo = Arrays.copyOf(contemCargo, contemCargo.length + 1);
				contemCargo[contemCargo.length - 1] = laboratorio;
			}
		}
		return contemCargo;
	}
	public void addLaboratorio(Laboratorio l){
		setLaboratorios(Arrays.copyOf(getLaboratorios(), getLaboratorios().length + 1));
		getLaboratorios()[getLaboratorios().length - 1] = l;
	}
	public int getQtdTipoItens(char tipo){
		int soma = 0;
		for (Laboratorio l : getLaboratorios()) {
			soma += l.getQtdItensTipo(tipo);  
		}
		return soma;
	}
	
	public Laboratorio[] getLaboratorios() {
		return laboratorios;
	}

	public void setLaboratorios(Laboratorio[] laboratorios) {
		this.laboratorios = laboratorios;
	}
	
	
}
