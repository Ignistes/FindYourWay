package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panneau extends JPanel {

	JLabel label;
	JLabel n;
	String str;
	
	// get local graphics environment
			GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
			// get maximum window bounds
			Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();
			int h = (int) maximumWindowBounds.getHeight();
			int l = (int) maximumWindowBounds.getWidth();
	
	public void bienvenue () {
		label = new JLabel();
		label.setText(new String(("Bienvenue dans notre logiciel d'aide à la navigation !").getBytes(),Charset.forName("UTF-8")));
		label.setFont(new java.awt.Font(Font.SANS_SERIF, Font.BOLD, 40));
	    label.setForeground(Color.white);
	    add(label);
	    label.setBounds(150, 10, 1000, 100);
		
	}
	
	public void nous() {
		
		String s = new String(("Alexandre Macé, Louis Conan et Pierre Auffray -> Etudiants en deuxième année CUPGE ESIR à l'Université Rennes 1").getBytes(),Charset.forName("UTF-8"));
		
		/*
		String s = "<html>" + "Logiciel créé par :" + "<br>" +
		new String(("Alexandre Macé").getBytes(),Charset.forName("UTF-8")) + "<br>" +
		"Louis Conan" + "<br>" + 
		"Pierre Auffray" + "<br>" + "<br>" +
		new String(("Etudiants en deuxième année CUPGE ESIR à l'Université Rennes 1").getBytes(),Charset.forName("UTF-8"));
		*/
		
		n = new JLabel();
		n.setText(s);
		n.setFont(new java.awt.Font(Font.SANS_SERIF, Font.BOLD, 20));
	    n.setForeground(Color.black);
	    add(n);
	    n.setBounds(200, h - 100, 1200, 50);
		
	}

	public Panneau (String texte) {
	    //super();
	    /*
	    str=texte;
	    label = new JLabel(texte);
	    label.setFont(new java.awt.Font(Font.SANS_SERIF, Font.BOLD, 30));
	    
	    label.setForeground(Color.white);
	    add(label);
	    
	   // Thread t = new Thread(this);
	   // t.start();
	    label.repaint();
	    */
	    
	}
	
	/*
	
	public void run(){
	    while(true){
	        char c = str.charAt(0);
	        String rest = str.substring(1);
	        str = rest + c;
	        label.setText(str);
	        try{
	            Thread.sleep(200);
	        }catch(InterruptedException e){ e.printStackTrace();}
	    }
	  }
	  */

	public void paintComponent(Graphics g) {
		try {
			Image img = ImageIO.read(new File("image/imahefond.jpg"));

			// g.drawImage(img, 50,50, this);

			// Pour une image de fond
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		bienvenue();

		nous();
	}
}
