package exercicio_4_21;

/*
 * 4.21 O processo de localizar o maior valor é muito utilizado em 
 * aplicativos de computador. Por exemplo, um programa que 
 * determina o vencedor de uma competição de vendas inseriria o 
 * número de unidades vendidas por cada vendedor. O vendedor que 
 * vende mais unidades ganha a competição. Escreva um programa em pseudocódigo 
 * e, então, um aplicativo Java que aceita como entrada uma séria de 10 inteiros e
 * determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo 
 * menos três variáveis a seguir:
 * a) counter: um contador para contar até 10.
 * b) number : o inteiro mais recentemente inserido pelo usuário.
 * c) largets: o maior número encontrado até agora.
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
		System.out.printf( "O maior valor é: %d", maior );
	}
}