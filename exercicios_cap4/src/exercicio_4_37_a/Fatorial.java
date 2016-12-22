package exercicio_4_37_a;

public class Fatorial 
{
	public int calculaFatorial( int numero )
	{
		int fatorial = 1;
		while( numero > 0 )
		{
			fatorial *= numero;
			numero--;
		}
		
		return fatorial;
	}
	
	public double estimaValorE( int numero )
	{
		double valorE = 0;
		
		while( numero >= 0 )
		{
			valorE = valorE + ( 1 / calculaFatorial( numero ) );
			numero--;
		}
		
		return valorE;
	}

	public static void main( String[] args ) 
	{
		Fatorial fatorial = new Fatorial();
		System.out.println( fatorial.calculaFatorial( 0 ) );
	}
}