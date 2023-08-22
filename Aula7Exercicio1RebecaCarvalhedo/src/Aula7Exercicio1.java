/**
 * 
 * @author Rebeca
 * Exercicio: No último mês de abril houve em Brasília uma importante competição de triatlo, 
 * o Ironman 70.3. A  organização precisa gerenciar a participação dos atletas neste mega 
 * evento. Cada atleta possui o  numero de inscrição (que deve ser único), 
 * nome, tempo de prova (em horas completas), idade  e se o atleta é elite. 
 * Ele será considerado elite se o tempo de prova for menor que 5 horas. 
 * Os atletas serão informados de forma indefinida. Após receber os dados dos 
 * atletas apresente os seguintes relatórios:
 *1 - Todos os atletas da ELITE.
 *2 - Melhor atleta da competição.
 *3 - Todos os atletas da categoria 30 a 34 anos. 
  4 - A média de tempo dos atletas. 
  Observações: Todas as apresentações devem ser em CAIXA ALTA.
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
