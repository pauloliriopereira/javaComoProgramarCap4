package exercicio_4_17;

/*
 * Desenvolva um aplicativo Java que receba como entrada os quil�metros
 * dirigidos e os litros de gasolina consumidos para cada tanque cheio. 
 * O programa deve calcular e exibir o consumo em quil�metros/litro para
 * cada tanque cheio e imprimir a quilometragem combinada e a soma total
 * de litros de combust�vel consumidos at� esse ponto. Todos os c�lculos
 * de m�dia devem produzir resultados de ponto flutuante. Utilize classe
 * Scanner e repeti��o controlada por sentinela para obter os dados do
 * usu�rio.
 */

public class Tanque 
{
	private int distQuilometros;
	private int gasLitros;
	
	public Tanque(){}
	
	public Tanque( int tanDistQuilo, int tanGasLitros )
	{
		distQuilometros = tanDistQuilo;
		gasLitros = tanGasLitros;
	}

	public int getDistQuilometros() 
	{
		return distQuilometros;
	}

	public void setDistQuilometros( int distQuilometros ) 
	{
		this.distQuilometros = distQuilometros;
	}

	public int getGasLitros() 
	{
		return gasLitros;
	}
	
	public void setGasLitros( int gasLitros ) 
	{
		this.gasLitros = gasLitros;
	}
	
	public double calculaConsumo()
	{
		return ( double ) getDistQuilometros() / getGasLitros();
	}
	
	public void exibeConsumo()
	{
		System.out.printf( "Litros = %d L\n", getGasLitros() );
		System.out.printf( "Distancia percorrida = %d km\n", getDistQuilometros() );
		System.out.printf( "Consumo = %.2f km/L\n", calculaConsumo() );
	}
}