package gui;

import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    try {
      Image img = ImageIO.read(new File("image/accueil.png"));
      Image logo = ImageIO.read(new File("image/encre.jpg"));
      
      //g.drawImage(img, 50,50, this);
      
      //Pour une image de fond
      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
      
    } catch (IOException e) {
      e.printStackTrace();
    } 
    
      
    
  }               
}
