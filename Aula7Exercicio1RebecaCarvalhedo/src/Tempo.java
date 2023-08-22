
public class Tempo {
	private int horas;
	private int minutos;
	private int segundos;
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public double getTempoByStatus(){
		int min;
		int seg1,seg2;
		double soma;
		
		min = getHoras()*60;
		seg1 = min * 60; 
		seg2 = getMinutos()* 60;
		soma = seg1 + seg2;
		
		return soma;
	}
	
}
