package exercicio_4_1_b;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhaLinha extends JPanel
{	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		int altura = getHeight();
		int largura = getWidth();
		int contador = 0;
		int amplitude = ( int ) altura / 15;
		int incremento = 0;
		
		while( contador < 15 ) 
		{
			g.drawLine( 0 , 0 + incremento, 0 + incremento, altura );
			g.drawLine( 0 + incremento, altura, largura, altura - incremento );
			g.drawLine( largura - incremento, 0, largura, altura - incremento );
			g.drawLine( 0, 0 + incremento, largura - incremento, 0 );
			incremento += amplitude;
			contador++;
		}
	}	
}