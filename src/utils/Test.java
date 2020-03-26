package utils;
import java.awt.Rectangle;
import java.awt.GraphicsEnvironment;
import java.awt.Graphics;
import courant.Courant;
import gui.*;
import traitement.Traitement;
import zoom.Zoom;


public class Test {

	public static void main(String[] args) {
		/*Courant stream = new Courant();
		for(int i = 0;i<4;i++) {
			System.out.println(i);
			System.out.println(Traitement.distanceDeAr(48, -5, 47, -4));
			Courant.getCourant(2, 3, new Point(48,-5), new Point(47,-4));
		}*/
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		Point p = new Point(48.294054, -5.623783);
		p = Point.GpsToBreizh(h, l, p);
		System.out.println(p);
		p = Point.BreizhToGps(h, l, p);
		System.out.println(p);
		/*
		 *	 	Abcisse : 48.294409461538464
				Ordonnees : -5.623507166910688
		 */
		//System.out.println(Point.BreizhToGps(980, 1280, new Point(980,1280)));
		/*Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();
		int h = (int) maximumWindowBounds.getHeight();
		int l = (int) maximumWindowBounds.getWidth();*/
		/*
		Point BreizhToGps = new Point(0,0);
		System.out.println(Point.BreizhToGps(980, 1280, BreizhToGps));
		BreizhToGps = new Point(980,1280);
		System.out.println(Point.BreizhToGps(980, 1280, BreizhToGps));
		BreizhToGps = new Point(0,1280);
		System.out.println(Point.BreizhToGps(980, 1280, BreizhToGps));
		BreizhToGps = new Point(980,0);
		System.out.println(Point.BreizhToGps(980, 1280, BreizhToGps));*/
	}	

}
