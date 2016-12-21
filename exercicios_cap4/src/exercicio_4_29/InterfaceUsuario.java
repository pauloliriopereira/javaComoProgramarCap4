package exercicio_4_29;

import java.util.Scanner;

public class InterfaceUsuario 
{
	public static void entradaLimitada()
	{
		Scanner entrada = new Scanner( System.in );
		DesenhaQuadrado quadrado;
		
		System.out.print( "Insira o valor do lado do quadrado: " );
		quadrado = new DesenhaQuadrado( entrada.nextInt() );
		
		quadrado.desenha();
		
		entrada.close();
	}
	
	public static void main( String[] args ) 
	{
		InterfaceUsuario.entradaLimitada();
	}
}