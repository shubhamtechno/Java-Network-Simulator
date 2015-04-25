package net.codejava.graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * This program demonstrates how to draw lines using Graphics2D object.
 * @author www.codejava.net
 *
 */
public class LinesDrawingExample extends JFrame {

	public LinesDrawingExample() {
		super("Lines Drawing Demo");
		
		setSize(480, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	void drawLines(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.RED);
		
		float[] dashingPattern1 = {2f, 2f};
		Stroke stroke1 = new BasicStroke(2f, BasicStroke.CAP_BUTT, 
				BasicStroke.JOIN_MITER, 1.0f, dashingPattern1, 2.0f);
		
		g2d.setStroke(stroke1);
		g2d.drawLine(120, 50, 360, 50);

		g2d.setColor(Color.GREEN);
		
		float[] dashingPattern2 = {10f, 4f};
		Stroke stroke2 = new BasicStroke(4f, BasicStroke.CAP_BUTT, 
				BasicStroke.JOIN_MITER, 1.0f, dashingPattern2, 0.0f);
		
		g2d.setStroke(stroke2);
		g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
		
		g2d.setColor(Color.BLUE);
		
		float[] dashingPattern3 = {10f, 10f, 1f, 10f};
		Stroke stroke3 = new BasicStroke(4f, BasicStroke.CAP_SQUARE, 
				BasicStroke.JOIN_MITER, 1.0f, dashingPattern3, 0.0f);
		
		g2d.setStroke(stroke3);
		g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		drawLines(g);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LinesDrawingExample().setVisible(true);
			}
		});
	}
}