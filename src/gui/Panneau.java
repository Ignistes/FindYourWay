package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    try {
      Image img = ImageIO.read(new File("image/bretgane2.jpg"));
      Image logo = ImageIO.read(new File("image/encre.jpg"));
      
      //g.drawImage(img, 50,50, this);
      
      //Pour une image de fond
      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
      
      //Logo de l'encre
      g.drawImage(logo, 300, 50, 60, 60, this);
    } catch (IOException e) {
      e.printStackTrace();
    }                
  }               
}