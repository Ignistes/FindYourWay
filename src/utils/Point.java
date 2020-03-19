package utils;

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

	public static Point GpsToBreizh(double hauteur, double largeur, Point point) {
		return new Point(
				largeur * ( point.abcisse 	- 1.505404	) / 4.163826,
				hauteur * ( point.ordonnee 	- 46.996142	) / 2.294026);
		
		//res[i] = (int)((pointsX[i]-49.0)*500.0/-2.6);
	}
	public static Point BreizhToGps(double hauteur, double largeur, Point point) {
		return new Point(0,0);
	}
}
