import java.util.Arrays;


public class Competicao {
	private Atleta[] atletas = new Atleta[0];

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}
	public boolean addAtletas(Atleta atleta){
		if(isExiste(atleta.getInscricao())){
			return false;
		}
		setAtletas(Arrays.copyOf(getAtletas(),getAtletas().length+1));
		getAtletas()[getAtletas().length - 1] = atleta;
		return true;
	}
	public boolean isExiste(int inscricao){
		for (Atleta teste : getAtletas()) {
			if(teste.getInscricao() == inscricao){
				return true;
			}
				
		}
		return false;
	}
	public Atleta[] categoria(int idadeMaior,int idadeMenor){
		
		Atleta[] atletasM = new Atleta[0];
	
		for (Atleta temp : getAtletas()) {
			if(temp.getIdade() >= idadeMenor && temp.getIdade() <= idadeMaior ){
				atletasM = Arrays.copyOf(atletasM,atletasM.length+1);
				atletasM[atletasM.length - 1] = temp;
				
			}
		}
		return atletasM;
	}
	public Atleta[] elite(){
		Atleta[] atletaE = new Atleta[0];
		
		for (Atleta atleta : getAtletas()) {
			if(atleta.isVerificaElite() == true){
				atletaE = Arrays.copyOf(atletaE, atletaE.length+1);
				atletaE[atletaE.length - 1] = atleta;
			}
				
		}
		return atletaE;
	}
	
	public Atleta getMelhor(String msg){
		Atleta menor = new Atleta();
		menor = getAtletas()[0]; 
		
		System.out.println(msg);
		for (Atleta atleta : getAtletas()) {
			if(atleta.getTempo().getTempoByStatus() < menor.getTempo().getTempoByStatus()){
				menor = atleta;
			}else
				menor = menor;
		}
		return menor;
	}
	public double mediaTempo(){
		double soma = 0;
		
		for (Atleta atleta : getAtletas()) {
			soma += atleta.getTempo().getTempoByStatus();
		}
		return soma /getAtletas().length;
	}
}
