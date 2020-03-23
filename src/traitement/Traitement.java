package traitement;

import utils.Vector;

import utils.Point;
import java.util.ArrayList;

import courant.Courant;
import utils.Vector;
import gui.Dialog;
import gui.DialogInfo;

public class Traitement {

	// A faire demain :
	// - demander � Pierre comment obtenir hauteur et largeur suivant les �crans

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.out.println(capDeg(47.4166667,-2.8333333333333335,47.4116651,-2.
		 * 6207216)+" degr�s"); //test de la fonction capDeg qui calcule le cap entre
		 * deux points
		 * System.out.println(distanceDeAr(47.4166667,-2.8333333333333335,47.4116651,-2.
		 * 6207216)+" miles nautiques"); //test de la fonction distanceDeAr qui calcule
		 * la distance entre deux points System.out.println(coordGeoDecLat(48, 6,
		 * 40.819, "N"));
		 */
		// System.out.println(capRS(47.39, (-2.85), Point.GpsToBreizh(680, 1280, new
		// Point(47.39,(-2.85))).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.39,(-2.85))).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.40,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.4,-2.62)).ordonnee, 6)) ;
		// System.out.println(Point.BreizhToGps(680, 1280, new Point(
		// latXInterRSetRF(Point.GpsToBreizh(680, 1280, new
		// Point(47.38,(-2.86))).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.38,(-2.86))).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.42,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.42,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.62)).ordonnee, 6.0), longYInterRSetRF(Point.GpsToBreizh(680,
		// 1280, new Point(47.38,(-2.86))).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.38,(-2.86))).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.42,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.42,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.62)).ordonnee, 6.0, latXInterRSetRF(Point.GpsToBreizh(680,
		// 1280, new Point(47.38,(-2.86))).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.38,(-2.86))).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.42,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.42,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.62)).ordonnee, 6.0)))).abcisse) ;
		// System.out.print(latXInterRSetRF(Point.GpsToBreizh(680, 1280, new
		// Point(47.38,(-2.86))).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.38,(-2.86))).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.42,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.42,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.41,-2.62)).ordonnee, 6.0));
		// System.out.println(latXInterRSetRF(2, 3, 3, 8, 5, 12, 2));
		// System.out.println(pointIntersectionXUn(2,3,2,2,2));
		// System.out.println(capRS(47.37, (-2.70), Point.GpsToBreizh(680, 1280, new
		// Point(47.37,(-2.70))).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.37,(-2.70))).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.33,-2.66)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.33,-2.66)).ordonnee, Point.GpsToBreizh(680, 1280, new
		// Point(47.3,-2.51)).abcisse, Point.GpsToBreizh(680, 1280, new
		// Point(47.3,-2.51)).ordonnee, 8.5*7.33)) ;
		// System.out.print(capDeg(47.39,-2.85,47.41,-2.62));
		// System.out.print(latXInterRSetRF(Point.GpsToBreizh(680, 1280, new
		// Point(47.37, -2.70)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.37,
		// -2.70)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.33,
		// -2.66)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.33,
		// -2.66)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.3,
		// -2.51)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.3,
		// -2.51)).ordonnee, 8.5 ));
		// System.out.print(Point.GpsToBreizh(680, 1280, new Point(47.3,
		// -2.51)).ordonnee);
		// System.out.println(latXInterRSetRF(570.0, 913.0, 582.0, 926.0, 590.0, 972.0,
		// 10));
		// System.out.println(longYInterRSetRF(590.0, 913.0, 672.0, 926.0, 540.0, 972.0,
		// 8.5*7.33,latXInterRSetRF(590.0, 913.0, 672.0, 926.0, 540.0, 972.0,
		// 8.5*7.33)));
		// System.out.println(longYInterRSetRF(564.0, 867.0, 558.0, 873.0, 557.9, 938.0,
		// 6*7.33, latXInterRSetRF(564.0, 867.0, 558.0, 873.0, 557.9, 938.0, 6*7.33)));
		// System.out.print( latXInterRSetRF(564.0, 867.0, 558.0, 873.0, 557.9, 938.0,
		// 6*7.33));
		// System.out.print(Point.BreizhToGps(680, 1280, new Point(590.0,972.0)));
		// System.out.print(pointIntersectionX(1.46,0.14,-1.4,2.0));
		// System.out.print(distanceXY(47.33, -2.66, 47.3, -2.51));
		// System.out.println(quatrePortsLesPlusProches(48.587706, -5.04316,
		// Point.getPort()));
		// System.out.println(Point.getPort());
		// affichageQuatrePortsLesPlusProches(47.495571, -3.505096, Point.getPort());
		affQuatrePortsLesPlusProches();
	}

	/**
	 * 
	 * @param latA
	 *            : latitude en coordonn�es gps d'un point A
	 * @param longA
	 *            : longitude en coordonn�es gps d'un point A
	 * @param latB
	 *            : latitude en coordonn�es gps d'un point B
	 * @param longB
	 *            : longitude en coordonn�es gps d'un point B
	 * @return : le rapport la distance breizh et la distance gps
	 */
	public static double distanceXY(double latA, double longA, double latB, double longB) {
		double distanceGeo = distanceDeAr(latA, longA, latB, longB);
		double latXA = Point.GpsToBreizh(680, 1280, new Point(latA, longA)).abcisse;
		double longYA = Point.GpsToBreizh(680, 1280, new Point(latA, longA)).ordonnee;
		double latXB = Point.GpsToBreizh(680, 1280, new Point(latB, longB)).abcisse;
		double longYB = Point.GpsToBreizh(680, 1280, new Point(latB, longB)).ordonnee;

		double distanceCart = Math.sqrt(Math.pow((latXB - latXA), 2) + Math.pow((longYB - longYA), 2));

		return (distanceCart / distanceGeo);

	}

	/**
	 * 
	 * @param latDe
	 *            : latitude en coordonn�es g�ographiques du point de d�part
	 * @param longDe
	 *            : longitude en coordonn�es g�ographiques du point de d�part
	 * @param latAr
	 *            : latitude en coordonn�es g�ographiques du point d'arriv�e
	 * @param longAr
	 *            : longitude en coordonn�es g�ographiques du point d'arriv�e
	 * @return distance entre le point de d�part et le point d'arriv�e
	 */
	public static double distanceDeAr(double latDe, double longDe, double latAr, double longAr) {
		double distance = Math
				.acos(Math.sin(Math.toRadians(latDe)) * Math.sin(Math.toRadians(latAr))
						+ Math.cos(Math.toRadians(latDe)) * Math.cos(Math.toRadians(latAr))
								* Math.cos(Math.toRadians(longAr) - Math.toRadians(longDe))) // distance angulaire en
																								// radians
				* 6371 // distance en km
				* 0.539957; // distance en miles nautiques
		return distance;
	}

	/**
	 * 
	 * @param latDe
	 *            : latitude en coordonn�es g�ographiques du point de d�part
	 * @param longDe
	 *            : longitude en coordonn�es g�ographiques du point de d�part
	 * @param latAr
	 *            : latitude en coordonn�es g�ographiques du point d'arriv�e
	 * @param longAr
	 *            : longitude en coordonn�es g�ographiques du point d'arriv�e
	 * @return cap ou direction entre le point de d�part et le point d'arriv�e
	 */
	public static double capDeg(double latDe, double longDe, double latAr, double longAr) {
		double x = Math
				.log(Math.tan(Math.toRadians(latAr) / 2 + 3.14 / 4) / Math.tan(Math.toRadians(latDe) / 2 + 3.14 / 4));
		double y = Math.abs(Math.toRadians(longDe) - (Math.toRadians(longAr)));
		double cap = Math.toDegrees(Math.atan2(y, x)); // cap en degr�s
		return cap;
	}

	/**
	 * 
	 * @param latDe
	 *            : latitude en coordonn�es g�ographiques du point de d�part
	 * @param distance
	 *            : norme du vecteur
	 * @param cap
	 *            : direction du vecteur
	 * @return latitude en coordonn�es g�ographiques du point d'arriv�e du vecteur
	 */
	public static double coordGeoLat(double latDe, double distance, double cap) {
		int rayonT = 6371; // rayon de la Terre en km
		double latAr = Math.asin(Math.sin(Math.toRadians(latDe)) * Math.cos(Math.toRadians(distance / rayonT))
				+ Math.cos(Math.toRadians(latDe)) * Math.sin(Math.toRadians(distance / rayonT))
						* Math.cos(Math.toRadians(cap)));
		return latAr;
	}

	/**
	 * 
	 * @param longDe
	 *            : longitude en coordonn�es g�ographiques du point de d�part
	 * @param latDe
	 *            : latitude en coordonn�es g�ographiques du point de d�part
	 * @param latAr
	 *            : latitude en coordonn�es g�ographiques du point d'arriv�e
	 * @param cap
	 *            : direction du vecteur
	 * @param distance
	 *            : norme du vecteur
	 * @return longitude en coordonn�es g�ographiques du point d'arriv�e du vecteur
	 */
	public static double coordGeoLong(double longDe, double latDe, double latAr, double cap, double distance) {
		int rayonT = 6371; // rayon de la Terre en km
		double y = Math.sin(Math.toRadians(cap)) * Math.sin(Math.toRadians(distance / rayonT))
				* Math.cos(Math.toRadians(latDe));
		double x = Math.cos(Math.toRadians(distance / rayonT))
				- Math.sin(Math.toRadians(latDe)) * Math.sin(Math.toRadians(latAr));
		double longAr = Math.toRadians(longDe) + Math.atan2(Math.toRadians(y), Math.toRadians(x));
		return longAr;
	}

	/**
	 * 
	 * @param latx
	 *            : latitude en coordonn�e x,y du point d'arriv�e du vecteur courant
	 * @param longy
	 *            : longitude en coordonn�e x,y du point d'arriv�e du vecteur
	 *            courant
	 * @param rayon
	 *            : distance de la RS = vitesse du bateau (1h)
	 * @param coeffDir
	 *            : coefficient directeur de la droite (AB)
	 * @param ordOrig
	 *            : ordonn�e � l'origine de la droite (AB)
	 * @return premi�re solution x de l'intersection entre le cercle, de rayon �gal
	 *         � la distance RS, et la droite (AB)
	 */
	public static double pointIntersectionXUn(double latX, double longY, double rayon, double coeffDir,
			double ordOrig) {
		double x = 1;

		double a = 1 + coeffDir * coeffDir;
		double b = (-2.0) * latX + 2.0 * coeffDir * ordOrig - 2.0 * coeffDir * longY;
		double c = Math.pow(latX, 2) + Math.pow(longY, 2) + Math.pow(ordOrig, 2) - 2.0 * ordOrig * longY
				- Math.pow(rayon, 2);

		double delta = Math.pow(b, 2) - 4.0 * a * c;
		if (delta > 0) {
			x = ((-b) + Math.sqrt(delta)) / (2.0 * a);
		} else {
			if (delta == 0) {
				x = (-b) / (2.0 * a);
			}
		}

		return x;
	}

	/**
	 * 
	 * @param latx
	 *            : latitude en coordonn�e x,y du point d'arriv�e du vecteur courant
	 * @param longy
	 *            : longitude en coordonn�e x,y du point d'arriv�e du vecteur
	 *            courant
	 * @param rayon
	 *            : distance de la RS = vitesse du bateau (1h)
	 * @param coeffDir
	 *            : coefficient directeur de la droite (AB)
	 * @param ordOrig
	 *            : ordonn�e � l'origine de la droite (AB)
	 * @return deuxi�me solution x de l'intersection entre le cercle, de rayon �gal
	 *         � la distance RS, et la droite (AB)
	 */
	public static double pointIntersectionXDeux(double latX, double longY, double rayon, double coeffDir,
			double ordOrig) {
		double a = 1 + coeffDir * coeffDir;
		double b = (-2) * latX + 2 * coeffDir * ordOrig - 2 * coeffDir * longY;
		double c = Math.pow(latX, 2) + Math.pow(longY, 2) + Math.pow(ordOrig, 2) - 2 * ordOrig * longY
				- Math.pow(rayon, 2);
		double x = 1;
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta > 0) {
			x = ((-b) - Math.sqrt(delta)) / (2 * a);
		} else {
			if (delta == 0) {
				x = (-b) / (2 * a);
			}
		}

		return x;
	}

	/**
	 * 
	 * @param xUn
	 *            : premi�re solution x de l'intersection entre un cercle et une
	 *            droite
	 * @param xDeux
	 *            : deuxi�me solution x de l'intersection entre un cercle et une
	 *            droite
	 * @param xA
	 *            : coordonn�e x du point de d�part du bateau
	 * @param xB
	 *            : coordonn�e x du point d'arriv�e du bateau
	 * @return la coordonn�e x du point d'intersection entre un cercle et une droite
	 */
	public static double pointIntersectionX(double xUn, double xDeux, double xA, double xB) {
		double x = 0;
		if ((Math.abs(xB) - Math.abs(xUn)) <= (Math.abs(xB) - Math.abs(xDeux))) {
			x = xUn;
		} else {
			x = xDeux;
		}

		return x;
	}

	/**
	 * 
	 * @param coeffDir
	 * @param ordOrig
	 * @param x
	 * @return la coordonn�e y du point d'intersection entre un cercle et une droite
	 */
	public static double pointIntersectionY(double coeffDir, double ordOrig, double x) {
		double y = coeffDir * x + ordOrig;
		return y;
	}

	/**
	 * 
	 * @param deg
	 * @param minute
	 * @param sec
	 * @param pntCard
	 * @return latitude en coordonn�es g�ographiques du point en degr�s d�cimaux
	 */
	public static double coordGeoDecLat(int deg, int minute, double sec, String pntCard) {
		double latX = 0;
		if (pntCard.equalsIgnoreCase("n")) {
			latX = deg + minute / 60.0 + sec / 3600.0;
		} else {
			if (pntCard.equalsIgnoreCase("s")) {
				latX = (deg + minute / 60.0 + sec / 3600.0) * (-1);
			}
		}
		return latX;
	}

	/**
	 * 
	 * @param deg
	 * @param minute
	 * @param sec
	 * @param pntCard
	 * @return longitude en coordonn�es g�ographiques du point en degr�s d�cimaux
	 */
	public static double coordGeoDecLong(int deg, int minute, double sec, String pntCard) {
		double longX = 0;
		if (pntCard.equalsIgnoreCase("e")) {
			longX = deg + minute / 60.0 + sec / 3600.0;
		} else {
			if (pntCard.equalsIgnoreCase("o")) {
				longX = (deg + minute / 60.0 + sec / 3600.0) * (-1);
			}
		}
		return longX;
	}

	/**
	 * 
	 * @param latXVectAr
	 *            : latitude en coordonn�es x,y du point d'arriv�e du vecteur
	 *            courant
	 * @param longYVectAr
	 *            : longitude en coordonn�es x,y du point d'arriv�e du vecteur
	 *            courant
	 * @param latXA
	 *            : latitude en coordonn�es x,y du point de d�part du bateau
	 * @param longYA
	 *            : longitude en coordonn�es x,y du point de d�part du bateau
	 * @param latXB
	 *            : latitude en coordonn�es x,y du point d'arriv�e du bateau
	 * @param longYB
	 *            : longitude en coordonn�es x,y du point d'arriv�e du bateau
	 * @param distanceRS
	 *            : distance de la RS = vitesse du bateau (pour 1h)
	 * @return latitude en coordonn�es x,y du point d'intersection entre la RS et la
	 *         RF
	 */
	public static double latXInterRSetRF(double latXVectAr, double longYVectAr, double latXA, double longYA,
			double latXB, double longYB, double distanceRS) {
		double latX = pointIntersectionX(
				pointIntersectionXUn(latXVectAr, longYVectAr, distanceRS, (longYB - longYA) / (latXB - latXA),
						longYB - ((longYB - longYA) / (latXB - latXA)) * latXB),
				pointIntersectionXDeux(latXVectAr, longYVectAr, distanceRS, (longYB - longYA) / (latXB - latXA),
						longYB - ((longYB - longYA) / (latXB - latXA)) * latXB),
				latXA, latXB);
		return latX;
	}

	/**
	 * 
	 * @param latXVectAr
	 *            : latitude en coordonn�es x,y du point d'arriv�e du vecteur
	 *            courant
	 * @param longYVectAr
	 *            : longitude en coordonn�es x,y du point d'arriv�e du vecteur
	 *            courant
	 * @param latXA
	 *            : latitude en coordonn�es x,y du point de d�part du bateau
	 * @param longYA
	 *            : longitude en coordonn�es x,y du point de d�part du bateau
	 * @param latXB
	 *            : latitude en coordonn�es x,y du point d'arriv�e du bateau
	 * @param longYB
	 *            : longitude en coordonn�es x,y du point d'arriv�e du bateau
	 * @param distanceRS
	 *            : distance de la RS = vitesse du bateau (pour 1h)
	 * @param latX
	 *            : latitude en coordonn�es x,y du point d'intersection entre la RS
	 *            et la RF
	 * @return longitude en coordonn�es x,y du point d'intersection entre la RS et
	 *         la RF
	 */
	public static double longYInterRSetRF(double latXVectAr, double longYVectAr, double latXA, double longYA,
			double latXB, double longYB, double distanceRS, double latX) {
		double longY = pointIntersectionY((longYB - longYA) / (latXB - latXA),
				longYB - ((longYB - longYA) / (latXB - latXA)) * latXB,
				latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS));
		return longY;
	}

	/**
	 * 
	 * @param latX
	 *            : latitude, en coordonn�es x,y, du point d'intersection entre la
	 *            RS et la RF
	 * @param longY
	 *            : longitude, en coordonn�es x,y, du point d'intersection entre la
	 *            RS et la RF
	 * @return latitude, en coordonn�es g�ographiques, du point d'intersection entre
	 *         la RS et la RF
	 */
	public static double latInterRSetRF(double latX, double longY) {
		return Point.BreizhToGps(680, 1280, new Point(latX, longY)).abcisse;
	}

	/**
	 * 
	 * @param latX
	 *            : latitude, en coordonn�es x,y, du point d'intersection entre la
	 *            RS et la RF
	 * @param longY
	 *            : longitude, en coordonn�es x,y, du point d'intersection entre la
	 *            RS et la RF
	 * @return longitude, en coordonn�es g�ographiques, du point d'intersection
	 *         entre la RS et la RF
	 */
	public static double longInterRSetRF(double latX, double longY) {
		return Point.BreizhToGps(680, 1280, new Point(latX, longY)).ordonnee;
	}

	/**
	 * 
	 * @param tabVect
	 *            : tableau de vecteurs courants
	 * @param latA
	 *            : latitude en coordonn�es g�ographiques du point de d�part du
	 *            bateau
	 * @param longA
	 *            : longitude en coordonn�es g�ographiques du point de d�part du
	 *            bateau
	 * @param latB
	 *            : latitude en coordonn�es g�ographiques du point d'arriv�e du
	 *            bateau
	 * @param longB
	 *            : longitude en coordonn�es g�ographiques du point d'arriv�e du
	 *            bateau
	 * @return le tableau de caps � prendre pour aller au point B en fonction des
	 *         vecteurs courants
	 */
	/*
	 * public static double[] tabCapUnPointB (Vector[] tabVect, double latA, double
	 * longA, double latB, double longB ) {
	 * 
	 * 
	 * int nbCap = 0; for(int k = 0; k < tabVect.length; k++) {
	 * if(capDeg(tabVect[k].depart.abcisse, tabVect[k].depart.ordonnee,
	 * tabVect[k].arrivee.abcisse, tabVect[k].arrivee.ordonnee) !=
	 * capDeg(tabVect[k+1].depart.abcisse, tabVect[k+1].depart.ordonnee,
	 * tabVect[k+1].arrivee.abcisse, tabVect[k+1].arrivee.ordonnee) ||
	 * distanceDeAr(tabVect[k].depart.abcisse, tabVect[k].depart.ordonnee,
	 * tabVect[k].arrivee.abcisse, tabVect[k].arrivee.ordonnee) !=
	 * distanceDeAr(tabVect[k+1].depart.abcisse, tabVect[k+1].depart.ordonnee,
	 * tabVect[k+1].arrivee.abcisse, tabVect[k+1].arrivee.ordonnee)) { nbCap = nbCap
	 * + 1; } }
	 * 
	 * 
	 * double tabCap [] = new double[nbCap]; int i = 0; int cmpt = 0; for(int j = 0;
	 * j < tabCap.length; j++) { cmpt = i; i = i+1;
	 * while(capDeg(tabVect[i].depart.abcisse, tabVect[i].depart.ordonnee,
	 * tabVect[i].arrivee.abcisse, tabVect[i].arrivee.ordonnee) ==
	 * capDeg(tabVect[i+1].depart.abcisse, tabVect[i+1].depart.ordonnee,
	 * tabVect[i+1].arrivee.abcisse, tabVect[i+1].arrivee.ordonnee) &&
	 * distanceDeAr(tabVect[i].depart.abcisse, tabVect[i].depart.ordonnee,
	 * tabVect[i].arrivee.abcisse, tabVect[i].arrivee.ordonnee) ==
	 * distanceDeAr(tabVect[i+1].depart.abcisse, tabVect[i+1].depart.ordonnee,
	 * tabVect[i+1].arrivee.abcisse, tabVect[i+1].arrivee.ordonnee)) { i++; } //
	 * tabCap[j] = capRS (tabVect[cmpt].arrivee.abcisse,
	 * tabVect[cmpt].arrivee.ordonnee, Point.GpsToBreizh(45.0, 54.0,
	 * tabVect[cmpt].arrivee).abcisse, Point.GpsToBreizh(45.0, 54.0,
	 * tabVect[cmpt].arrivee).ordonnee, Point.GpsToBreizh(45.0, 54.0, new
	 * Point(latA,longA)).abcisse, Point.GpsToBreizh(45.0, 54.0, new
	 * Point(latA,longA)).ordonnee, Point.GpsToBreizh(45.0, 54.0, new Point(latB,
	 * longB)).abcisse, Point.GpsToBreizh(45.0, 54.0, new Point(latB,
	 * longB)).ordonnee, Dialog.info[2]); }
	 * 
	 * return tabCap;
	 * 
	 * }
	 */

	/*
	 * public static double[] tabCapUnPointBEssai () {
	 * 
	 * int nbCap = 0; for(int k = 0; k < Courant.getCourant(coeffDir()[0],
	 * ordOrig()[0], new Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[0]).length; k++) {
	 * if(capDeg(Courant.getCourant(coeffDir()[k], ordOrig()[k], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k])[k].depart.abcisse,
	 * Courant.getCourant(coeffDir()[k], ordOrig()[k], new Point(DialogInfo.info[1],
	 * DialogInfo.info[0]), quatrePortsLesPlusProches()[k])[k].depart.ordonnee,
	 * Courant.getCourant(coeffDir()[k], ordOrig()[k], new Point(DialogInfo.info[1],
	 * DialogInfo.info[0]), quatrePortsLesPlusProches()[k])[k].arrivee.abcisse,
	 * Courant.getCourant(coeffDir()[k], ordOrig()[k], new Point(DialogInfo.info[1],
	 * DialogInfo.info[0]), quatrePortsLesPlusProches()[k])[k].arrivee.ordonnee) !=
	 * capDeg(Courant.getCourant(coeffDir()[k+1], ordOrig()[k+1], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k+1])[k+1].depart.abcisse,
	 * Courant.getCourant(coeffDir()[k+1], ordOrig()[k+1], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k+1])[k+1].depart.ordonnee,
	 * Courant.getCourant(coeffDir()[k+1], ordOrig()[k+1], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k+1])[k+1].arrivee.abcisse,
	 * Courant.getCourant(coeffDir()[k+1], ordOrig()[k+1], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k+1])[k+1].arrivee.ordonnee) ||
	 * distanceDeAr(Courant.getCourant(coeffDir()[k], ordOrig()[k], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k])[k].depart.abcisse,
	 * Courant.getCourant(coeffDir()[k], ordOrig()[k], new Point(DialogInfo.info[1],
	 * DialogInfo.info[0]), quatrePortsLesPlusProches()[k])[k].depart.ordonnee,
	 * Courant.getCourant(coeffDir()[k], ordOrig()[k], new Point(DialogInfo.info[1],
	 * DialogInfo.info[0]), quatrePortsLesPlusProches()[k])[k].arrivee.abcisse,
	 * Courant.getCourant(coeffDir()[k], ordOrig()[k], new Point(DialogInfo.info[1],
	 * DialogInfo.info[0]), quatrePortsLesPlusProches()[k])[k].arrivee.ordonnee) !=
	 * distanceDeAr(Courant.getCourant(coeffDir()[k+1], ordOrig()[k+1], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k+1])[k+1].depart.abcisse,
	 * Courant.getCourant(coeffDir()[k+1], ordOrig()[k+1], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k+1])[k+1].depart.ordonnee,
	 * Courant.getCourant(coeffDir()[k+1], ordOrig()[k+1], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k+1])[k+1].arrivee.abcisse,
	 * Courant.getCourant(coeffDir()[k+1], ordOrig()[k+1], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[k+1])[k+1].arrivee.ordonnee)) { nbCap = nbCap +
	 * 1; } } double tabCap [] = new double[nbCap]; int i = 0; int cmpt = 0; for(int
	 * j = 0; j < tabCap.length; j++) { cmpt = i; i = i+1; Vector a =
	 * Courant.getCourant(coeffDir()[i], ordOrig()[i], new Point(DialogInfo.info[1],
	 * DialogInfo.info[0]), quatrePortsLesPlusProches()[i])[i]; Vector b =
	 * Courant.getCourant(coeffDir()[i+1], ordOrig()[i+1], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]),
	 * quatrePortsLesPlusProches()[i+1])[i+1]; while(capDeg(a.depart.abcisse,
	 * a.depart.ordonnee, a.arrivee.abcisse, a.arrivee.ordonnee) ==
	 * capDeg(b.depart.abcisse, b.depart.ordonnee, b.arrivee.abcisse,
	 * b.arrivee.ordonnee) && distanceDeAr(a.depart.abcisse, a.depart.ordonnee,
	 * a.arrivee.abcisse, a.arrivee.ordonnee) == distanceDeAr(b.depart.abcisse,
	 * b.depart.ordonnee, b.arrivee.abcisse, b.arrivee.ordonnee)) { i++; } Vector []
	 * tab = Courant.getCourant(coeffDir()[cmpt], ordOrig()[cmpt], new
	 * Point(DialogInfo.info[1], DialogInfo.info[0]), ) tabCap[j] = capRS
	 * (tabVect[cmpt].arrivee.abcisse, tabVect[cmpt].arrivee.ordonnee,
	 * Point.GpsToBreizh(45.0, 54.0, tabVect[cmpt].arrivee).abcisse,
	 * Point.GpsToBreizh(45.0, 54.0, tabVect[cmpt].arrivee).ordonnee,
	 * Point.GpsToBreizh(45.0, 54.0, new Point(latA,longA)).abcisse,
	 * Point.GpsToBreizh(45.0, 54.0, new Point(latA,longA)).ordonnee,
	 * Point.GpsToBreizh(45.0, 54.0, new Point(latB, longB)).abcisse,
	 * Point.GpsToBreizh(45.0, 54.0, new Point(latB, longB)).ordonnee,
	 * DialogInfo.info[2]); }
	 * 
	 * return tabCap;
	 * 
	 * 
	 * }
	 */

	/*
	 * public static int nbCapMax (double latA, double longA) { int nbCap = 0;
	 * for(int k = 0; k < 1000; k++) { if(capDeg(Courant.getCourant(coeffDir(latA,
	 * longA, quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee),
	 * ordOrig(latA, longA, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), new Point(latA,longA), new
	 * Point(quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.ordonnee,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].arrivee.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].arrivee.ordonnee) !=
	 * capDeg(Courant.getCourant(coeffDir(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].ordonnee),
	 * ordOrig(latA, longA, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee), new Point(latA,longA), new
	 * Point(quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee))[k+1].depart.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee))[k+1].depart.ordonnee,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee))[k+1].arrivee.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee))[k+1].arrivee.ordonnee) ||
	 * distanceDeAr(Courant.getCourant(coeffDir(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee),
	 * ordOrig(latA, longA, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), new Point(latA,longA), new
	 * Point(quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.ordonnee,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.ordonnee,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.ordonnee,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.ordonnee,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].arrivee.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].depart.ordonnee,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k].ordonnee))[k].arrivee.ordonnee) !=
	 * distanceDeAr(Courant.getCourant(coeffDir(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].ordonnee),
	 * ordOrig(latA, longA, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee), new Point(latA,longA), new
	 * Point(quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee))[k+1].depart.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee))[k+1].depart.ordonnee,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee))[k+1].arrivee.abcisse,
	 * Courant.getCourant(coeffDir(latA, longA, quatrePortsLesPlusProches(latA,
	 * longA, Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee), ordOrig(latA, longA,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].abcisse,
	 * quatrePortsLesPlusProches(latA, longA, Point.getPort())[k+1].ordonnee), new
	 * Point(latA,longA), new Point(quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].abcisse, quatrePortsLesPlusProches(latA, longA,
	 * Point.getPort())[k+1].ordonnee))[k+1].arrivee.ordonnee)) { nbCap = nbCap + 1;
	 * } } }
	 */

	/**
	 * @param latVectAr
	 *            : latitude en coordonn�es g�ographiques du point d'arriv�e du
	 *            vecteur courant
	 * @param longVectAr
	 *            : longitude en coordonn�es g�ographiques du point d'arriv�e du
	 *            vecteur courant
	 * @param latXVectAr
	 *            : latitude en coordonn�es x,y du point d'arriv�e du vecteur
	 *            courant
	 * @param longYVectAr
	 *            : longitude en coordonn�es x,y du point d'arriv�e du vecteur
	 *            courant
	 * @param latXA
	 *            : latitude en coordonn�es x,y du point de d�part du bateau
	 * @param longYA
	 *            : longitude en coordonn�es x,y du point de d�part du bateau
	 * @param latXB
	 *            : latitude en coordonn�es x,y du point d'arriv�e du bateau
	 * @param longYB
	 *            : longitude en coordonn�es x,y du point d'arriv�e du bateau
	 * @param distanceRS
	 *            : distance de la RS = vitesse du bateau (1h)
	 * @return cap de RS, c'est � dire la direction du vecteur RS
	 */
	public static double capRS(double latVectAr, double longVectAr, double latXVectAr, double longYVectAr, double latXA,
			double longYA, double latXB, double longYB, double distanceRS) {
		double cap = capDeg(latVectAr, longVectAr,
				latInterRSetRF(latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS),
						longYInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS,
								latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS))),
				longInterRSetRF(latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS),
						longYInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS,
								latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS))));
		return cap;

	}

	/**
	 * @return : le tableau de type double,double de la liste des caps pour les 4
	 *         ports les plus proches du point de d�part du bateau
	 */
	public static double[][] tabCapQuatrePorts() {

		double tabCapQuatrePorts[][] = new double[1000][4];
		for (int i = 0; i < tabCapQuatrePorts[0].length; i++) {
			for (int j = 0; j < tabCapQuatrePorts.length; j++) {
				tabCapQuatrePorts[j][i] = capRS(
						Courant.getCourant(coeffDir()[i], ordOrig()[i],
								new Point(DialogInfo.info[1], DialogInfo.info[0]),
								quatrePortsLesPlusProches()[i])[j].arrivee.abcisse,
						Courant.getCourant(coeffDir()[i], ordOrig()[i],
								new Point(DialogInfo.info[1], DialogInfo.info[0]),
								quatrePortsLesPlusProches()[i])[j].arrivee.ordonnee,
						Point.GpsToBreizh(680, 1280,
								new Point(
										Courant.getCourant(coeffDir()[i], ordOrig()[i],
												new Point(DialogInfo.info[1], DialogInfo.info[0]),
												quatrePortsLesPlusProches()[i])[j].arrivee.abcisse,
										Courant.getCourant(coeffDir()[i], ordOrig()[i],
												new Point(DialogInfo.info[1], DialogInfo.info[0]),
												quatrePortsLesPlusProches()[i])[j].arrivee.ordonnee)).abcisse,
						Point.GpsToBreizh(680, 1280,
								new Point(
										Courant.getCourant(coeffDir()[i], ordOrig()[i],
												new Point(DialogInfo.info[1], DialogInfo.info[0]),
												quatrePortsLesPlusProches()[i])[j].arrivee.abcisse,
										Courant.getCourant(coeffDir()[i], ordOrig()[i],
												new Point(DialogInfo.info[1], DialogInfo.info[0]),
												quatrePortsLesPlusProches()[i])[j].arrivee.ordonnee)).ordonnee,
						Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse,
						Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee,
						Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[i]).abcisse,
						Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[i]).ordonnee, DialogInfo.info[2]);
			}
		}
		return tabCapQuatrePorts;
	}

	/**
	 * 
	 * @param latA
	 *            : latitude en coordonn�es gps du point de d�part du bateau
	 * @param longA
	 *            : longitude en coordonn�es gps du point de d�part du bateau
	 *            * @param quatrePorts : tableau de type Point des quatre ports les
	 *            plus proches du point de d�part du bateau
	 * @param tabVect
	 *            : tabeau de type Vector des vecteurs courants sur la droite (AB)
	 *            affiche le tableau de type double,double de la liste des caps pour
	 *            les 4 ports les plus proches du point de d�part du bateau
	 */
	/*
	 * public static void affichaeTabCapQuatrePorts (double latA, double longA,
	 * Point[] quatrePorts){
	 * 
	 * double tabCapQuatrePorts[][] = new double[][]; for(int i = 0; i <
	 * tabCapQuatrePorts[0].length; i++) { for(int j = 0; j <
	 * tabCapQuatrePorts.length; j++) { tabCapQuatrePorts[j][i] =
	 * tabCapUnPointB(Courant.getCourant(coeffDir(latA, longA,
	 * quatrePorts[i].abcisse, quatrePorts[i].ordonnee), ordOrig(latA, longA,
	 * quatrePorts[i].abcisse, quatrePorts[i].ordonnee), new Point(latA,longA), new
	 * Point(quatrePorts[i].abcisse, quatrePorts[i].ordonnee)), latA, longA,
	 * quatrePorts[i].abcisse, quatrePorts[i].ordonnee)[j];
	 * System.out.print(tabCapQuatrePorts[j][i]); } }
	 * 
	 * }
	 */
	// System.out.print(afficheTapCapQuatrePorts(48.5877,-5.0431,quatrePortsLesPlusProches
	// (48.5877, -5.0431, Point.getPort()),Courant.getCourant(coeffDir()))

	/**
	 * @return : le tableau des quatre ports o� leur distance, qui les s�parent avec
	 *         le point du d�part du bateau, est la plus courte par rapport aux
	 *         autres ports
	 */
	public static Point[] quatrePortsLesPlusProches() {
		Point essai[] = new Point[Point.getPort().length];
		for (int k = 0; k < Point.getPort().length; k++) {
			essai[k] = Point.getPort()[k];
		}
		Point portsPlusProches[] = new Point[4];
		for (int j = 1; j <= 4; j++) {
			for (int i = 0; i < Point.getPort().length - j; i++) {
				if (distanceDeAr(48.883260, -2.530249, essai[i].abcisse,
						essai[i].ordonnee) < distanceDeAr(48.883260, -2.530249, essai[i + 1].abcisse,
								essai[i + 1].ordonnee)) {
					Point c = essai[i];
					essai[i] = essai[i + 1];
					essai[i + 1] = c;
				}
			}
			portsPlusProches[j - 1] = essai[essai.length - j];
		}
		return portsPlusProches;
	}

	public static void affQuatrePortsLesPlusProches() {
		for (int i = 0; i < quatrePortsLesPlusProches().length; i++) {
			System.out.println(quatrePortsLesPlusProches()[i]);
		}
	}

	/**
	 * 
	 * @param latA
	 *            : latitude en coordonn�es gps du point de d�part du bateau
	 * @param longA
	 *            : longitude en coordonn�es gps du point de d�part du bateau
	 * @param ports
	 *            : tableau des ports de Bretagne Affiche le tableau des 4 ports les
	 *            plus proches du point de d�part du bateau
	 */
	/*
	 * public static void affichageQuatrePortsLesPlusProches (double latA, double
	 * longA, Point[]ports) {
	 * 
	 * Point portsPlusProches[] = new Point[4]; for(int j = 1 ; j <= 4 ; j++) { for
	 * (int i = 0; i < ports.length - j; i++) {
	 * if(distanceDeAr(latA,longA,ports[i].abcisse, ports[i].ordonnee) <
	 * distanceDeAr(latA,longA,ports[i+1].abcisse, ports[i+1].ordonnee)) { Point c =
	 * ports[i]; ports[i] = ports[i+1]; ports[i+1] = c; } } portsPlusProches[j-1] =
	 * ports[ports.length - j]; System.out.print(portsPlusProches[j-1]+"\n"); } }
	 */

	/**
	 * @return : le coefficient directeur de la droite (AB)
	 */
	public static double[] coeffDir() {
		double latXA = Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse;
		double longYA = Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee;
		double coeffDir[] = new double[4];
		for (int i = 0; i < coeffDir.length; i++) {
			double latXB = Point.GpsToBreizh(680, 1280,
					new Point(quatrePortsLesPlusProches()[i].abcisse, quatrePortsLesPlusProches()[i].ordonnee)).abcisse;
			double longYB = Point.GpsToBreizh(680, 1280, new Point(quatrePortsLesPlusProches()[i].abcisse,
					quatrePortsLesPlusProches()[i].ordonnee)).ordonnee;
			coeffDir[i] = (longYB - longYA) / (latXB - latXA);
		}
		return coeffDir;
	}

	/**
	 * @return : l'ordonn�e � l'origine de la droite (AB)
	 */
	public static double[] ordOrig() {
		double latXA = Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse;
		double longYA = Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee;

		double ordOrig[] = new double[4];
		for (int i = 0; i < ordOrig.length; i++) {
			ordOrig[i] = longYA - coeffDir()[i] * latXA;
		}

		return ordOrig;
	}

	/**
	 * @return : un tableau de type Point avec les points des ports en coordonn�es
	 *         Breizh (les points B)
	 */
	public static Point[] tabPointsB() {
		Point[] pointsB = new Point[4];
		for (int i = 0; i < pointsB.length; i++) {
			pointsB[i] = Point.GpsToBreizh(680, 1280,
					new Point(quatrePortsLesPlusProches()[i].abcisse, quatrePortsLesPlusProches()[i].ordonnee));
		}
		return pointsB;
	}

}
