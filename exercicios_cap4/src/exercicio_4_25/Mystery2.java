package exercicio_4_25;

public class Mystery2 
{
	public static void main( String[] args ) 
	{
		int count = 1;
		
		while( count <= 10 )
		{
			System.out.println( count % 2 == 1 ? "****" : "++++++++" );
			++count;
		}
	}
} // fim da classe Mystery2