
public class EspecificoDoPrograma {
	public static Piloto[] retornaVetorDeStruct(Piloto[] pilotos,Piloto piloto){
		Piloto aux[] = new Piloto[pilotos.length + 1];
	
		for (int i = 0; i < pilotos.length; i++) {
			aux[i] = pilotos[i];
		}
		
		aux[pilotos.length] = piloto;
		
		return aux;
	}
}
