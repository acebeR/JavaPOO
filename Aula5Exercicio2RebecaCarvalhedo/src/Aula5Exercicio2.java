/**
 * 
 * @author Rebeca
 *	 
 *	Fa�a um sistema orientado a objetos que seja poss�vel informar os dados de v�rios Contribuintes 
 *	(Nome, CPF e o que mais for necess�rio) e que no final apresente al�m dos dados das contribui��es
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
