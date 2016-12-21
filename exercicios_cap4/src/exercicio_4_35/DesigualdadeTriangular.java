package exercicio_4_35;

import java.util.Scanner;

public class DesigualdadeTriangular 
{
	private int a, b, c;
	
	public DesigualdadeTriangular( int ladoA, int ladoB, int ladoC )
	{
		a = ladoA;
		b = ladoB;
		c = ladoC;
	}
	
	private boolean determina()
	{
		if( ( a < b + c ) && ( b < a + c ) && ( c < a + b ) )
			return true;
		
		return false;
	}
	
	public void apresentaResultado()
	{
		if( determina() ) 
			System.out.println( "E um triangulo." );
		else
			System.out.println( "Nao e um triangulo." );
	}
	
	public static void entradaLimitada()
	{
		Scanner entrada = new Scanner( System.in );
		DesigualdadeTriangular desTriangulo;
		
		System.out.print( "Insira tres valores inteiros para determinar um triangulo: " );
		desTriangulo = new DesigualdadeTriangular( entrada.nextInt(), entrada.nextInt(), entrada.nextInt() );
		
		desTriangulo.apresentaResultado();
		
		entrada.close();
	}
	
	public static void main( String[] args ) 
	{
		entradaLimitada();
	}
}