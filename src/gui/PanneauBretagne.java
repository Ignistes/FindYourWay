package gui;

import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import javax.swing.JPanel;

import utils.Breizh;
 
public class PanneauBretagne extends JPanel {
  public void paintComponent(Graphics g){
	  
	
	  
	//get local graphics environment
	GraphicsEnvironment graphicsEnvironment=GraphicsEnvironment.getLocalGraphicsEnvironment();
			         
	//get maximum window bounds
	Rectangle maximumWindowBounds=graphicsEnvironment.getMaximumWindowBounds();
			
	int h = (int) maximumWindowBounds.getHeight();
	int l = (int) maximumWindowBounds.getWidth();
    
	Breizh bretagne = new Breizh(h,l);
	
	g.drawPolyline(bretagne.getPointsX(), bretagne.getPointsY(), bretagne.getPointsX().length);
	  
	System.out.println(bretagne.getPointsX()[150]);
	System.out.println(bretagne.getPointsY()[150]);
	System.out.println(bretagne.getPointsX().length);


	  
	  /*
	  try {
      Image img = ImageIO.read(new File("image/accueil.png"));
      Image logo = ImageIO.read(new File("image/encre.jpg"));
      
      //g.drawImage(img, 50,50, this);
      
      //Pour une image de fond
      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
      
    } catch (IOException e) {
      e.printStackTrace();
    } 
    */
    
      
    
  }               
}

