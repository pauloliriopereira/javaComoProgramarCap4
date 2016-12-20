package exercicio_4_20;

import java.util.Scanner;

public class InterfaceUsuario 
{
	public static void entradaContinua()
	{
		Scanner entrada = new Scanner( System.in );
		int sentinela = 0;
		Empregado empregado = new Empregado();
		
		System.out.print( "Insira o nome do Funcionário: " );
		empregado.setNome( entrada.nextLine() );
		
		System.out.print( "Insira as horas trabalhadas:" );
		empregado.setHorasTrabalhadas( entrada.nextInt() );
		
		System.out.print( "Insira o valor da hora do funcionario:" );
		empregado.setValorHora( entrada.nextInt() );
		
		empregado.geraExtratoPagamento();
		
		System.out.println( "Para continuar digite 0." );
		sentinela = entrada.nextInt();
		
		while( sentinela == 3 )
		{
			System.out.print( "Insira o nome do Funcionário: " );
			empregado.setNome( entrada.nextLine() );
			
			System.out.println( "Insira as horas trabalhadas:" );
			empregado.setHorasTrabalhadas( entrada.nextInt() );
			
			System.out.println( "Insira o valor da hora do funcionario:" );
			empregado.setHorasTrabalhadas( entrada.nextInt() );
			
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