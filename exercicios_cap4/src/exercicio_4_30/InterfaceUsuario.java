package exercicio_4_30;

import java.util.Scanner;

public class InterfaceUsuario 
{
	public static void entradaLimitada()
	{
		Scanner entrada = new Scanner( System.in );
		Palindromo5 palindromo;
		
		System.out.print( "Insira um numero de 5 digitos: " );
		int numero = entrada.nextInt();
		palindromo = new Palindromo5( numero );
		int verificador = ( int ) numero / 10000;
		
		while( verificador == 0 )
		{
			System.out.println( "Valor invalido!!!" );
			System.out.print( "Insira um numero de 5 digitos: " );
			numero = entrada.nextInt();
			palindromo = new Palindromo5( numero );
			verificador = numero / 10000;
		}
		
		palindromo.mostraResultado();
		entrada.close();
	}
	
	public static void main( String[] args ) 
	{
		InterfaceUsuario.entradaLimitada();
	}
}