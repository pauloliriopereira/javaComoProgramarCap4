package exercicio_4_1_a;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhaLinha extends JPanel
{	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		int height = getHeight();
		int contador = 0;
		int amplitude = ( int ) 250 / 15;
		int incremento = 0;
		
		while( contador < 15 ) 
		{
			g.drawLine( 0 , 0 + incremento, 0 + incremento, height );
			incremento += amplitude;
			contador++;
		}
	}	
}