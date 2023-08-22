
public class Data {
	private int dia;
	private int mes;
	private int ano;

	//Regras de negocio
	public boolean isVerificaFinalDia(int finalDia){
		if(getDia() >= finalDia){
			return true;
		}
		return false;
	}
	
	public boolean isVerificaMes(int minMes,int maxMes){
		if(getMes() > maxMes || getMes() < minMes){
			return false;
		}
		return true;
	}
	public boolean isVerificaDia(int minDia,int maxDia){
		if(getDia() > maxDia || getDia() < minDia){
			return false;
		}
		return true;
	}
	//---------------------------



	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}


}
