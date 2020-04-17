package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import courant.Courant;
import traitement.Traitement;
import utils.Breizh;
import utils.Point;
import utils.Vector;

public class PanneauBretagne extends JPanel{
	
	
	Point ship;
	
	JLabel legende = new JLabel();
	
	
	JButton legendB;
	
	
	JButton infos;
	
	JButton port1;
	JButton port2;
	JButton port3;
	JButton port4;
	Caps pan1;
	Caps pan2;
	Caps pan3;
	Caps pan4;
	JScrollPane scroll;
	Graphics g;
	
	//JLabel infos;
	
	Boolean clicked = false;
	
	/*
	public static String remplirLegende() {		
		String s = "<html>";
		
		s += new String("Les carrées CYAN sont les trois ports les plus proches de votre position".getBytes(),Charset.forName("UTF-8")) + "<br>" 
		+  new String("Vous pouvez cliquer dessus pour connaître les caps à suivre.".getBytes(),Charset.forName("UTF-8")) + "<br>" + "<br>" 
	    +  new String("Le carré ORANGE est le port le plus proche.".getBytes(),Charset.forName("UTF-8")) + "<br>" 
	    +  new String("Vous pouvez cliquer dessus pour connaître le cap à suivre".getBytes(),Charset.forName("UTF-8")) + "<br>" + "<br>"
		+ new String("Les carrées BLEUS sont tous les ports de Bretagne".getBytes(),Charset.forName("UTF-8")) + "</html>";
		return s;
	}
	
	public void setLegend() {
		
		String leg = new String("Légende".getBytes(),Charset.forName("UTF-8"));
		
		//URL de l'image
	     String imgUrl="image/encre.jpg";
	     ImageIcon icone = new ImageIcon(imgUrl);
	  
	     //Création de JLable avec un alignement gauche
	     legende.setBorder(BorderFactory.createLineBorder(Color.black));
	     legende.setBorder(BorderFactory.createTitledBorder(leg));
	     legende.setBackground(Color.white);
	     
	     legende.setText(remplirLegende());
	  
	     //ajouter les deux JLabel a JFrame
	     add(legende);
	     
	     legende.setBounds(0, 0, 200,300);
	     
	     legende.repaint();
	}
	*/
	
	public void gererLegend () {
		
		legendB = new JButton();
		legendB.setBounds(0, 0, 100, 30);
		legendB.setText( new String("Légende".getBytes(),Charset.forName("UTF-8")));
		
		add(legendB);
		
		legendB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chaine = "";
				String fichier = "image/legende.txt";
				{
					// lecture du fichier texte
					try {
						InputStream ips = new FileInputStream(fichier);
						InputStreamReader ipsr = new InputStreamReader(ips);
						BufferedReader br = new BufferedReader(ipsr);
						String ligne;
						while ((ligne = br.readLine()) != null) {
							if (ligne.contains("nom :")) {
								String[] st = ligne.split(ligne, ':');
								System.out.println("Nom = " + st[1]);
							}
							chaine += ligne + "\n";
						}
						br.close();
					} catch (Exception e) {
						System.out.println(e.toString());
					}
				}
				String text = new String(chaine.getBytes(),Charset.forName("UTF-8"));
				// Boîte du message d'information
				JOptionPane jop1 = new JOptionPane();
				jop1.showMessageDialog(null, text,  new String("Légende".getBytes(),Charset.forName("UTF-8")), JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		
		
		
		
	}
	
	
	
	
	
	public void boutonPorts () {
		
		infos = new JButton();
		
		infos.setBounds(0, 50, 200, 50);
		
		infos.setText("Informations sur le port");
		
		
		infos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chaine = "";
				String fichier = "image/port_camaret_sur_mer.txt";
				{
					// lecture du fichier texte
					try {
						InputStream ips = new FileInputStream(fichier);
						InputStreamReader ipsr = new InputStreamReader(ips);
						BufferedReader br = new BufferedReader(ipsr);
						String ligne;
						while ((ligne = br.readLine()) != null) {
							if (ligne.contains("nom :")) {
								String[] st = ligne.split(ligne, ':');
								System.out.println("Nom = " + st[1]);
							}
							chaine += ligne + "\n";
						}
						br.close();
					} catch (Exception e) {
						System.out.println(e.toString());
					}
				}
				String text = new String(chaine.getBytes(),Charset.forName("UTF-8"));
				// Boîte du message d'information
				JOptionPane jop1 = new JOptionPane();
				jop1.showMessageDialog(null, text,  new String("Infomations sur le port".getBytes(),Charset.forName("UTF-8")), JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		port1 = new JButton();
		port2 = new JButton();
		port3 = new JButton();
		port4 = new JButton();
		
		
		int xport1 = (int)Traitement.tabPointsB()[0].abcisse;
		int xport2 = (int)Traitement.tabPointsB()[1].abcisse;
		int xport3 = (int)Traitement.tabPointsB()[2].abcisse;
		int xport4 = (int)Traitement.tabPointsB()[3].abcisse;
	
	
		
		port1.setBounds((int)Traitement.tabPointsB()[0].ordonnee - 5,(int)Traitement.tabPointsB()[0].abcisse - 5, 10, 10);
		port2.setBounds((int)Traitement.tabPointsB()[1].ordonnee - 5,(int)Traitement.tabPointsB()[1].abcisse - 5, 10, 10);
		port3.setBounds((int)Traitement.tabPointsB()[2].ordonnee - 5,(int)Traitement.tabPointsB()[2].abcisse - 5, 10, 10);
		port4.setBounds((int)Traitement.tabPointsB()[3].ordonnee - 5,(int)Traitement.tabPointsB()[3].abcisse - 5, 10, 10);
		
		port1.setBackground(Color.CYAN);
		port2.setBackground(Color.ORANGE);
		port3.setBackground(Color.CYAN);
		port4.setBackground(Color.CYAN);
		
		
		
		
		add(port1);
		add(port2);
		add(port3);
		add(port4);		
		
		port1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//clicked = true;
				//if (clicked == true) {
					//remove(pan);
				
				add(infos);
				
				pan1 = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),0);
				scroll = new JScrollPane(pan1);
				scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				scroll.setBounds(1050, 270, 200, 300);	
				scroll.setBorder(BorderFactory.createLineBorder(Color.black));
				//scroll.setVisible(true);
				add(scroll);
				scroll.repaint();
				infos.repaint();
				//revalidate();
			/*	
			} else {
					pan = new Caps();
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					//revalidate();
				}
				clicked = false;
				
				//infos = new JLabel("guut");
				//infos.setBounds(100, 200, 100, 100);
				//infos.setText("<html>Infos bateau !<br>taille du port</html>");
				//add(infos);
				 * */
				
			}
		});
		
		port2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//clicked = true;
				//if (clicked == true) {
					//remove(pan);
				
				add(infos);
				pan2 = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),1);
					scroll = new JScrollPane(pan2);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1050, 270, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					scroll.repaint();
					//revalidate();
			/*	
			} else {
					pan = new Caps();
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					//revalidate();
				}
				clicked = false;
				*/
				
				//infos = new JLabel("guut");
				//infos.setBounds(100, 200, 100, 100);
				//infos.setText("<html>Infos bateau !<br>taille du port</html>");
				//add(infos);
				
			}
		});
		
		port3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//clicked = true;
				//if (clicked == true) {
					//remove(pan);
				add(infos);
				pan3 = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),2);
					scroll = new JScrollPane(pan3);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1050, 270, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					scroll.repaint();
					//revalidate();
			/*
			} else {
					pan = new Caps();
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					//revalidate();
				}
				clicked = false;
				
				//infos = new JLabel("guut");
				//infos.setBounds(100, 200, 100, 100);
				//infos.setText("<html>Infos bateau !<br>taille du port</html>");
				//add(infos);
				 * 
				 */
				
			}
		});
		
		port4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//clicked = true;
				//if (clicked == true) {
					//remove(pan);
				add(infos);
				pan4 = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),3);
					scroll = new JScrollPane(pan4);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1050, 270, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					scroll.repaint();
					//revalidate();
			/*	
			} else {
					pan = new Caps();
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					//revalidate();
				}
				clicked = false;
				
				//infos = new JLabel("guut");
				//infos.setBounds(100, 200, 100, 100);
				//infos.setText("<html>Infos bateau !<br>taille du port</html>");
				//add(infos);
				 * 
				 */
				
			}
		});
		
	}	
	
	public void paintComponent(Graphics g) {

		// get local graphics environment
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

		// get maximum window bounds
		Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

		int h = (int) maximumWindowBounds.getHeight();
		int l = (int) maximumWindowBounds.getWidth();
		
		int [] rectX = {1200,1400,1400,1200};
		int [] rectY = {0,0,680,680};
		
		try {
			Image img = ImageIO.read(new File("image/mer.jpg"));

			// g.drawImage(img, 50,50, this);

			// Pour une image de fond
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		} catch (IOException e) {
			e.printStackTrace();
		}
		

		Breizh bretagne = new Breizh(h, l);
		
		int [] bretX =  bretagne.getPointsX();
		
		g.drawPolyline(bretagne.getPointsY(), bretagne.getPointsX(), bretagne.getPointsX().length);
		g.drawPolyline(bretagne.getPointsI1y(),bretagne.getPointsI1x(),bretagne.getPointsI1x().length);
        g.drawPolyline(bretagne.getPointsI2y(),bretagne.getPointsI2x(),bretagne.getPointsI2x().length);
        g.drawPolyline(bretagne.getPointsI3y(),bretagne.getPointsI3x(),bretagne.getPointsI3x().length);
        g.drawPolyline(bretagne.getPointsI4y(),bretagne.getPointsI4x(),bretagne.getPointsI4x().length);
				
		g.setColor(new Color(100,200,87));
		
		g.fillPolygon(bretagne.getPointsI1y(),bretagne.getPointsI1x(),bretagne.getPointsI1x().length);
        g.fillPolygon(bretagne.getPointsI2y(),bretagne.getPointsI2x(),bretagne.getPointsI2x().length);
        g.fillPolygon(bretagne.getPointsI3y(),bretagne.getPointsI3x(),bretagne.getPointsI3x().length);
        g.fillPolygon(bretagne.getPointsI4y(),bretagne.getPointsI4x(),bretagne.getPointsI4x().length);
        
        
		

		g.fillPolygon(bretagne.getPointsY(), bretagne.getPointsX(), bretagne.getPointsX().length);
		//g.fillPolygon(rectX, rectY, rectX.length);
		
		g.setColor(Color.BLACK);
		
        Vector[] courant = Courant.getAffCourant();
        for(Vector s:courant) {
//        	g.drawLine((int)Point.GpsToBreizh(h, l, s.depart).ordonnee,(int) Point.GpsToBreizh(h, l, s.depart).abcisse,(int)Point.GpsToBreizh(h, l, s.arrivee).ordonnee,(int) Point.GpsToBreizh(h, l, s.arrivee).abcisse);
//        	System.out.println(Point.GpsToBreizh(h, l, s.depart).ordonnee);
//        	System.out.println(Point.GpsToBreizh(h, l, s.depart).abcisse);
//        	System.out.println(Point.GpsToBreizh(h, l, s.arrivee).ordonnee);
//        	System.out.println(Point.GpsToBreizh(h, l, s.arrivee).abcisse);

            int dx, dy;
            double n;
            
            
            int y1 = (int)Point.GpsToBreizh(h, l, s.depart).abcisse;
            int x1 = (int)Point.GpsToBreizh(h, l, s.depart).ordonnee;
            
            int y2 = (int)Point.GpsToBreizh(h, l, s.arrivee).abcisse;
            int x2 = (int)Point.GpsToBreizh(h, l, s.arrivee).ordonnee;
            
             n = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
             dx = (int) ((5 * (x2 - x1)) / n);
             dy = (int) ((5 * (y2 - y1)) / n);

             g.drawLine(x1, y1, x2, y2);
             g.drawLine(x2, y2, x2 - dx - dy, y2 - dy + dx);
             g.drawLine(x2, y2, x2 - dx + dy, y2 - dy - dx);
        	
        }
		
		g.setColor(Color.black);

		if (FenetreBis.whatCo() == true) {
			ship = Point.GpsToBreizh(h, l, new Point(FenetreBis.dialog.Info.getInfos()[1], FenetreBis.dialog.Info.getInfos()[0]));
			
			g.setColor(Color.red);
			g.fillOval((int) ship.ordonnee-3, (int) ship.abcisse-3, 10,10);
			g.setColor(Color.blue);
			
			for ( int i = 0; i<Point.getPort().length; i++) {
				g.fillOval((int) Point.GpsToBreizh(h, l, Point.getPort()[i]).ordonnee - 3, 
						   (int)  Point.GpsToBreizh(h, l, Point.getPort()[i]).abcisse - 3, 
						   	6, 6);
			}
			
			/*
			g.setColor(Color.green);
			
			for ( int i = 0; i<Traitement.quatrePortsLesPlusProches ().length; i++) {
				g.fillOval((int) Point.GpsToBreizh(h, l, Traitement.quatrePortsLesPlusProches()[i]).ordonnee - 5, 
						   (int) Point.GpsToBreizh(h, l, Traitement.quatrePortsLesPlusProches()[i]).abcisse - 5, 
						   	10, 10);
			}
			*/
			
		} else {
			ship = Point.GpsToBreizh(h, l, new Point(FenetreBis.dialogDec.Info.getInfos()[1], FenetreBis.dialogDec.Info.getInfos()[0]));
			
			g.setColor(Color.red);
			g.fillOval((int) ship.ordonnee-3, (int) ship.abcisse-3, 10,10);
			g.setColor(Color.blue);
			
			for ( int i = 0; i<Point.getPort().length; i++) {
				g.fillOval((int) Point.GpsToBreizh(h, l, Point.getPort()[i]).ordonnee - 3, 
						   (int)  Point.GpsToBreizh(h, l, Point.getPort()[i]).abcisse - 3, 
						   	6, 6);
			}
			
			/*
			
			g.setColor(Color.green);
			
			for ( int i = 0; i<Traitement.quatrePortsLesPlusProches ().length; i++) {
				g.fillOval((int) Point.GpsToBreizh(h, l, Traitement.quatrePortsLesPlusProches()[i]).ordonnee - 5, 
						   (int) Point.GpsToBreizh(h, l, Traitement.quatrePortsLesPlusProches()[i]).abcisse - 5, 
						   	10, 10);
			}
			*/
		}
		
		
		boutonPorts();
		gererLegend();
		
		
		
		/*
		try {
			Image bateau = ImageIO.read(new File("image/pointer.png"));
			g.drawImage(bateau, (int) ship.ordonnee-5, (int) ship.abcisse-30, 15, 30, this);

		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
}
