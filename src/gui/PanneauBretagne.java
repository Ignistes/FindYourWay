package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import traitement.Traitement;
import utils.Breizh;
import utils.Point;

public class PanneauBretagne extends JPanel {
	
	Point ship;
	
	public void paintComponent(Graphics g) {

		// get local graphics environment
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

		// get maximum window bounds
		Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

		int h = (int) maximumWindowBounds.getHeight();
		int l = (int) maximumWindowBounds.getWidth();

		Breizh bretagne = new Breizh(h, l);

		g.drawPolyline(bretagne.getPointsY(), bretagne.getPointsX(), bretagne.getPointsX().length);

		if (FenetreBis.whatCo() == true) {
			ship = Point.GpsToBreizh(h, l, new Point(FenetreBis.dialog.Info.getInfos()[1], FenetreBis.dialog.Info.getInfos()[0]));
			
			g.setColor(Color.red);
			g.fillOval((int) ship.ordonnee-3, (int) ship.abcisse-3, 10,10);
			g.setColor(Color.blue);
			
			for ( int i = 0; i<Point.getPort().length; i++) {
				g.fillOval((int) Point.GpsToBreizh(h, l, Point.getPort()[i]).ordonnee, 
						   (int)  Point.GpsToBreizh(h, l, Point.getPort()[i]).abcisse, 
						   	6, 6);
			}
			
			g.setColor(Color.green);
			
			for ( int i = 0; i<Traitement.quatrePortsLesPlusProches ().length; i++) {
				g.fillOval((int) Point.GpsToBreizh(h, l, Traitement.quatrePortsLesPlusProches()[i]).ordonnee, 
						   (int) Point.GpsToBreizh(h, l, Traitement.quatrePortsLesPlusProches()[i]).abcisse, 
						   	10, 10);
			}
			
		} else {
			ship = Point.GpsToBreizh(h, l, new Point(FenetreBis.dialogDec.Info.getInfos()[1], FenetreBis.dialogDec.Info.getInfos()[0]));
			
			g.setColor(Color.red);
			g.fillOval((int) ship.ordonnee-3, (int) ship.abcisse-3, 10,10);
			g.setColor(Color.blue);
			
			for ( int i = 0; i<Point.getPort().length; i++) {
				g.fillOval((int) Point.GpsToBreizh(h, l, Point.getPort()[i]).ordonnee, 
						   (int)  Point.GpsToBreizh(h, l, Point.getPort()[i]).abcisse, 
						   	6, 6);
			}
			
			g.setColor(Color.green);
			
			for ( int i = 0; i<Traitement.quatrePortsLesPlusProches ().length; i++) {
				g.fillOval((int) Point.GpsToBreizh(h, l, Traitement.quatrePortsLesPlusProches()[i]).ordonnee, 
						   (int) Point.GpsToBreizh(h, l, Traitement.quatrePortsLesPlusProches()[i]).abcisse, 
						   	10, 10);
			}
		}
		
		//System.out.println("lat : " + FenetreBis.dialog.Info.getInfos()[1]);
		//System.out.println("long : " + FenetreBis.dialog.Info.getInfos()[0]);
		System.out.println("x : " + ship.abcisse);
		System.out.println("y : " + ship.ordonnee);

		
		
		//System.out.println(Traitement.tabPointsB(Traitement.quatrePortsLesPlusProches (FenetreBis.dialog.Info.getInfos()[1], FenetreBis.dialog.Info.getInfos()[0], Point.getPort()))[0].ordonnee);
		//System.out.println(Traitement.tabPointsB(Traitement.quatrePortsLesPlusProches (FenetreBis.dialog.Info.getInfos()[1], FenetreBis.dialog.Info.getInfos()[0], Point.getPort()))[0].abcisse);
		
		//System.out.println(Point.GpsToBreizh(h, l,Traitement.quatrePortsLesPlusProches (FenetreBis.dialog.Info.getInfos()[1], FenetreBis.dialog.Info.getInfos()[0], Point.getPort())[0]).ordonnee);
		//System.out.println(Point.GpsToBreizh(h, l,Traitement.quatrePortsLesPlusProches (FenetreBis.dialog.Info.getInfos()[1], FenetreBis.dialog.Info.getInfos()[0], Point.getPort())[0]).abcisse);
		
		
		//quatrePortsLesPlusProches (double latA, double longA, Point[]ports)
		
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
