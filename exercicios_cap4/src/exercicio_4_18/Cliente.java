package exercicio_4_18;

/*
 * 4.18 Desenvolva um aplicativo Java que determine se um cliente de uma loja de 
 * departamentos excedeu o limite de crédito em uma conta-corrente. Para cada 
 * cliente, os seguintes fatos estão disponíveis:
 * a) número de conta.
 * b) saldo no início do mês.
 * c) saldo de todos os itens cobrados desse cliente no mês.
 * d) total de créditos aplicados ao cliente no mês.
 * e) limite de crédito autorizado.
 * O programa deve inserir todos esses fatos como inteiros, calcular o 
 * novo saldo(= saldo inicial + despesas - créditos), exibir o novo saldo e 
 * determinar se o novo saldo excede ao limite de crédito do cliente. 
 * Para aqueles clientes cujo limite de crédito foi excedido, o programa 
 * deve exibir a mensagem “Limite de crédito excedido”.
 */

public class Cliente 
{
	private int numConta;
	private int saldoInicioMes;
	private int saldoItensCobrados;
	private int totalDeCredito;
	private int limiteDeCredito;
	
}