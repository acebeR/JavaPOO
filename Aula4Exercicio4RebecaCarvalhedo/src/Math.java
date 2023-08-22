
public class Math {
	public static Piloto plusFast(Piloto[] pilotos,Piloto fast){
		if(pilotos.length == 1 ){
			fast = pilotos[0];
		}
		for (int i = 1; i < pilotos.length; i++) {
			if(pilotos[i].tempo < pilotos[i - 1].tempo){
				fast = pilotos[i];
			}else{
				fast = pilotos[i - 1];
			}
		}
		return fast;
	}
	
	public static Piloto plusSlow(Piloto[] pilotos,Piloto slow){
		if(pilotos.length == 1 ){
			slow = pilotos[0];
		}
		for (int i = 1; i < pilotos.length; i++) {
			if(pilotos[i].tempo > pilotos[i - 1].tempo){
				slow = pilotos[i];
			}else{
				slow = pilotos[i - 1];
			}
		}
		return slow;
	}
	
	public static float media(Piloto[] pilotos){
		int i;
		int soma = 0;
		
		for (i = 0; i < pilotos.length; i++) {
			soma += pilotos[i].tempo;
		}
		return soma/i;
	}
}
