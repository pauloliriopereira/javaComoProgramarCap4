package exercicio_4_2_a;

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
		double amplitude = altura / 15;
		int incremento = 0;
		
		while( contador < 15 ) 
		{
			g.drawLine( 0, 0, largura - incremento, 0 + incremento );
			incremento += amplitude;
			contador++;
		}
	}	
}