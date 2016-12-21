package exercicio_4_29;

/*
 * 4.29 Escreva um aplicativo que solicita para o usuário inserir o 
 * tamanho do lado de um quadrado e, então, exibe um quadrado vazio 
 * desse tamanho com asteriscos. Seu programa deve trabalhar com 
 * quadrados de todos os comprimentos de lado possíveis entre 1 e 20.
 */

public class DesenhaQuadrado 
{
	private int lado;
	
	public DesenhaQuadrado( int desQuaLado )
	{
		lado = desQuaLado;
	}
	
	public void desenha()
	{
		int contador = 1;
		int tamanho = lado - 2;
		
		desenhaLinhaCheia();
		
		while( contador <= tamanho )
		{
			desenhaLinhaVazia();
			contador++;
		}
		
		desenhaLinhaCheia();
		
	}
	
	private void desenhaLinhaCheia()
	{
		int contador = 1;
		while( contador <= lado )
		{
			System.out.print( '*' );
			contador++;
		}
		System.out.println();
	}
	
	private void desenhaLinhaVazia()
	{
		int contador = 1;
		int tamanho = lado - 2;
		System.out.print( '*' );
		while( contador <= tamanho )
		{
			System.out.print( ' ' );
			contador++;
		}
		System.out.print( '*' );
		System.out.println();
	}
}
