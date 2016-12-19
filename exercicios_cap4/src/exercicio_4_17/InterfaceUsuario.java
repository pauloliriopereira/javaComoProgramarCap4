package exercicio_4_17;

import java.util.Scanner;

public class InterfaceUsuario 
{
	public static void entradaContinua()
	{
		Scanner entrada = new Scanner( System.in );
		int sentinela = 0;
		Tanque tanque = new Tanque();
		
		System.out.print( "Insira o valor da distancia: " );
		tanque.setDistQuilometros( entrada.nextInt() );
		System.out.print( "Insira o valor do combustivel gasto: " );
		tanque.setGasLitros( entrada.nextInt() );
		tanque.exibeConsumo();
		
		System.out.println( "Para continuar digite 0." );
		sentinela = entrada.nextInt(); 
		while( sentinela == 0 )
		{
			System.out.print( "Insira o valor da distancia: " );
			tanque.setDistQuilometros( entrada.nextInt() + tanque.getDistQuilometros() );
			System.out.print( "Insira o valor do combustivel gasto: " );
			tanque.setGasLitros( entrada.nextInt() + tanque.getGasLitros() );
			tanque.exibeConsumo();
			
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