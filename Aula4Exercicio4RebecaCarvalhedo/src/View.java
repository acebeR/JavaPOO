
public class View {
	public static Piloto[] ordenar(Piloto[] pilotos){
		Piloto aux;
		
		for(int i = 0; i < pilotos.length; i++){
			for(int j = 0; j < (pilotos.length - 1); j++){
				if(pilotos[j].tempo > pilotos[j + 1].tempo){
					aux = pilotos[j];
					pilotos[j] = pilotos[j+1];
					pilotos[j+1] = aux;
				}
			}
		}
		return pilotos;
	}
	public static void popular(Piloto piloto){
		piloto.tempo = (float)Leitor.lerDouble("Digite o tempo");
		piloto.nome = Leitor.lerString("Nome do piloto: ");
		piloto.escuderia = Leitor.lerString("Escuderia: ");
	}
}
