
public class Senior extends Programador{
	private int qtdCertifica�oes;
	private int qtdProjetos;
	@Override
	public String toString() {
		return "---- Calsse: Senior ----\n"+super.toString() + "\nQuantidade de Certificado: "+getQtdProjetos()+"\nQuantidade de Certifica�oes: "+getQtdCertifica�oes()+"\nSalario: "+getSalario();
	}
	
	public int getQtdCertifica�oes() {
		return qtdCertifica�oes;
	}
	public void setQtdCertifica�oes(int qtdCertifica�oes) {
		this.qtdCertifica�oes = qtdCertifica�oes;
	}
	public int getQtdProjetos() {
		return qtdProjetos;
	}
	public void setQtdProjetos(int qtdProjetos) {
		this.qtdProjetos = qtdProjetos;
	}
	@Override
	public double getSalario() {
		return (3500 + (500 * (getMetadeProjetos() + getSalarioPorCertificacao())));
	}
	public int getMetadeProjetos(){
		return getQtdProjetos() / 2;
	}
	public double getSalarioPorCertificacao(){
		return 100 * getQtdCertifica�oes();
	}
	
}
