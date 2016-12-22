package exercicio_4_36;

import java.util.Scanner;

public class TrianguloDireito 
{
	private int a, b, c;
	
	public TrianguloDireito( int ladoA, int ladoB, int ladoC )
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
	
	private boolean verificaTrianguloDireito()
	{
		if( a > b && a > c )
		{
			return calculaIgualdadeHipotenusa( a, b, c );
		} 
		else if( b > a && b > c )
		{
			return calculaIgualdadeHipotenusa( b, a, c );
		}
		else if( c > a && c > b )
		{
			return calculaIgualdadeHipotenusa( c, a, b );
		}
		
		return false;
	}
	
	private int quadrado( int numero )
	{
		return numero * numero;
	}
	
	private boolean calculaIgualdadeHipotenusa( int ladoA, int ladoB, int ladoC )
	{
		return quadrado( ladoA ) == ( quadrado( ladoB ) + quadrado( ladoC ) );
	}
	
	public void apresentaResultado()
	{
		if( determina() && verificaTrianguloDireito() ) 
			System.out.println( "E um triangulo direito." );
		else
			System.out.println( "Nao e um triangulo direito." );
	}
	
	public static void entradaLimitada()
	{
		Scanner entrada = new Scanner( System.in );
		TrianguloDireito triangulo;
		
		System.out.print( "Insira tres valores inteiros para determinar um triangulo direito: " );
		triangulo = new TrianguloDireito( entrada.nextInt(), entrada.nextInt(), entrada.nextInt() );
		
		triangulo.apresentaResultado();
		
		entrada.close();
	}
	
	public static void main( String[] args ) 
	{
		entradaLimitada();
	}
}