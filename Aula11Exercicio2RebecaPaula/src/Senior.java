
public class Senior extends Programador{
	private int qtdCertificaçoes;
	private int qtdProjetos;
	@Override
	public String toString() {
		return "---- Calsse: Senior ----\n"+super.toString() + "\nQuantidade de Certificado: "+getQtdProjetos()+"\nQuantidade de Certificaçoes: "+getQtdCertificaçoes()+"\nSalario: "+getSalario();
	}
	
	public int getQtdCertificaçoes() {
		return qtdCertificaçoes;
	}
	public void setQtdCertificaçoes(int qtdCertificaçoes) {
		this.qtdCertificaçoes = qtdCertificaçoes;
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
		return 100 * getQtdCertificaçoes();
	}
	
}
