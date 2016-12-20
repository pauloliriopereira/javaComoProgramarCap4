package exercicio_4_19;

import java.util.Scanner;

public class InterfaceUsuario 
{
	public static void entradaContinua()
	{
		Scanner entrada = new Scanner( System.in );
		int sentinela = 0;
		Comissao comissao = new Comissao();
		
		System.out.print( "Insira o valor da venda: " );
		comissao.setVendas( entrada.nextDouble() );
		
		System.out.println( "Para continuar digite 0." );
		sentinela = entrada.nextInt();
		
		while( sentinela == 0 )
		{
			System.out.print( "Insira o valor da venda: " );
			comissao.setVendas( entrada.nextDouble() );
			
			System.out.println( "Para continuar digite 0." );
			sentinela = entrada.nextInt();
		}
		
		comissao.rendimentoSemanal();
		entrada.close();
	}
	
	public static void main( String[] args ) 
	{
		InterfaceUsuario.entradaContinua();
	}
}