import java.util.Arrays;
public class Empresa {
	private Servico[] servicos = new Servico[0];

	//Regras de negocio
	public void addServico(Servico novo){
		setServicos(Arrays.copyOf(getServicos(), getServicos().length+1));
		getServicos()[getServicos().length - 1] = novo;
	}
	public Servico maisCaro(){
		Servico sMais = getServicos()[0];
		for (Servico temp : getServicos()) {
			if(temp.getPreco() > sMais.getPreco()){
				sMais = temp;
			}else
				sMais = sMais;
		}
		return sMais;
	}
	public int getQtdTipo(char tipoS){
		int soma = 0;
		for (Servico temp : getServicos()) {
			if(temp.getTipo() == tipoS){
				soma++;
			}
		}
		return soma;
	}
	public  Servico[] getServicosTipo(char tipoS){
		Servico[] retorno = new Servico[0]; 
		for (Servico s : getServicos()) {
			if(s.getTipo() == tipoS){
				retorno = Arrays.copyOf(retorno, retorno.length +1);
				retorno[retorno.length - 1] = s;
			}
		}
		return retorno;
	}
	public Servico[] getServicoTexto(String texto){
		Servico[] servicos = new Servico[0]; 
		for (Servico s : getServicos()) {
			if(s.isExisteTexto(texto)){
				servicos = Arrays.copyOf(servicos, servicos.length +1);
				servicos[servicos.length - 1] = s;
			}
		}
		return servicos;
	}

	//-----------------------------------------------
	public Servico[] getServicos() {
		return servicos;
	}

	public void setServicos(Servico[] servicos) {
		this.servicos = servicos;
	}




}
