import java.io.ObjectInputStream.GetField;
import java.util.Arrays;


public class Gerencia {
	private Servico[] servicos = new Servico[0];
	
	
	public Servico[] getServicos() {
		return servicos;
	}


	public void setServicos(Servico[] servicos) {
		this.servicos = servicos;
	}
	public void addServico(Servico temp){
		setServicos(Arrays.copyOf(getServicos(), getServicos().length +1)) ;
		getServicos()[getServicos().length -1] = temp;

	}
	public Servico maisCaro(Servico[] servicos){
		Servico maior = servicos[0];
		for (Servico s : servicos) {
			if(s.getPreco() > maior.getPreco()){
				maior = s;
			}else
				maior = maior;
		}
		return maior;
	}
	
	public Servico[] getArrayByServico(String tipo,Servico[] servicos){
		Servico[] newServico = new Servico[0];
		for (Servico s : servicos) {
			if(s.getTipoServico().equalsIgnoreCase(tipo)){
				newServico = Arrays.copyOf(newServico, newServico.length +1);
				newServico[newServico.length-1] = s;
			}	
		}
		
		return newServico;
	}
	public Servico[] getArrayByDescricao(String tipo,Servico[] servicos){
		Servico[] newServico = new Servico[0];
		for (Servico s : servicos) {
			if(s.getDescricao().equalsIgnoreCase(tipo)){
				newServico = Arrays.copyOf(newServico, newServico.length +1);
				newServico[newServico.length-1] = s;
			}	
		}
		
		return newServico;
	}
}
