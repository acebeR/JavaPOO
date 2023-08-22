import java.util.Arrays;

import org.omg.PortableServer.ForwardRequestHelper;
public class RedeSocial {
	private Usuario[] usuarios = new Usuario[0];

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	
//	public Usuario[] popular(RedeSocial rede){
//		char r;
//		do{
//			rede.setUsuarios(usuarios)
//			
//			r = View.lerChar("Deseja continuar cadastrando? (S)sim (N)nao", 'S', 'N', "Resposta invalida");
//		}while(r == 'S');
//	}
//	
//	public void addUsuario(Usuario usuario){
//		
//		usuarios = Arrays.copyOf(usuarios, usuarios.length +1);
//		usuarios[usuarios.length -1] = usuario;
//	
//	}
//	
	
	public Usuario getMaiorPost(){
		
		Usuario maior = new Usuario();
		maior = getUsuarios()[0];

		for (Usuario temp : getUsuarios()) {
			if(temp.getQtdPost() > maior.getQtdPost()){
				maior = temp;
			}else
				maior = maior;
		}
		return maior;
		
		
	}
	
	
	
}
