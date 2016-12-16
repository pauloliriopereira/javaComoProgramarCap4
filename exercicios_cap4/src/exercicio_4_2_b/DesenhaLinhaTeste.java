package exercicio_4_2_b;

import javax.swing.JFrame;

public class DesenhaLinhaTeste 
{
	public static void main( String[] args ) 
	{
		DesenhaLinha painel = new DesenhaLinha();
		JFrame aplicacao = new JFrame();
		aplicacao.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		aplicacao.add( painel );
		aplicacao.setSize( 250, 250 );
		aplicacao.setVisible( true );
	}
}