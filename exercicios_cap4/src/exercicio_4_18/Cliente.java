package exercicio_4_18;

/*
 * 4.18 Desenvolva um aplicativo Java que determine se um cliente de uma loja de 
 * departamentos excedeu o limite de cr�dito em uma conta-corrente. Para cada 
 * cliente, os seguintes fatos est�o dispon�veis:
 * a) n�mero de conta.
 * b) saldo no in�cio do m�s.
 * c) saldo de todos os itens cobrados desse cliente no m�s.
 * d) total de cr�ditos aplicados ao cliente no m�s.
 * e) limite de cr�dito autorizado.
 * O programa deve inserir todos esses fatos como inteiros, calcular o 
 * novo saldo(= saldo inicial + despesas - cr�ditos), exibir o novo saldo e 
 * determinar se o novo saldo excede ao limite de cr�dito do cliente. 
 * Para aqueles clientes cujo limite de cr�dito foi excedido, o programa 
 * deve exibir a mensagem �Limite de cr�dito excedido�.
 */

public class Cliente 
{
	private int numConta;
	private int saldoInicioMes;
	private int saldoItensCobrados;
	private int totalDeCredito;
	private int limiteDeCredito;
	
}