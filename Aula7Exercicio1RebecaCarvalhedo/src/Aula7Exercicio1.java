/**
 * 
 * @author Rebeca
 * Exercicio: No �ltimo m�s de abril houve em Bras�lia uma importante competi��o de triatlo, 
 * o Ironman 70.3. A  organiza��o precisa gerenciar a participa��o dos atletas neste mega 
 * evento. Cada atleta possui o  numero de inscri��o (que deve ser �nico), 
 * nome, tempo de prova (em horas completas), idade  e se o atleta � elite. 
 * Ele ser� considerado elite se o tempo de prova for menor que 5 horas. 
 * Os atletas ser�o informados de forma indefinida. Ap�s receber os dados dos 
 * atletas apresente os seguintes relat�rios:
 *1 - Todos os atletas da ELITE.
 *2 - Melhor atleta da competi��o.
 *3 - Todos os atletas da categoria 30 a 34 anos. 
  4 - A m�dia de tempo dos atletas. 
  Observa��es: Todas as apresenta��es devem ser em CAIXA ALTA.
 */
public class Aula7Exercicio1 {
	public static final  int MAXIDADE = 34;
	public static final  int MINIDADE = 30;
	
	public static void main(String[] args) {
	
		Competicao competicao = new Competicao();
		View view = new View();
		
		view.popular(competicao);
		view.apresenta(competicao.elite(),"--- ELITE ---");
		view.apresenta(competicao.categoria(MAXIDADE, MINIDADE), "--- DE 30 A 34 ANOS ---");
		view.apresenta(competicao.getMelhor("-- Melhor --"));
		view.apresentarMedia(competicao);
	}
}
