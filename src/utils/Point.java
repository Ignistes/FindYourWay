package utils;

public class Point {
	
	double abcisse;
	double ordonnee;
	
	public Point() {
		abcisse = 0;
		ordonnee = 0;
	}
	public Point(int x, int y) {
		abcisse = x;
		ordonnee = y;
	}
	public Point(double latitude, double longitude) {
		this.abcisse = latitude;
		this.ordonnee = longitude;
	}
	
	/**
	 * @param p point GPS
	 * @return Le point p dans la base x,y (sur la carte de la Bretagne)
	 */
	public Point GpsToBreizh(Point p) {
		return new Point(
				(int)(500 *(   p.abcisse  -		46.996142)  /2.294026),
				(int)(500 *( - p.ordonnee - 	1.505404 ) 	/4.163826)
				);
	}
	
	/**
	 * @param p point x,y
	 * @return Le point p en format GPS
	 */
	public Point BreizhToGps(Point p) {
		return null;
	}
	
	/**
	 * @param p1 Un point GPS
	 * @param p2 Un point GPS
	 * @return la distance entre les deux points en km
	 */
	public double getDistanceGps(Point p1, Point p2) {
		//Math.acos(Math.sin()*Math.sin() + Math.cos()* Math.cos()* Math.cos());
		if ((p1.abcisse == p2.abcisse) && (p1.ordonnee == p2.ordonnee)) {
			return 0;
		}
		else {
			double theta = p1.ordonnee - p2.ordonnee;
			double dist = Math.sin(Math.toRadians(p1.abcisse)) * Math.sin(Math.toRadians(p2.abcisse)) + Math.cos(Math.toRadians(p1.abcisse)) * Math.cos(Math.toRadians(p2.abcisse)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 111.189577;
			return (dist);
		}
	}
	
}
