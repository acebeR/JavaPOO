import java.util.Arrays;
public class Laboratorio {
	private String local;
	private Responsavel responsavel = new Responsavel();
	private Iten[] itens = new Iten[0];
	
	
	public double precoTotalItens(){
		double soma = 0;
		for (Iten i : getItens()) {
			soma += i.getPreco();
		}
		return soma;
	}
	public int getQtdItens() {
		return getItens().length;
	}
	public void addIten(Iten i){
		setItens(Arrays.copyOf(getItens(), getItens().length + 1));
		getItens()[getItens().length - 1] = i;
	}
	public int getQtdItensTipo(char tipo){
		int soma = 0;
		for (Iten i : getItens()) {
			if(i.getTipo() == tipo){
				soma++;
			}
		}
		return soma;
	}
	
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Responsavel getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	public Iten[] getItens() {
		return itens;
	}
	public void setItens(Iten[] itens) {
		this.itens = itens;
	}
	
	
	
}
