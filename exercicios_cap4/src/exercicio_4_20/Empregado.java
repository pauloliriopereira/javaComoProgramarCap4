package exercicio_4_20;

/*
 * 4.20 Desenvolva um aplicativo Java que determina o salário bruto de cada
 * um de três empregados. A empresa paga as horas normais pelas primeiras 
 * 40 horas trabalhadas de cada funcionário e 50% a mais pelas horas 
 * trabalhadas além das 40 horas. Você recebe uma lista de empregados, o 
 * número de horas trabalhadas que eles trabalham na semana passada e o 
 * salário-hora de cada empregado. Seu programa de aceitar a entrada dessas 
 * informações para cada empregado e, então, determinar e exibir o salário
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