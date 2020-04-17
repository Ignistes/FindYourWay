package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panneau extends JPanel implements Runnable {

	JLabel label;
	String str;

	public Panneau (String texte) {
	    super();
	    str=texte;
	    label = new JLabel(texte);
	    label.setFont(new java.awt.Font(Font.SANS_SERIF, Font.BOLD, 90));
	    label.setForeground(Color.white);
	    add(label);
	    Thread t = new Thread(this);
	    t.start();
	}
	
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

	public void paintComponent(Graphics g) {
		try {
			Image img = ImageIO.read(new File("image/bretagne2.jpg"));
			Image logo = ImageIO.read(new File("image/encre.jpg"));

			// g.drawImage(img, 50,50, this);

			// Pour une image de fond
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
