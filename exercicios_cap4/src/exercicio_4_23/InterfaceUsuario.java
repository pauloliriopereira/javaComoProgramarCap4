package exercicio_4_23;

import java.util.Scanner;

public class InterfaceUsuario 
{
	public static void entradaLimitada()
	{
		Scanner entrada = new Scanner( System.in );
		int contador = 1;
		Maior maior = new Maior();
		
		while( contador <= 10 )
		{
			System.out.print( "Insira um numero inteiro: " );
			maior.verificaMaior( entrada.nextInt() );
			
			contador++;
		}
		
		maior.apresentaResultado();
		entrada.close();
	}
	
	public static void main( String[] args ) 
	{
		InterfaceUsuario.entradaLimitada();
	}
}