/**
 * 
 * @author UC15101831
 *O que a pessoa est� sentindo) que ser� um texto e pode receber likes,
 * ser compartilhado e/ou ser comentado.
 */
public class Post {
	private String sentindo;
	private char gostou;
	

	public String getSentindo() {
		return sentindo;
	}

	public void setSentindo(String sentindo) {
		this.sentindo = sentindo;
	}

	public char getGostou() {
		return gostou;
	}

	public void setGostou(char gostou) {
		this.gostou = gostou;
	}
	
	
}
