package exercicio_4_6;

/*
 * Combine as instruções escritas no 4.5 em um aplicativo Java que calcule 
 * e imprima a soma dos inteiros de 1 a 10. Utilize a instrução while para
 * fazer loop pelas instruções de cálculo e incremento. O loop deve terminar 
 * quando o valor de x tornar-se 11.
 */

public class CalculaSoma10 
{
	public static void main( String[] args ) 
	{
		int contador = 1;
		int soma = 0;
		
		while( contador <= 10 )
		{
			soma += contador;
			contador++;
		}
		System.out.printf( "A soma é: %d\n", soma );
	}
}