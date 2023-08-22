

public class Servico {
	public static final String PODE1 = "Fotografia";
	public static final String PODE2 = "Filmagem";
	public static final int DIA = 15;
	
	String descricao;
	private Dia data = new Dia();
	private double preco;
	
	
	public Dia getData() {
		return data;
	}
	public void setData(Dia data) {
		this.data = data;
	}
	private int tamEquipe;
	private String tipoServico;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getTamEquipe() {
		return tamEquipe;
	}
	public void setTamEquipe(int tamEquipe) {
		this.tamEquipe = tamEquipe;
	}
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public boolean isTipoServicoo(){
		if(getTipoServico().equalsIgnoreCase(PODE1)|| getTipoServico().equalsIgnoreCase(PODE2)){
			return true;
		}else
			return false;
	}
	public double precoAjusteFilmagem(double preco){
		double valor = 0;
		if(getData().getDia() > DIA && getTipoServico().equalsIgnoreCase("filmagem")){
			valor = getPreco() + preco;
		}
		return valor;
	}
	
	public double precoAjusteFotografia(double preco){ 
		double valor = 0;
		if(getData().getDia() <= DIA && getTipoServico().equalsIgnoreCase("fotografia")){
			valor = getPreco() * preco;
		}
		return getPreco() - valor ;
	}
	
	
}
