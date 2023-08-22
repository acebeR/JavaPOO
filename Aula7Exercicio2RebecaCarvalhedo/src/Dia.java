
public class Dia {
	public static final int MAXDIAS = 30;
	public static final int MAXMES = 12;
	private int dia;
	private int mes;
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
	public boolean isDias(){
		if(getMes() > MAXDIAS){
			return false;
		}			
		return true;
	}
	public boolean isMes(){
		if(getMes() > MAXMES){
			return false;
		}			
		return true;
	}
	
}
