package exercicio_4_30;

/*
 * 4_30 Um palíndromo é uma sequência de caracteres que é lida 
 * da esquerda para a direita ou da direita para a esquerda. 
 * Por exemplo, cada um dos seguintes inteiros de cinco dígitos
 * é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um 
 * aplicativo que lê um inteiro de cinco dígitos e determina 
 * se ele é ou não um palíndromo. Se o número não for de cinco 
 * dígitos, exiba uma mensagem de erro e permita que o 
 * usuário insira um novo valor.
 */

public class Palindromo5 
{
	
	private int a1, a2, a4, a5;
	
	public Palindromo5( int numero )
	{
		a1 = numero / 10000;
		a2 = ( numero / 1000 ) % 10;
		a4 = ( numero / 10 ) % 10;
		a5 = numero % 10;
	}
	
	private boolean vericaPalindromo5()
	{
		if( ( a1 == a5 ) && ( a2 == a4 ) )
			return true;
		
		return false;
	}
	
	public void mostraResultado()
	{
		if( vericaPalindromo5() )
			System.out.println( "E um palindromo!!!" );
		else
			System.out.println( "Nao e um palindromo!!!" );
	}
}