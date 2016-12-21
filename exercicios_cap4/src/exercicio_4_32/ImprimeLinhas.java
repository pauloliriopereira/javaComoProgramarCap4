package exercicio_4_32;

/*
 * 4.32 Escreva um aplicativo que utiliza apenas as instruções de saída:
 * System.out.print( “* ” );
 * System.out.print( “ ” );
 * System.out.println();
 * para exibir o padrão de tabuleiro de damas a seguir. Observe que 
 * uma chamada de método System.out.println sem argumentos faz com o programa
 * gere saída de um único caractere de nova linha.
 */

public class ImprimeLinhas 
{
	private void imprimeLinhaImpar()
	{
		int contador = 1; 
		while( contador <= 8 )
		{
			System.out.print( "* " );
			contador++;
		}
		
		System.out.println();
	}
	
	private void imprimeLinhaPar()
	{
		int contador = 1;
		System.out.print( " " );
		while( contador <= 8 )
		{
			System.out.print( "* " );
			contador++;
		}
		
		System.out.println();
	}
	
	public void geraTabuleiro()
	{
		int contador = 1;
		while( contador <= 8 )
		{
			if( contador % 2 == 1 )
				imprimeLinhaImpar();
			else
				imprimeLinhaPar();
			
			contador++;
		} 
	}
	
	public static void main( String[] args ) 
	{
		ImprimeLinhas imprime = new ImprimeLinhas();
		imprime.geraTabuleiro();
	}
}