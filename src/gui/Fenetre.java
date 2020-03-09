package gui;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class Fenetre extends JFrame {

	public Fenetre() {
		this.setTitle("FindYourWave");
		this.setBackground(Color.WHITE);
		
		//this.setSize(1000, 1000);
		
		//int x = this.getHeight();
		//int y = this.getWidth();
		//System.out.println(x);
		//System.out.println(y);
		
		//On centre la fenêtre au milieu de l'écran
		this.setLocationRelativeTo(null);
		
		//On l'ouvre directement en grand écran
		this.pack();
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(new Panneau());
		this.setVisible(true);
	}
}