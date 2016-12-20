package exercicio_4_20;

/*
 * 4.20 Desenvolva um aplicativo Java que determina o sal�rio bruto de cada
 * um de tr�s empregados. A empresa paga as horas normais pelas primeiras 
 * 40 horas trabalhadas de cada funcion�rio e 50% a mais pelas horas 
 * trabalhadas al�m das 40 horas. Voc� recebe uma lista de empregados, o 
 * n�mero de horas trabalhadas que eles trabalham na semana passada e o 
 * sal�rio-hora de cada empregado. Seu programa de aceitar a entrada dessas 
 * informa��es para cada empregado e, ent�o, determinar e exibir o sal�rio
 * bruto do empregado.
 */

public class Empregado 
{
	private String nome;
	private double horasTrabalhadas;
	private double valorHora;
	
	public Empregado(){}
	
	public Empregado( String empNome, double empHorasTrab, double empValorHora )
	{
		nome = empNome;
		horasTrabalhadas = empHorasTrab;
		valorHora = empValorHora;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome( String empNome ) 
	{
		nome = empNome;
	}
	
	public double getHorasTrabalhadas()
	{
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas( double empHorasTrab ) 
	{
		horasTrabalhadas = empHorasTrab;
	}

	public double getValorHora() 
	{
		return valorHora;
	}

	public void setValorHora( double empValorHora ) 
	{
		valorHora = empValorHora;
	}
	
	public double calculaHoraExtra()
	{
		return ( horasTrabalhadas - 40 ) * valorHora * 1.5;
	}
	
	public double calculaSalario()
	{
		if( horasTrabalhadas > 40  ) 
		{
			return ( 40 * valorHora ) + calculaHoraExtra();
		} 
		else
		{
			return horasTrabalhadas * valorHora;
		}
	}
	
	public void geraExtratoPagamento()
	{
		System.out.println( "Extrato do Pagamento" );
		System.out.printf( "\nNome do funcionario: %s\n", getNome() );
		System.out.printf( "Salario: %.2f\n", calculaSalario() );
	}
}