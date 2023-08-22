import java.util.Arrays;
public class Aula8Exercicio1 {
	public static void main(String[] args) {
		Usuario[] usuarios = new Usuario[0];
		char r;

		do{
			Usuario  usuario = new Usuario();
			do{
				usuario.setEmail(View.lerString("Email"));
				if(usuario.isValidarEmail(usuario) == false){
					System.out.println("Emaio existente");
				}
				
			}while(usuario.isValidarEmail(usuario) == false);
			usuario.setQtdSeguidores(View.lerInt("Quantidade de seguidores"));

			usuarios = Arrays.copyOf(usuarios, usuarios.length +1);
			usuarios[usuarios.length -1] = usuario;


			r = View.lerChar("Deseja continuar cadastrando? (S)sim (N)nao", 'S', 'N', "Resposta invalida");
		}while(r == 'S');



	}



