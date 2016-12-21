package exercicio_4_33;

public class ExibeMultiplo 
{
	public static void exibe()
	{
		int multiplo = 1;
		while( true )
		{
			multiplo *= 2;
			System.out.println( multiplo );
		}
	}
	
	public static void main(String[] args) 
	{
		ExibeMultiplo.exibe();
	}
}