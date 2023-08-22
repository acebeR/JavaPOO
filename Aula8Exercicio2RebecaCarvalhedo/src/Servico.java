
public class Servico {
	private static final double PRECOF = 50;
	private static final double PRECOV = 0.1;
	private static final int DIA = 15;
	
	private String descricao;
	private Data data = new Data();
	private double preco;
	private int tamEquipe;
	private char tipo;

	//regras de negocio

	public double precoModificado(char tipodeServico){
		switch(tipodeServico){
		case 'F':
			if(getData().isVerificaFinalDia(DIA) == true){
				return getPreco() + PRECOF;
			}else
				break;

		case 'V':
			if(getData().isVerificaFinalDia(DIA) == false){
				return getPreco()* PRECOV;
			}else
				break;
		}
		return 0;
	}
	public boolean isExisteTexto(String texto){
		if(getDescricao().contains(texto)){
			return true;
		}
		return false;
	}


	//------------------------------------------------------------------------
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
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
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public boolean isValidaTipo(char a,char b){
		if(getTipo() != a || getTipo() != b){
			return false;
		}
		return true;
	}


}
