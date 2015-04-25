package net.codejava.graphics;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * This program demonstrates how to draw lines using Graphics2D object
 * with different line join styles.
 * @author www.codejava.net
 *
 */
public class LinesJoinsExample extends JFrame {

	public LinesJoinsExample() {
		super("Lines Joins Drawing Demo");
		
		setSize(390, 190);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	void drawLines(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		// this stroke with default CAP_SQUARE and JOIN_MITER
		Stroke stroke1 = new BasicStroke(12f);
		
		// this stroke with JOIN_BEVEL
		Stroke stroke2 = new BasicStroke(12f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL);

		// this stroke with JOIN_ROUND
		Stroke stroke3 = new BasicStroke(12f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND);

		// draws the first rectangle with a stroke of JOIN_MITER 
		g2d.setStroke(stroke1);
		g2d.drawLine(30, 60, 120, 60);		
		g2d.drawLine(30, 60, 30, 150);		
		g2d.drawLine(120, 60, 120, 150);
		g2d.drawLine(120, 60, 120, 150);
		g2d.drawLine(30, 150, 120, 150);
		
		// draws the second rectangle with a stroke of JOIN_BEVEL 
		g2d.setStroke(stroke2);
		g2d.drawLine(30 + 120, 60, 120 + 120, 60);
		g2d.drawLine(30 + 120, 60, 30 + 120, 150);
		g2d.drawLine(120 + 120, 60, 120 + 120, 150);
		g2d.drawLine(120 + 120, 60, 120 + 120, 150);
		g2d.drawLine(30 + 120, 150, 120 + 120, 150);
		
		// draws the third rectangle with a stroke of JOIN_ROUND 
		g2d.setStroke(stroke3);
		g2d.drawLine(30 + 240, 60, 120 + 240, 60);
		g2d.drawLine(30 + 240, 60, 30 + 240, 150);
		g2d.drawLine(120 + 240, 60, 120 + 240, 150);
		g2d.drawLine(120 + 240, 60, 120 + 240, 150);
		g2d.drawLine(30 + 240, 150, 120 + 240, 150);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		drawLines(g);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LinesJoinsExample().setVisible(true);
			}
		});
	}
}