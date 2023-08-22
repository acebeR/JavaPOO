/**
 * 
 * @author Rebeca
 *	 
 *	Faça um sistema orientado a objetos que seja possível informar os dados de vários Contribuintes 
 *	(Nome, CPF e o que mais for necessário) e que no final apresente além dos dados das contribuições
 * 	de cada um, o seguinte:

	A - Quanto de IR foi arrecadado.
	
	B - Quanto de INSS foi arrecadado.
	
	C- Quantos dependentes foram informados.
	
	D- O contribuinte que mais contribuiu
 */


public class Aula5Exercicio2 {
	public static void main(String[] args) {
		Governo governo = View.lerDadosGoverno();
		View.apresentaPesquisa(governo);
	}
}
