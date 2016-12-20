package exercicio_4_19;

/*
 * 4.19 Uma grande empresa paga seu pessoal de vendas por comissão. O pessoal de vendas
 * recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa semana. Por exemplo,
 * um vendedor que realiza um total de vendas de mercadorias de R$ 5000 em uma semana recebe
 * R$ 200 mais 9% de R$ 5000. ou um total de R$ 650. Foi-lhe fornecida uma lista dos itens
 * vendidos por cada vendedor. Os valores desses itens são como segue:
 * Item     Value
 * 1		239,99
 * 2    	129,75
 * 3     	 99,95
 * 4    	350,89
 * Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor
 * durante a última semana e calcula e exibe os rendimentos do vendedor. Não existe nenhum 
 * limite para o número de itens que pode ser vendido.
 */

public class Comissao 
{
	private double salario = 200;
	private double vendas;
	
	public double getSalario() 
	{
		return salario;
	}
	
	public void setSalario( double comiSalario ) 
	{
		salario = comiSalario;
	}
	
	public double getVendas() 
	{
		return vendas;
	}
	
	public void setVendas( double comiVendas ) 
	{
		vendas = vendas + comiVendas;
	}
	
	public double calculaRendimentos()
	{
		return salario + ( vendas * 0.09 );
	}
	
	public void rendimentoSemanal()
	{
		System.out.printf( "Seu rendimento semannal e de %.2f\n", calculaRendimentos() );
	}
}