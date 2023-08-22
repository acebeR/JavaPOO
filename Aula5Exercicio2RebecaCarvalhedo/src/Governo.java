
public class Governo {
	Pessoa []pessoas;
	public Governo() {
		pessoas = new Pessoa[0];
	}
	
	public void adicionar (Pessoa novaPessoa){
    	Pessoa[] nova = new Pessoa[pessoas.length + 1];
		for (int i = 0; i < pessoas.length; i++) {
			nova[i] = pessoas[i];
		}
		nova[pessoas.length] = novaPessoa;
		pessoas = nova;
     }
	
	public double getIR (){
		
		double impostos = 0;
		for (int cont = 0; cont < pessoas.length; cont++) {
			impostos += pessoas[cont].getIR();
		}
		return impostos;
	}
	
	public double getINSS() {
		double inss = 0;
		
		for (int cont = 0; cont < pessoas.length; cont++) {
			inss += pessoas[cont].getInss();
		}
		
		return inss;
	}
	/**
	 * Calcula a quantidade de dependentes cadastrados no sistema
	 * @return
	 */
	public int getQtdDependentes() {
		int dependentes=0;
		
		for (int cont = 0; cont < pessoas.length; cont++) {
			dependentes += pessoas[cont].dependente;
		}
		return dependentes;
	}
	
	public Pessoa getMaiorContribuinte() {
		double impostos, maior = 0;
		int numVetor = 0;
		for (int cont = 0; cont < pessoas.length; cont++) {
			impostos = pessoas[cont].getIR();
			if(impostos > maior){
				maior = impostos;
				numVetor = cont;
			}
		}
		return pessoas[numVetor];
	}
}
