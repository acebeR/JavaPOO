
public class Service {
	public static Crianca[] encrementarVetor(Crianca[] criancas){
		for (int i = 0; i < criancas.length; i++) {
			criancas[i].idade = Leitor.lerInt("Idade da crinca: ");
			criancas[i].sexo = Leitor.lerChar("Sexo: (F)Fem (M)Max", "Sexo errado!", 'F', 'M');
		}
		return criancas;
	}
}
