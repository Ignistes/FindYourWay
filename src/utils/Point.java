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
		int X =(int)(hauteur * ( point.abcisse 	- 46.996142	) / 2.294026);
		int Y =(int)(largeur * ( -point.ordonnee 	- 1.505404	) / 4.163826);
		return new Point(
				(int)(hauteur/2 + (X-(hauteur/2))*Math.cos(Math.PI) - (Y-(largeur/2))*Math.sin(Math.PI)),
				(int)(largeur/2 + (X-(hauteur/2))*Math.sin(Math.PI) + (Y-(largeur/2))*Math.cos(Math.PI)));
	}
	//(int)((pointsX[i]-46.996142)*hauteur/2.294026);
	//(int)(((-1.0*pointsY[i])-1.505404)*largeur/4.163826);
	public static Point BreizhToGps(double hauteur, double largeur, Point point) {
		return new Point(0,0);
	}
}
