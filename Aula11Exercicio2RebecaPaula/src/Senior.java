
public class Senior extends Programador{
	private int qtdCertificacoes;
	private int qtdProjetos;
	@Override
	public String toString() {
		return "---- Classe: Senior ----\n"+super.toString() + "\nQuantidade de Certificado: "+getQtdProjetos()+"\nQuantidade de Certificacoes: "+getQtdCertificacoes()+"\nSalario: "+getSalario();
	}
	
	public int getQtdCertificacoes() {
		return qtdCertificacoes;
	}
	public void setQtdCertificacoes(int qtdCertificacoes) {
		this.qtdCertificacoes = qtdCertificacoes;
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
		return 100 * getQtdCertificacoes();
	}
	
}
