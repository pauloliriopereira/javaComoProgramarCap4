package exercicio_4_38;

/*
 * 4.38 Uma empresa que quer enviar dados pela internet pediu-lhe para escrever
 * um programa que criptografe dados para que estes possam ser transmitidos com
 * maior segurança. Todos os dados são transmitidos como inteiros de quatro 
 * dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos inserido pelo 
 * usuário e criptografá-lo desta maneira: substitua cada dígito pelo resultado
 * da adição de 7 ao dígito e obtendo o resto depois da divisão do novo valor
 * por 10. Troque então o primeiro dígito pelo terceiro e segundo dígito pelo 
 * quarto. Então, imprima o inteiro criptografado. Escreva um aplicativo separado
 * que recebe entrada de um inteiro de quatro dígitos criptografados e o 
 * descriptografa para formar o número original.
 */

public class Cripto 
{
	private int digito1;
	private int digito2;
	private int digito3;
	private int digito4;
	
	public Cripto( int numero )
	{
		separaDigitos( numero );
	}
	
	public int criptografa()
	{
		soma7troca();
		return transforma();
	}
	
	private void separaDigitos( int numero )
	{
		digito4 = numero % 10;
		digito3 = ( numero / 10 ) % 10;
		digito2 = ( numero / 100 ) % 10;
		digito1 = ( int ) numero / 1000;
	}
	
	private void soma7troca()
	{
		int temp1, temp2;
		temp1 = soma7( digito4 ) % 10;
		temp2 =	soma7( digito2 ) % 10;
		digito2 = temp1;
		digito4 = temp2;
		temp1 =	soma7( digito3 ) % 10;
		temp2 =	soma7( digito1 ) % 10;
		digito1 = temp1;
		digito3 = temp2;
	}
	
	private int transforma()
	{
		digito3 *= 10;
		digito2 *= 100;
		digito1 *= 1000;
		
		return digito1 + digito2 + digito3 + digito4;
	}
	
	public int desCriptografa()
	{
		sub7troca();
		return transforma();
	}
	
	private void sub7troca()
	{
		int temp1, temp2;
		temp1 = sub7( digito4 ) % 10;
		temp2 =	sub7( digito2 ) % 10;
		digito2 = temp1;
		digito4 = temp2;
		temp1 =	sub7( digito3 ) % 10;
		temp2 =	sub7( digito1 ) % 10;
		digito1 = temp1;
		digito3 = temp2;
	}
	
	private int sub7( int numero )
	{
		return ( ( numero - 7 ) > 0 ) ? ( numero - 7 ) : ( numero + 3 ); 
	}
	
	private int soma7( int numero )
	{
		return ( numero + 7 );
	}
	
	public static void main( String[] args ) 
	{
		Cripto cripto = new Cripto( 1234 );
		int numero = cripto.criptografa();
		System.out.println( numero );
		
		Cripto desCripto = new Cripto( numero );
		System.out.println( desCripto.desCriptografa() );
	}
}