package exercicio_4_21;

/*
 * 4.21 O processo de localizar o maior valor � muito utilizado em 
 * aplicativos de computador. Por exemplo, um programa que 
 * determina o vencedor de uma competi��o de vendas inseriria o 
 * n�mero de unidades vendidas por cada vendedor. O vendedor que 
 * vende mais unidades ganha a competi��o. Escreva um programa em pseudoc�digo 
 * e, ent�o, um aplicativo Java que aceita como entrada uma s�ria de 10 inteiros e
 * determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo 
 * menos tr�s vari�veis a seguir:
 * a) counter: um contador para contar at� 10.
 * b) number : o inteiro mais recentemente inserido pelo usu�rio.
 * c) largets: o maior n�mero encontrado at� agora.
 */

public class Maior 
{
	private int maior;
	
	public void verificaMaior( int numero )
	{
		if( numero > maior )
		  maior = numero;
	}
	
	public void apresentaResultado()
	{
		System.out.printf( "O maior valor �: %d", maior );
	}
}