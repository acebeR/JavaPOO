/**
 * Ao final deverá ser mostrado:
- menor idade entre os entrevistados;
- maior salário registrado;
- média do número de filhos;
- média do salário das pessoas registradas;
- média dos homens com salário superior a R$300,00;
- quantidade de pessoas que tem salário maior que a média de todas as pessoas pesquisadas.
- Todos os dados da Prefeitura
*/
public class Prefeitura {
	Prefeito prefeito;
	Habitante []habitantes;//Serve para ele saber a o que a classe está se refenciando
	public Prefeitura() {
    	habitantes = new Habitante[0];
	}
	
	public double getSomatorio(){
		double somatorio = 0;
		for (int i = 0; i < habitantes.length; i++) {
			somatorio += habitantes[i].salario;
		}
		return somatorio; 
	}
	public double getMediaSalario(){
		return getSomatorio() / habitantes.length;
	}
	public int menorIdade(){
    	int menorIdade = habitantes[0].idade; 
    	for (int i = 1; i < habitantes.length; i++) {
	    	if(menorIdade > habitantes[i].idade){
	    		menorIdade = habitantes[i].idade;
	    	}
		}
    	return menorIdade;
    }
    
    public double maiorSalario(){
    	double maiorSalario = habitantes[0].salario; 
    	for (int i = 1; i < habitantes.length; i++) {
	    	if(maiorSalario < habitantes[i].salario){
	    		maiorSalario = habitantes[i].salario;
	    	}
		}
    	return maiorSalario;
    }
    
    public int somaNroFilhos (){
    	int somaFilhos = 0;
    	for (int i = 0; i < habitantes.length; i++) {
			somaFilhos += habitantes[i].qtdfilhos;
		}
    	return somaFilhos;
    }
  
    public double somaSalario (){
    	double somaSalario = 0;
    	for (int i = 0; i < habitantes.length; i++) {
    		somaSalario += habitantes[i].salario;
		}
    	return somaSalario;
    }
    
    public double somaSexoSalario(double valor, char sexo){
        double soma = 0;
    	for (int i = 0; i < habitantes.length; i++) {
			if(habitantes[i].isMaior(valor) && habitantes[i].sexo == sexo){
				soma += habitantes[i].salario;
			}
		}
    	return soma;
    }
    public int somaSexoQtd(double valor, char sexo){
        int soma = 0;
    	for (int i = 0; i < habitantes.length; i++) {
			if(habitantes[i].isMaior(valor) && habitantes[i].sexo == sexo){
				soma++;
			}
		}
    	return soma;
    }
    
    public void retornarVetor(Habitante novoHabitante){
		Habitante aux[] = new Habitante[habitantes.length + 1];

		for (int i = 0; i < habitantes.length; i++) {
			aux[i] = habitantes[i];
		}

		aux[habitantes.length] = novoHabitante;
		habitantes = aux;
	}
	
    

    public double contaSexoSalario( double valor, char sexo){
        int cont = 0;
    	for (int i = 0; i < habitantes.length; i++) {
			if(habitantes[i].isMaior(valor) && habitantes[i].sexo == sexo){
				cont ++;
			}
		}
    	return cont;
    }
    
    public int contaSalarioAcima(double valor){
        int cont = 0;
    	for (int i = 0; i < habitantes.length; i++) {
			if(habitantes[i].isMaior(valor)){
				cont ++;
			}
		}
    	return cont;
    }
    
    public double somaSalarioAcima(double valor){
        double soma = 0;
    	for (int i = 0; i < habitantes.length; i++) {
			if(habitantes[i].isMaior(valor)){
				soma += habitantes[i].salario;
			}
		}
    	return soma;
    }
    public int somaQtdAcima(double valor){
        int soma = 0;
    	for (int i = 0; i < habitantes.length; i++) {
			if(habitantes[i].isMaior(valor)){
				soma++;
			}
		}
    	return soma;
    }
}
