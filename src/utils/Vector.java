package utils;
import utils.Point;
public class Vector {
	
	public Point depart;
	public Point arrivee;
	public double vitesse;
	
	public Vector(Point debut, Point arrivee, double vitesse) {
		depart = debut;
		this.vitesse = vitesse;
		this.arrivee = arrivee;
	}

	/**
	 * @param debut Le point GPS de départ
	 * @param fVert La force, en m/s, vertical a applique 
	 * @param fHori La force, en m/s, horizontal a applique
	 * @return Le point GPS d'arrivee en appliquant les forces hori et verti au point de depart
	 */
	public static Point getArriveeGps(Point debut, double fVert, double fHori) {
		return new Point(
				debut.abcisse +  (3600*fVert/1000)/111.195,
				debut.ordonnee + (3600*fHori/1000)/111.195);
	}
	
	/**
	 * @param fVert Force verticale en m/s
	 * @param fHori Force horizontal en m/s
	 * @return la vitesse en m/s
	 */
	public static double getVitesse(double fVert, double fHori) {
		return Math.sqrt(fVert*fVert+fHori*fHori);
	}
	
	@Override
	public String toString() {
		return "Point depart : \n" + depart.toString() + "\nPoint arrivee : \n" + arrivee.toString() + "\nVitesse : " + vitesse + " m/s"; 
	}
	
}
