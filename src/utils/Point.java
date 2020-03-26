package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Point {

	public double abcisse;
	public double ordonnee;
	
	public Point(double latitude, double longitude) {
		abcisse = latitude;
		ordonnee = longitude;
	}
	public Point(int x, int y) {
		abcisse = x;
		ordonnee = y;
	}

	/**
	 * @param hauteur La hauteur de la fenetre
	 * @param largeur La largeur de la fenetre
	 * @param point Le point GPS a convertir
	 * @return Le point GPS convertit dans la carte de la Bretagne
	 */
	public static Point GpsToBreizh(double hauteur, double largeur, Point point) {
		double X = hauteur * ( point.abcisse 	- 46.996142	) / 2.294026;
		double Y = largeur * ( -point.ordonnee 	- 1.505404	) / 4.163826;
		return new Point(
				hauteur/2 + (X-(hauteur/2))*Math.cos(Math.PI) - (Y-(largeur/2))*Math.sin(Math.PI),
				largeur/2 + (X-(hauteur/2))*Math.sin(Math.PI) + (Y-(largeur/2))*Math.cos(Math.PI));
	}

	/**
	 * @param hauteur La hauteur de la fenetre
	 * @param largeur La largeur de la fenetre
	 * @param point Le point dans le referentile de la Bretagne a convertir
	 * @return Le point dans le format GPS
	 */
	public static Point BreizhToGps(double hauteur, double largeur, Point point) {
		double X = point.abcisse;
		double Y = point.ordonnee;
		double lat = (hauteur/2 + (X-(hauteur/2))*Math.cos(Math.PI) - (Y-(largeur/2))*Math.sin(Math.PI));
		double lon = (largeur/2 + (X-(hauteur/2))*Math.sin(Math.PI) + (Y-(largeur/2))*Math.cos(Math.PI));
		lat = ((2.294026*lat)/hauteur) + 46.996142;
		lon = (-(4.163826*lon)/largeur) - 1.505404;
		return new Point(lat,lon);
	}
	
	public static Point[] getPort() {
		double[] X 	 = new double[91];
		double[] Y 	 = new double[91];
		Point[] port = new Point[91];
		int i = 0;
		Path chemin = Paths.get("PortLatitude.txt");
	    try (BufferedReader reader = Files.newBufferedReader(chemin)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		X[i] = Double.valueOf(line);
	    		i++;
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    i = 0;
	    chemin = Paths.get("PortLongitude.txt");
	    try (BufferedReader reader = Files.newBufferedReader(chemin)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		Y[i] = Double.valueOf(line);
	    		i++;
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    
	    for(i = 0;i<91;i++) {
	    	port[i] = new Point(X[i],Y[i]);
	    }
		
		return port;
	}
	
	@Override
	public String toString() {
		return "Abcisse : " + abcisse + "\n" + "Ordonnees : "+ordonnee;
	}
}
/*
 	//(int)((pointsX[i]-46.996142)*hauteur/2.294026);
	//(int)(((-1.0*pointsY[i])-1.505404)*largeur/4.163826); 
 	//System.out.println("RotationX : "+lat);
	//System.out.println("RotationY : "+lon);
*/