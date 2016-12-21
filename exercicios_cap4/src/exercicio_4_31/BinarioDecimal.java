package exercicio_4_31;

/*
 * 4_31 Escreva um aplicativo que insere um n�mero inteiro que cont�m 
 * somente 0s e 1s(isto �, um n�mero inteiro bin�rio) e imprime seu 
 * equivalente decimal.
 */

public class BinarioDecimal 
{
	
	public static void converteBinarioDecimal( int numBinario )
	{
		int quadrado = 1;
		boolean verificador = true;
		int resto;
		int quociente;
		int numDecimal = 0;
		
		while( verificador )
		{
			resto = numBinario % 10;
			quociente = numBinario / 10;
			numDecimal += ( resto * quadrado );
			
			if( resto != 0 && quociente == 0 )
				verificador = false;
			
			quadrado *= 2;
			numBinario /= 10;
		}
		System.out.println( numDecimal );
	}
	
	public static void main(String[] args) {
		BinarioDecimal.converteBinarioDecimal( 1010 );
	}
	
}