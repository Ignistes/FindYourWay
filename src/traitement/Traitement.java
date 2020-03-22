package traitement;

import utils.Vector;

import utils.Point;
import java.util.ArrayList;
import utils.Vector;
import gui.Dialog;
import gui.DialogInfo;

public class Traitement {
	
	
	// A faire demain : 
	// - demander à Pierre comment obtenir hauteur et largeur suivant les écrans

	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println(capDeg(47.4166667,-2.8333333333333335,47.4116651,-2.6207216)+" degrés");	//test de la fonction capDeg qui calcule le cap entre deux points	 
		System.out.println(distanceDeAr(47.4166667,-2.8333333333333335,47.4116651,-2.6207216)+" miles nautiques");	//test de la fonction distanceDeAr qui calcule la distance entre deux points	
		System.out.println(coordGeoDecLat(48, 6, 40.819, "N"));
		*/
		//System.out.println(capRS(47.39, (-2.85), Point.GpsToBreizh(680, 1280, new Point(47.39,(-2.85))).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.39,(-2.85))).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.40,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.4,-2.62)).ordonnee, 6)) ;
		//System.out.println(Point.BreizhToGps(680, 1280, new Point( latXInterRSetRF(Point.GpsToBreizh(680, 1280, new Point(47.38,(-2.86))).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.38,(-2.86))).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.42,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.42,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.62)).ordonnee, 6.0), longYInterRSetRF(Point.GpsToBreizh(680, 1280, new Point(47.38,(-2.86))).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.38,(-2.86))).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.42,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.42,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.62)).ordonnee, 6.0, latXInterRSetRF(Point.GpsToBreizh(680, 1280, new Point(47.38,(-2.86))).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.38,(-2.86))).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.42,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.42,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.62)).ordonnee, 6.0)))).abcisse) ;
		//System.out.print(latXInterRSetRF(Point.GpsToBreizh(680, 1280, new Point(47.38,(-2.86))).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.38,(-2.86))).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.42,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.42,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.62)).ordonnee, 6.0));
		//System.out.println(latXInterRSetRF(2, 3, 3, 8, 5, 12, 2));
		//System.out.println(pointIntersectionXUn(2,3,2,2,2));
		//System.out.println(capRS(47.37, (-2.70), Point.GpsToBreizh(680, 1280, new Point(47.37,(-2.70))).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.37,(-2.70))).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.33,-2.66)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.33,-2.66)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.3,-2.51)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.3,-2.51)).ordonnee, 8.5*7.33)) ;
		//System.out.print(capDeg(47.39,-2.85,47.41,-2.62));
		//System.out.print(latXInterRSetRF(Point.GpsToBreizh(680, 1280, new Point(47.37, -2.70)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.37, -2.70)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.33, -2.66)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.33, -2.66)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.3, -2.51)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.3, -2.51)).ordonnee, 8.5 ));
		//System.out.print(Point.GpsToBreizh(680, 1280, new Point(47.3, -2.51)).ordonnee);
		//System.out.println(latXInterRSetRF(570.0, 913.0, 582.0, 926.0, 590.0, 972.0, 10));
		//System.out.println(longYInterRSetRF(590.0, 913.0, 672.0, 926.0, 540.0, 972.0, 8.5*7.33,latXInterRSetRF(590.0, 913.0, 672.0, 926.0, 540.0, 972.0, 8.5*7.33)));
		//System.out.println(longYInterRSetRF(564.0, 867.0, 558.0, 873.0, 557.9, 938.0, 6*7.33, latXInterRSetRF(564.0, 867.0, 558.0, 873.0, 557.9, 938.0, 6*7.33)));
		//System.out.print( latXInterRSetRF(564.0, 867.0, 558.0, 873.0, 557.9, 938.0, 6*7.33));
		//System.out.print(Point.BreizhToGps(680, 1280, new Point(590.0,972.0)));
		//System.out.print(pointIntersectionX(1.46,0.14,-1.4,2.0));
		//System.out.print(distanceXY(47.33, -2.66, 47.3, -2.51));
		//System.out.println(quatrePortsLesPlusProches(48.587706, -5.04316, Point.getPort()));
		//System.out.println(Point.getPort());
		affichageQuatrePortsLesPlusProches(48.587706, -5.04316, Point.getPort());
	}

	
	
	
	
	
	/**
	 * 
	 * @param latA : latitude en coordonnées gps d'un point A
	 * @param longA : longitude en coordonnées gps d'un point A
	 * @param latB : latitude en coordonnées gps d'un point B
	 * @param longB : longitude en coordonnées gps d'un point B
	 * @return : le rapport la distance breizh et la distance gps
	 */
	public static double distanceXY (double latA, double longA, double latB, double longB) {
		double distanceGeo = distanceDeAr(latA, longA, latB, longB);
		double latXA = Point.GpsToBreizh(680, 1280, new Point(latA, longA)).abcisse;
		double longYA =  Point.GpsToBreizh(680, 1280, new Point(latA, longA)).ordonnee;
		double latXB = Point.GpsToBreizh(680, 1280, new Point(latB, longB)).abcisse;
		double longYB = Point.GpsToBreizh(680, 1280, new Point(latB, longB)).ordonnee;
		
		double distanceCart = Math.sqrt(Math.pow((latXB - latXA), 2) + Math.pow((longYB - longYA), 2));
		
		return (distanceCart/distanceGeo);
		
	}
	
	
	/**
	 * 
	 * @param latDe : latitude en coordonnées géographiques du point de départ
	 * @param longDe : longitude en coordonnées géographiques du point de départ
	 * @param latAr : latitude en coordonnées géographiques du point d'arrivée
	 * @param longAr : longitude en coordonnées géographiques du point d'arrivée
	 * @return distance entre le point de départ et le point d'arrivée
	 */
	public static double distanceDeAr(double latDe, double longDe, double latAr, double longAr) {
		double distance = Math.acos(Math.sin(Math.toRadians(latDe))
							*Math.sin(Math.toRadians(latAr))
							+Math.cos(Math.toRadians(latDe))
							*Math.cos(Math.toRadians(latAr))
							*Math.cos(Math.toRadians(longAr)-Math.toRadians(longDe)))	//distance angulaire en radians
							*6371	//distance en km
							*0.539957;	//distance en miles nautiques
		return distance;
	}
	
	
	/**
	 * 
	 * @param latDe : latitude en coordonnées géographiques du point de départ
	 * @param longDe : longitude en coordonnées géographiques du point de départ
	 * @param latAr : latitude en coordonnées géographiques du point d'arrivée
	 * @param longAr : longitude en coordonnées géographiques du point d'arrivée
	 * @return cap ou direction entre le point de départ et le point d'arrivée
	 */
	public static double capDeg(double latDe, double longDe, double latAr, double longAr) {
		double x = Math.log(Math.tan(Math.toRadians(latAr)/2 + 3.14/4)/Math.tan(Math.toRadians(latDe)/2 + 3.14/4));
		double y = Math.abs(Math.toRadians(longDe) - (Math.toRadians(longAr)) );
		double cap = Math.toDegrees(Math.atan2(y, x));	//cap en degrés
		return cap;
	}
	
	
	/**
	 * 
	 * @param latDe : latitude en coordonnées géographiques du point de départ
	 * @param distance : norme du vecteur
	 * @param cap : direction du vecteur
	 * @return latitude en coordonnées géographiques du point d'arrivée du vecteur
	 */
	public static double coordGeoLat(double latDe,double distance, double cap){
		int rayonT = 6371;	//rayon de la Terre en km
		double latAr = Math.asin(Math.sin(Math.toRadians(latDe))
						*Math.cos(Math.toRadians(distance/rayonT))
						+ Math.cos(Math.toRadians(latDe))
						*Math.sin(Math.toRadians(distance/rayonT))
						*Math.cos(Math.toRadians(cap))) ;
		return latAr;
	}
	
	
	/**
	 * 
	 * @param longDe : longitude en coordonnées géographiques du point de départ
	 * @param latDe : latitude en coordonnées géographiques du point de départ
	 * @param latAr : latitude en coordonnées géographiques du point d'arrivée
	 * @param cap : direction du vecteur
	 * @param distance : norme du vecteur
	 * @return longitude en coordonnées géographiques du point d'arrivée du vecteur
	 */
	public static double coordGeoLong(double longDe, double latDe, double latAr, double cap, double distance) {
		int rayonT = 6371;	//rayon de la Terre en km
		double y = Math.sin(Math.toRadians(cap))
					*Math.sin(Math.toRadians(distance/rayonT))
					*Math.cos(Math.toRadians(latDe));
		double x = Math.cos(Math.toRadians(distance/rayonT)) 
					- Math.sin(Math.toRadians(latDe))
					*Math.sin(Math.toRadians(latAr));
		double longAr = Math.toRadians(longDe) + 
						Math.atan2(Math.toRadians(y), Math.toRadians(x));
		return longAr;
	}

	
	/**
	 * 
	 * @param latx : latitude en coordonnée x,y du point d'arrivée du vecteur courant
	 * @param longy : longitude en coordonnée x,y du point d'arrivée du vecteur courant
	 * @param rayon : distance de la RS = vitesse du bateau (1h)
	 * @param coeffDir : coefficient directeur de la droite (AB)
	 * @param ordOrig : ordonnée à l'origine de la droite (AB)
	 * @return première solution x de l'intersection entre le cercle, de rayon égal à la distance RS, et la droite (AB)
	 */
	public static double pointIntersectionXUn(double latX, double longY, double rayon, double coeffDir, double ordOrig) {
		double x = 1;
		
		double a = 1 + coeffDir*coeffDir;
		double b = (-2.0)*latX + 2.0*coeffDir*ordOrig - 2.0*coeffDir*longY;
		double c = Math.pow(latX, 2) + Math.pow(longY, 2) + Math.pow(ordOrig, 2) - 2.0*ordOrig*longY - Math.pow(rayon, 2);
		
		double delta = Math.pow(b, 2) - 4.0*a*c;
		if(delta > 0) {
			 x = ((-b) + Math.sqrt(delta))/(2.0*a);
		}
		else {
			if(delta == 0) {
				 x = (-b)/(2.0*a);
			}
		}
		
		return x;
	}

	
	/**
	 * 
	 * @param latx : latitude en coordonnée x,y du point d'arrivée du vecteur courant
	 * @param longy : longitude en coordonnée x,y du point d'arrivée du vecteur courant
	 * @param rayon : distance de la RS = vitesse du bateau (1h)
	 * @param coeffDir : coefficient directeur de la droite (AB)
	 * @param ordOrig : ordonnée à l'origine de la droite (AB)
	 * @return deuxième solution x de l'intersection entre le cercle, de rayon égal à la distance RS, et la droite (AB)
	 */
	public static double pointIntersectionXDeux(double latX, double longY, double rayon, double coeffDir, double ordOrig) {
		double a = 1 + coeffDir*coeffDir;
		double b = (-2)*latX + 2*coeffDir*ordOrig - 2*coeffDir*longY;
		double c = Math.pow(latX, 2) + Math.pow(longY, 2) + Math.pow(ordOrig, 2) - 2*ordOrig*longY - Math.pow(rayon, 2);
		double x = 1;
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta > 0) {
			 x = ((-b) - Math.sqrt(delta))/(2*a);
		}
		else {
			if(delta == 0) {
				 x = (-b)/(2*a);
			}
		}
		
		return x;
	}
	
	
	/**
	 * 
	 * @param xUn : première solution x de l'intersection entre un cercle et une droite
	 * @param xDeux : deuxième solution x de l'intersection entre un cercle et une droite
	 * @param xA : coordonnée x du point de départ du bateau
	 * @param xB : coordonnée x du point d'arrivée du bateau
	 * @return la coordonnée x du point d'intersection entre un cercle et une droite
	 */
	public static double pointIntersectionX (double xUn, double xDeux, double xA, double xB) {
		double x = 0;
		if ((Math.abs(xB) - Math.abs(xUn)) <= (Math.abs(xB) - Math.abs(xDeux))) {
			x = xUn;
		}
		else {
			x = xDeux;
		}
		
		return x;
	}
	
	
	/**
	 * 
	 * @param coeffDir
	 * @param ordOrig
	 * @param x
	 * @return la coordonnée y du point d'intersection entre un cercle et une droite
	 */
	public static double pointIntersectionY (double coeffDir, double ordOrig, double x) {
		double y = coeffDir*x + ordOrig;
		return y;
	}
	
	
	/**
	 * 
	 * @param deg
	 * @param minute
	 * @param sec
	 * @param pntCard
	 * @return latitude en coordonnées géographiques du point en degrés décimaux
	 */
	public static double coordGeoDecLat (int deg, int minute, double sec, String pntCard) {
		double latX = 0;
		if(pntCard.equalsIgnoreCase("n")) {
			latX = deg + minute/60.0 + sec/3600.0;
		}
		else {
			if(pntCard.equalsIgnoreCase("s")) {
				latX = (deg + minute/60.0 + sec/3600.0)*(-1);
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
	 * @return longitude en coordonnées géographiques du point en degrés décimaux
	 */
	public static double coordGeoDecLong(int deg, int minute, double sec, String pntCard) {
		double longX = 0;
		if(pntCard.equalsIgnoreCase("e")) {
			longX = deg + minute/60.0 + sec/3600.0;
		}
		else {
			if(pntCard.equalsIgnoreCase("o")) {
				longX = (deg + minute/60.0 + sec/3600.0)*(-1);
			}
		}
		return longX;
	}
	
	
	/**
	 * 
	 * @param latXVectAr : latitude en coordonnées x,y du point d'arrivée du vecteur courant
	 * @param longYVectAr : longitude en coordonnées x,y du point d'arrivée du vecteur courant
	 * @param latXA : latitude en coordonnées x,y du point de départ du bateau
	 * @param longYA : longitude en coordonnées x,y du point de départ du bateau
	 * @param latXB : latitude en coordonnées x,y du point d'arrivée du bateau
	 * @param longYB : longitude en coordonnées x,y du point d'arrivée du bateau
	 * @param distanceRS : distance de la RS = vitesse du bateau (pour 1h)
	 * @return latitude en coordonnées x,y du point d'intersection entre la RS et la RF
	 */
	public static double latXInterRSetRF (double latXVectAr, double longYVectAr, double latXA, double longYA, double latXB, double longYB, double distanceRS) {
		double latX = pointIntersectionX(pointIntersectionXUn(latXVectAr, longYVectAr, distanceRS, (longYB - longYA) / (latXB - latXA), longYB - ((longYB - longYA) / (latXB - latXA)) * latXB ), pointIntersectionXDeux(latXVectAr, longYVectAr, distanceRS, (longYB - longYA) / (latXB - latXA), longYB - ((longYB - longYA) / (latXB - latXA)) * latXB ), latXA, latXB);
		return latX;
	}
	
	
	/**
	 * 
	 * @param latXVectAr : latitude en coordonnées x,y du point d'arrivée du vecteur courant
	 * @param longYVectAr : longitude en coordonnées x,y du point d'arrivée du vecteur courant
	 * @param latXA : latitude en coordonnées x,y du point de départ du bateau
	 * @param longYA : longitude en coordonnées x,y du point de départ du bateau
	 * @param latXB : latitude en coordonnées x,y du point d'arrivée du bateau
	 * @param longYB : longitude en coordonnées x,y du point d'arrivée du bateau
	 * @param distanceRS : distance de la RS = vitesse du bateau (pour 1h)
	 * @param latX : latitude en coordonnées x,y du point d'intersection entre la RS et la RF
	 * @return longitude en coordonnées x,y du point d'intersection entre la RS et la RF
	 */
	public static double longYInterRSetRF (double latXVectAr, double longYVectAr, double latXA, double longYA, double latXB, double longYB, double distanceRS, double latX) {
		double longY = pointIntersectionY( (longYB - longYA) / (latXB - latXA), longYB - ((longYB - longYA) / (latXB - latXA)) * latXB, latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS));
		return longY;
	}
	
	
	/**
	 * 
	 * @param latX : latitude, en coordonnées x,y, du point d'intersection entre la RS et la RF 
	 * @param longY : longitude, en coordonnées x,y, du point d'intersection entre la RS et la RF
	 * @return latitude, en coordonnées géographiques, du point d'intersection entre la RS et la RF
	 */
	public static double latInterRSetRF (double latX, double longY) {
		return Point.BreizhToGps(680, 1280, new Point(latX, longY)).abcisse;
	}
	
	
	/**
	 * 
	 * @param latX : latitude, en coordonnées x,y, du point d'intersection entre la RS et la RF 
	 * @param longY : longitude, en coordonnées x,y, du point d'intersection entre la RS et la RF
	 * @return longitude, en coordonnées géographiques, du point d'intersection entre la RS et la RF
	 */
	public static double longInterRSetRF (double latX, double longY) {
		return Point.BreizhToGps(680, 1280, new Point(latX, longY)).ordonnee;
	}
	
	
	/**
	@param latVectAr : latitude en coordonnées géographiques du point d'arrivée du vecteur courant
	 * @param longVectAr : longitude en coordonnées géographiques du point d'arrivée du vecteur courant
	 * @param latXVectAr : latitude en coordonnées x,y du point d'arrivée du vecteur courant
	 * @param longYVectAr : longitude en coordonnées x,y du point d'arrivée du vecteur courant
	 * @param latXA : latitude en coordonnées x,y du point de départ du bateau
	 * @param longYA : longitude en coordonnées x,y du point de départ du bateau
	 * @param latXB : latitude en coordonnées x,y du point d'arrivée du bateau
	 * @param longYB : longitude en coordonnées x,y du point d'arrivée du bateau
	 * @param distanceRS : distance de la RS = vitesse du bateau (1h)
	 * @return cap de RS, c'est à dire la direction du vecteur RS 
	 */
	public static double capRS (double latVectAr, double longVectAr, double latXVectAr, double longYVectAr, double latXA, double longYA, double latXB, double longYB, double distanceRS) {
		double cap = capDeg(latVectAr, longVectAr, latInterRSetRF(latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS), longYInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS, latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS))), longInterRSetRF(latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS), longYInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS, latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS))));
		return cap;
	
	}
	
	
	/**
	 * 
	 * @param tabVect : tableau de vecteurs courants
	 * @param latA : latitude en coordonnées géographiques du point de départ du bateau
	 * @param longA : longitude en coordonnées géographiques du point de départ du bateau
	 * @param latB : latitude en coordonnées géographiques du point d'arrivée du bateau
	 * @param longB : longitude en coordonnées géographiques du point d'arrivée du bateau
	 * @return le tableau de caps à prendre pour aller au point B en fonction des vecteurs courants
	 */
	public static double[] tabCapUnPointB (Vector[] tabVect, double latA, double longA, double latB, double longB ) {
		
		
		int nbCap = 0;
		for(int k = 0; k < tabVect.length; k++) {
			if(capDeg(tabVect[k].depart.abcisse, tabVect[k].depart.ordonnee, tabVect[k].arrivee.abcisse, tabVect[k].arrivee.ordonnee) != capDeg(tabVect[k+1].depart.abcisse, tabVect[k+1].depart.ordonnee, tabVect[k+1].arrivee.abcisse, tabVect[k+1].arrivee.ordonnee) || distanceDeAr(tabVect[k].depart.abcisse, tabVect[k].depart.ordonnee, tabVect[k].arrivee.abcisse, tabVect[k].arrivee.ordonnee) != distanceDeAr(tabVect[k+1].depart.abcisse, tabVect[k+1].depart.ordonnee, tabVect[k+1].arrivee.abcisse, tabVect[k+1].arrivee.ordonnee)) {
				nbCap = nbCap + 1;
			}
		}
		
		
		double tabCap [] = new double[nbCap];
		int i = 0;
		int cmpt = 0;
		for(int j = 0; j < tabCap.length; j++) {
			cmpt = i;
			i = i+1;
			while(capDeg(tabVect[i].depart.abcisse, tabVect[i].depart.ordonnee, tabVect[i].arrivee.abcisse, tabVect[i].arrivee.ordonnee) == capDeg(tabVect[i+1].depart.abcisse, tabVect[i+1].depart.ordonnee, tabVect[i+1].arrivee.abcisse, tabVect[i+1].arrivee.ordonnee) && distanceDeAr(tabVect[i].depart.abcisse, tabVect[i].depart.ordonnee, tabVect[i].arrivee.abcisse, tabVect[i].arrivee.ordonnee) == distanceDeAr(tabVect[i+1].depart.abcisse, tabVect[i+1].depart.ordonnee, tabVect[i+1].arrivee.abcisse, tabVect[i+1].arrivee.ordonnee)) {
				i++;
			}
		//	tabCap[j] = capRS (tabVect[cmpt].arrivee.abcisse, tabVect[cmpt].arrivee.ordonnee, Point.GpsToBreizh(45.0, 54.0, tabVect[cmpt].arrivee).abcisse, Point.GpsToBreizh(45.0, 54.0, tabVect[cmpt].arrivee).ordonnee, Point.GpsToBreizh(45.0, 54.0, new Point(latA,longA)).abcisse, Point.GpsToBreizh(45.0, 54.0, new Point(latA,longA)).ordonnee, Point.GpsToBreizh(45.0, 54.0, new Point(latB, longB)).abcisse, Point.GpsToBreizh(45.0, 54.0, new Point(latB, longB)).ordonnee, Dialog.info[2]);
		}
		
		return tabCap;
	
	}
	
	
	/**
	 * 
	 * @param latA : latitude en coordonnées gps du point de départ du bateau
	 * @param longA : longitude en coordonnées gps du point de départ du bateau
	 * @param quatrePorts : tableau de type Point des quatre ports les plus proches du point de départ du bateau
	 * @param tabVect : tabeau de type Vector des vecteurs courants sur la droite (AB)
	 * @return : le tableau de type double,double de la liste des caps pour les 4 ports les plus proches du point de départ du bateau
	 */
	public static double[][] tabCapQuatrePorts (double latA, double longA, Point[] quatrePorts, Vector[] tabVect){
		
		double tabCapQuatrePorts[][] = new double[tabCapUnPointB(tabVect, latA, longA, quatrePorts[0].abcisse, quatrePorts[0].ordonnee).length][4];
		for(int i = 0; i < tabCapQuatrePorts[0].length; i++) {
			for(int j = 0; j < tabCapQuatrePorts.length; j++) {
				tabCapQuatrePorts[j][i] = tabCapUnPointB(tabVect, latA, longA, quatrePorts[i].abcisse, quatrePorts[i].ordonnee)[j]; 
			}
		}
		return tabCapQuatrePorts;
	}
	
	
	/**
	 * 	
	 * @param latA : latitude en coordonnées géographiques du point de départ du bateau
	 * @param longA : longitude en coordonnées géographiques du point de départ du bateau
	 * @param ports : tableau des points en coordonnées géographiques de tous les ports de Bretagne
	 * @return : le tableau des quatre ports où leur distance, qui les séparent avec le point du départ du bateau, est la plus courte par rapport aux autres ports
	 */
	public static Point[] quatrePortsLesPlusProches (double latA, double longA, Point[]ports) {
			
			Point portsPlusProches[] = new Point[4];
			 for(int j = 1 ; j <= 4 ; j++) {
				 for (int i = 0; i < ports.length - j; i++) {
						if(distanceDeAr(latA,longA,ports[i].abcisse, ports[i].ordonnee) < distanceDeAr(latA,longA,ports[i+1].abcisse, ports[i+1].ordonnee)) {
							Point c = ports[i];
							ports[i] = ports[i+1];
							ports[i+1] = c;
						}
					}
					portsPlusProches[j-1] = ports[ports.length - j];
			 }
			return portsPlusProches;
	}
	

	/**
	 * 
	 * @param latA : latitude en coordonnées gps du point de départ du bateau
	 * @param longA : longitude en coordonnées gps du point de départ du bateau
	 * @param ports : tableau des ports de Bretagne
	 * 				Affiche le tableau des 4 ports les plus proches du point de départ du bateau
	 */
	public static void affichageQuatrePortsLesPlusProches (double latA, double longA, Point[]ports) {
		
		Point portsPlusProches[] = new Point[4];
		 for(int j = 1 ; j <= 4 ; j++) {
			 for (int i = 0; i < ports.length - j; i++) {
					if(distanceDeAr(latA,longA,ports[i].abcisse, ports[i].ordonnee) < distanceDeAr(latA,longA,ports[i+1].abcisse, ports[i+1].ordonnee)) {
						Point c = ports[i];
						ports[i] = ports[i+1];
						ports[i+1] = c;
					}
				}
				portsPlusProches[j-1] = ports[ports.length - j];
				System.out.print(portsPlusProches[j-1]+"\n");
		 }	
	}


	/**
	 * 
	 * @param latA : latitude en coordonnées gps du point de départ du bateau
	 * @param longA : longitude en coordonnées gps du point de départ du bateau
	 * @param latB : latitude en coordonnées gps du point d'arrivée du bateau
	 * @param longB : longitude en coordonnées gps du point d'arrivée du bateau
	 * @return : le coefficient directeur de la droite (AB)
	 */
	public static double coeffDir (double latA, double longA, double latB, double longB) {
		double latXA = Point.GpsToBreizh(680, 1280, new Point(latA, longA)).abcisse;
		double longYA = Point.GpsToBreizh(680, 1280, new Point(latA, longA)).ordonnee;
		double latXB = Point.GpsToBreizh(680, 1280, new Point(latB, longB)).abcisse;
		double longYB = Point.GpsToBreizh(680, 1280, new Point(latB, longB)).ordonnee;
		
		double coeff = (longYB - longYA)/(latXB - latXA);
		return coeff;
	}
	
	
	/**
	 * 
	 * @param latA : latitude en coordonnées gps du point de départ du bateau
	 * @param longA : longitude en coordonnées gps du point de départ du bateau
	 * @param latB : latitude en coordonnées gps du point d'arrivée du bateau
	 * @param longB : longitude en coordonnées gps du point d'arrivée du bateau
	 * @return : l'ordonnée à l'origine de la droite (AB)
	 */
	public static double ordOrig (double latA, double longA, double latB, double longB) {
		double latXA = Point.GpsToBreizh(680, 1280, new Point(latA, longA)).abcisse;
		double longYA = Point.GpsToBreizh(680, 1280, new Point(latA, longA)).ordonnee;
		
		double ordOrigine = longYA - coeffDir(latA, longA, latB, longB) * latXA; 
		return ordOrigine;
	}
	
	
	//Attention ALexandre : J'ai pris comme hauteur et largeur les dimensions correspondant à mon écran !
	// pour Alexandre
	/**
	 * 
	 * @param quatrePorts : quatre les ports plus de proches de A
	 * @param latA : latitude du point de départ du bateau en coordonnnées gps
	 * @param longA : longitude du point de départ du bateau en coordonnnées gps
	 * @return : un tableau de type double qui comporte, à chaque ligne,
	 * 			 une colonne correspondant au coeffcicient de la droite (AB),
	 * 			et une colonne correspondant à l'ordonnée à l'origine de la droite (AB)
	 */
	public static double[][] tabCoeffPlusOrdorig (Point[] quatrePorts, double latA, double longA) {
		double [][] coeffPlusOrdorig = new double[4][2];
		for(int i = 0; i < coeffPlusOrdorig.length; i++) {
			for(int j = 0; j < coeffPlusOrdorig[i].length; j++) {
				coeffPlusOrdorig[i][j] = coeffDir(latA, longA, quatrePorts[i].abcisse, quatrePorts[i].ordonnee);
				coeffPlusOrdorig[i][j+1] = ordOrig(latA, longA, quatrePorts[i].abcisse, quatrePorts[i].ordonnee);
			}
		}
		return coeffPlusOrdorig;
	}
	
	
	//pour Alexandre
	/**
	 * 
	 * @param quatrePorts : quatre les ports plus de proches de A
	 * @return : un tableau de type Point avec les points des ports en coordonnées Breizh (les points B)
	 */
	public static Point[] tabPointsB (Point [] quatrePorts) {
		Point [] pointsB = new Point[4];
		for(int i = 0; i < pointsB.length; i++) {
			pointsB[i] = Point.GpsToBreizh(680, 1280, new Point(quatrePorts[i].abcisse, quatrePorts[i].ordonnee));
		}
		return pointsB;
	}
	
}
	//Pour les points A, il faut demander à Pierre.
	
		