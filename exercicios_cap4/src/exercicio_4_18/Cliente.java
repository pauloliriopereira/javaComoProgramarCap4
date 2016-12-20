package exercicio_4_18;

/*
 * 4.18 Desenvolva um aplicativo Java que determine se um cliente de uma loja de 
 * departamentos excedeu o limite de credito em uma conta-corrente. Para cada 
 * cliente, os seguintes fatos estao disponiveis:
 * a) numero de conta.
 * b) saldo no inicio do mes.
 * c) saldo de todos os itens cobrados desse cliente no mes.
 * d) total de creditos aplicados ao cliente no mes.
 * e) limite de credito autorizado.
 * O programa deve inserir todos esses fatos como inteiros, calcular o 
 * novo saldo(= saldo inicial + despesas - creditos), exibir o novo saldo e 
 * determinar se o novo saldo excede ao limite de credito do cliente. 
 * Para aqueles clientes cujo limite de credito foi excedido, o programa 
 * deve exibir a mensagem "Limite de credito excedido".
 */

public class Cliente 
{
	private int credito;
	private int numeroDaConta;
	private int saldo;
		
	public Cliente( int cliNumConta, int montanteInicial, int cliCredito )
	{
		numeroDaConta = cliNumConta;
		credito = cliCredito;
		if ( montanteInicial > 0.0 ) 
		{
			saldo = montanteInicial;
		}
	}
		
	public void credito( int montante )
	{
		saldo = saldo + montante;
	}

	public void debito( int montante )
	{
		if( ( saldo + credito ) >= montante ) 
		{
			saldo = saldo - montante;
			if( saldo < 0 )
			{
				credito = credito + saldo;
				saldo = 0;
			}
		}
		else
		{
			System.out.println( "Limite de credito excedido" );
		}
	}

	public int getBalance()
	{
		return saldo;
	}

	public int getNumeroDaConta() 
	{
		return numeroDaConta;
	}

	public void setNumeroDaConta( int numeroDaConta ) 
	{
		this.numeroDaConta = numeroDaConta;
	}

	public int getCredito() 
	{
		return credito;
	}

	public void setCredito( int cliCredito ) 
	{
		this.credito = cliCredito;
	}
	
	public int getLimiteDeCredito()
	{
		return saldo + credito;
	}
	
	public void exibeSaldo()
	{
		System.out.printf( "Seu saldo atual e de %d\n", getBalance() );
		System.out.printf( "Seu limite atual e de %d\n\n", getLimiteDeCredito() );
	}
}