package exercicio_4_23;

/*
 * 4.23 Usando uma abordagem semelhante àquela de exercício 4.21, encontre os dois maiores valores inseridos.
 */

public class Maior 
{
	private int maior;
	private int segundoMaior;
	
	public void verificaMaior( int numero )
	{
		if( numero > maior )
		{
			segundoMaior = maior;
			maior = numero;
		}
		  
	}
	
	public void apresentaResultado()
	{
		System.out.printf( "O maior valor e: %d\n", maior );
		System.out.printf( "E o segundo maior valor e: %d", segundoMaior );
	}
}