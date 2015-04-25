package net.codejava.graphics;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * This program demonstrates how to draw lines using Graphics2D object
 * with different line cap styles.
 * @author www.codejava.net
 *
 */
public class LinesCapsExample extends JFrame {

	public LinesCapsExample() {
		super("Lines Caps Drawing Demo");
		
		setSize(480, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	void drawLines(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		// this stroke with default CAP_SQUARE and JOIN_MITER
		Stroke stroke1 = new BasicStroke(12f);
		
		// this stroke with CAP_BUTT
		Stroke stroke2 = new BasicStroke(12f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER);

		// this stroke with CAP_ROUND
		Stroke stroke3 = new BasicStroke(12f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);

		g2d.setStroke(stroke1);
		g2d.drawLine(30, 60, 450, 60);		

		g2d.setStroke(stroke2);
		g2d.drawLine(30, 100, 450, 100);		
		
		g2d.setStroke(stroke3);
		g2d.drawLine(30, 140, 450, 140);		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		drawLines(g);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LinesCapsExample().setVisible(true);
			}
		});
	}
}