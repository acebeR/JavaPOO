/**
 * 
 * @author UC15101831
 *Um usuário desta rede possui e-mail, senha, quantidade de seguidores e todos os seus posts de sua 
 *linha do tempo. 
 */
import java.util.Arrays;
public class Usuario {
	private String email;
	private String senha;
	private int qtdSeguidores;
	private Post[] post = new Post[0];
	private int qtdPost;
	
	
	
	public int getQtdPost() {
		return qtdPost;
	}
	public void setQtdPost(int qtdPost) {
		this.qtdPost = qtdPost;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getQtdSeguidores() {
		return qtdSeguidores;
	}
	public void setQtdSeguidores(int qtdSeguidores) {
		this.qtdSeguidores = qtdSeguidores;
	}
	
	public Post[] getPost() {
		return post;
	}
	public void setPost(Post[] post) {
		this.post = post;
	}
	
	public void addPost(Post post){
		setPost(Arrays.copyOf(getPost(), getPost().length + 1));
		getPost()[getPost().length - 1] = post;
	}
	public Post[] popular(){
		char r;
		do{
			Post temp = new Post();
			
			r = View.lerChar("Deseja continuar cadastrando? (S)sim (N)nao", 'S', 'N', "Resposta invalida");
		}while(r == 'S');
	}
	
	public boolean isValidarEmail(Usuario usuario){
		if(getEmail() == usuario.email){
			return false;
		}
		return true;
	}
	
	
	
}
