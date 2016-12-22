package exercicio_4_37_b;

public class EstimaFuncaoE 
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
			valorE = valorE + ( 1.0 / calculaFatorial( numero ) );
			numero--;
		}
		
		return valorE;
	}

	public static void main( String[] args ) 
	{
		EstimaFuncaoE funcao = new EstimaFuncaoE();
		System.out.println( funcao.estimaValorE( 3 ) );
	}
}