package exercicio_4_37_c;

public class FuncaoeX 
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
	
	public int exponenciacao( int numero, int expoente )
	{
		int contador = 1;
		int resultado = 1;
		
		while( contador <= expoente )
		{
			resultado *= numero;
			contador++;
		}
		
		return resultado;
	}
	
	public double estimaValorEX( int numero )
	{
		double valorE = 0;
		int base = numero;
		 
		while( numero >= 0 )
		{
			valorE = valorE + ( exponenciacao( base, numero ) / calculaFatorial( numero ) );
			numero--;
		}
		
		return valorE;
	}

	public static void main( String[] args ) 
	{
		FuncaoeX funcao = new FuncaoeX();
		System.out.println( funcao.estimaValorEX( 2 ) );
	}

}