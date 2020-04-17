package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.nio.charset.Charset;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import utils.Point;

public class Caps extends JPanel {

	private JLabel cap;
	
	String caps = new String("Caps à suivre".getBytes(),Charset.forName("UTF-8"));
	
	public Caps(double [][] c, Point [][] co, int j) {
		
		setBackground(Color.white);
		//setPreferredSize(new Dimension(200,400));
		setBorder(BorderFactory.createLineBorder(Color.black));
		setBorder(BorderFactory.createTitledBorder(caps));
		cap = new JLabel();
		cap.setText(FenetreBis.remplirLabCap(c,co,j));
		//cap.setVisible(true);
		add(cap);
	
		setVisible(true);
	}
}