package exercicio_4_18;

import java.util.Scanner;

public class InterfaceUsuario 
{
	public static void entradaContinua()
	{
		Scanner entrada = new Scanner( System.in );
		int sentinela = 0;
		Cliente cliente = new Cliente( 01, 1000, 500 );
		
		System.out.print( "Insira o valor da despesa: " );
		cliente.debito( entrada.nextInt() );
		cliente.exibeSaldo();
		
		System.out.println( "Para continuar digite 0." );
		sentinela = entrada.nextInt(); 
		
		while( sentinela == 0 )
		{
			System.out.print( "Insira o valor da despesa: " );
			cliente.debito( entrada.nextInt() );
			cliente.exibeSaldo();
			
			System.out.println( "Para continuar digite 0." );
			sentinela = entrada.nextInt(); 
		}
		
		entrada.close();
	}
	
	public static void main( String[] args ) 
	{
		InterfaceUsuario.entradaContinua();
	}
}