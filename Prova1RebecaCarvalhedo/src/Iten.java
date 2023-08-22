
public class Iten {
	private String descricao;
	private int codigo;
	private double preco;
	private char tipo; // tecnologia(T) Outros(O)
	private static final char TIPO1 = 'T';
	private static final char TIPO2 = 'O';
	
	public String getTipoTexto(){
		if(getTipo() == 'T'){
			return "TECNOLOGIA";
		}
		return "OUTROS";
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	
	
}
