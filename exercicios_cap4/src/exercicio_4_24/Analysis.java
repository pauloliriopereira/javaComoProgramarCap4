package exercicio_4_24;

import java.util.Scanner;

/*
 * 4.24 Modifique o programa na Figura 4.12 para validar suas entradas. Para
 * qualquer entrada, se o valor inserido for diferente de 1 ou 2, continue
 * o loop até o usuário inserir um valor correto.
 */

public class Analysis 
{
	public static void main( String[] args ) 
	{
		Scanner input = new Scanner( System.in );
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;
		
		while( studentCounter <= 10 ) 
		{
			System.out.println( "Enter result (1 = pass, 2 = fail): " );
			result = input.nextInt();
			if( ( result == 1 ) || ( result == 2 ) )
			{
				if( result == 1 )
					passes = passes + 1;
				else
					failures = failures + 1;
			
				studentCounter = studentCounter + 1;
			}
		}
		
		System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );
		
		if( passes > 8 )
		  System.out.println( "Bonus to instructor!" );
		
		input.close();
	}
}