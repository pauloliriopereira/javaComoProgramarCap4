package exercicio_4_22;

/*
 * 4.22 Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:
 * N    10*N    100*N    1000*N
 * 1    10      100      1000
 * 2    20      200      2000
 * 3    30      300      3000
 * 4    40      400      4000
 * 5    50      500      5000
 */

public class ImprimeTabela 
{
	public static void imprimeTabela()
	{
		System.out.printf( "%s\t%s\t%s\t%s\n", "N", "10*N","100*N","1000*N" );
		int contador = 1;
		while( contador <= 5 )
		{
			System.out.printf( "%d\t%d\t%d\t%d\t\n", contador, contador * 10, contador * 100, contador * 1000 );
			contador++;
		}
	}
	
	public static void main( String[] args ) 
	{
		imprimeTabela();
	}
}