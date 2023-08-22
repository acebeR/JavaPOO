
public class Pessoa {
	double salario;
	int dependente;
	String cpf;
	String nome;
	
	//Método construtor
	public Pessoa() {
	}
	public Pessoa(double salario, int dependente, String cpf, String nome) {
		this.salario = salario;
		this.dependente = dependente;
		this.cpf = cpf;
		this.nome = nome;
	}

	public double getIR(){
		double IR, base;

		base = getBase();
		if(base <= 1787.77){
			return 0;
		}else if(base > 1787.77 && base < 2679.30){
			IR = (base * 7.5)/100;
			IR -= 134.08;
			return IR;
		}else if(base >= 2679.30 && base < 3572.44){
			IR = (base * 15)/100;
			IR -= 335.03;
			return IR;
		}else if(base >= 3572.44 && base < 4463.82){
			IR = (base * 22.5)/100;
			IR -= 602.96;
			return IR;
		}else{
			IR = (base * 27.5)/100;
			IR -= 826.15;
			return IR;
		}
	}

	public double getInss(){
		if(salario <= 1317.07){
			return (salario * 0.08);
		}else if(salario > 1317.07 && salario < 2195.12){
			return (salario * 0.09);
		}else{
			if((salario * 0.11) <= 482.93){
				return salario * 0.11;
			}else{
				return 482.93;
			}
		}
	}
	public double getBase(){
		double inss, base;
		inss = getInss();
		base = salario - inss;
		base -= (179.71 * dependente);
		return base;
	}
}
