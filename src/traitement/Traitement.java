package traitement;

import utils.Vector;

import utils.Point;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.util.ArrayList;

import courant.Courant;
import utils.Vector;
import gui.Dialog;
import gui.DialogInfo;

public class Traitement {
	
	
	// A faire demain : 
	// - demander à Pierre comment obtenir hauteur et largeur suivant les écrans


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		
		
		/*System.out.println(capDeg(47.4166667,-2.8333333333333335,47.4116651,-2.6207216)+" degrés");	//test de la fonction capDeg qui calcule le cap entre deux points	 
		System.out.println(distanceDeAr(47.4166667,-2.8333333333333335,47.4116651,-2.6207216)+" miles nautiques");	//test de la fonction distanceDeAr qui calcule la distance entre deux points	
		System.out.println(coordGeoDecLat(48, 6, 40.819, "N"));
		*/
		//System.out.println(capRS(47.39, (-2.85), Point.GpsToBreizh(680, 1280, new Point(47.39,(-2.85))).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.39,(-2.85))).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.83)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.41,-2.83)).ordonnee, Point.GpsToBreizh(680, 1280, new Point(47.40,-2.62)).abcisse, Point.GpsToBreizh(680, 1280, new Point(47.4,-2.62)).ordonnee, 6*7.33)) ;
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
		//affichageQuatrePortsLesPlusProches(47.495571, -3.505096, Point.getPort());
		//affQuatrePortsLesPlusProches();
		//dkfjjf();
		//affTab();
		//System.out.println(capDeg(48.294054, -5.623783,quatrePortsLesPlusProches()[3].abcisse, quatrePortsLesPlusProches()[3].ordonnee));
		
		
//		double latVectAr = 48.302156040696076;
//		double longVectAr = -5.625759107486851;
//		double latXVectAr = Point.GpsToBreizh(h,l, new Point(latVectAr, longVectAr)).abcisse;
//		double longYVectAr = Point.GpsToBreizh(h,l, new Point(latVectAr, longVectAr)).ordonnee;
//		double latXA = Point.GpsToBreizh(h,l, new Point(48.294054,-5.623783000000003)).abcisse;
//		double longYA = Point.GpsToBreizh(h,l, new Point(48.294054, -5.623783000000003)).ordonnee;
//		double latXB = Point.GpsToBreizh(h, l, quatrePortsLesPlusProches()[1]).abcisse;
//		double longYB = Point.GpsToBreizh(h, l, quatrePortsLesPlusProches()[1]).ordonnee;
//		double distanceRS = 6*7.33;
//		
//		
//		System.out.println(capDeg(latVectAr, longVectAr, latInterRSetRF(latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS), longYInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS, latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS))), longInterRSetRF(latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS), longYInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS, latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS)))));
        //tabCapQuatrePorts();
        //System.out.println(coordGeoLat(48,1,100));
        //System.out.println(coordGeoLong(-2, 47, 48, 100, 1));
	}

	public static void dkfjjf () {
		for(int i = 0; i < Point.getPort().length; i++) {
			System.out.print(Point.getPort()[i]+"\n");
		}
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
		double latAr = Math.toDegrees(Math.asin(Math.sin(Math.toRadians(latDe))
						*Math.cos(Math.toRadians(distance/rayonT))
						+ Math.cos(Math.toRadians(latDe))
						*Math.sin(Math.toRadians(distance/rayonT))
						*Math.cos(Math.toRadians(cap))));
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
		double longAr = Math.toDegrees(Math.toRadians(longDe) + 
						Math.atan2(Math.toRadians(y), Math.toRadians(x)));
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
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		
		return Point.BreizhToGps(h,l, new Point(latX, longY)).abcisse;
	}
	
	
	/**
	 * 
	 * @param latX : latitude, en coordonnées x,y, du point d'intersection entre la RS et la RF 
	 * @param longY : longitude, en coordonnées x,y, du point d'intersection entre la RS et la RF
	 * @return longitude, en coordonnées géographiques, du point d'intersection entre la RS et la RF
	 */
	public static double longInterRSetRF (double latX, double longY) {
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		
		return Point.BreizhToGps(h,l, new Point(latX, longY)).ordonnee;
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
	 * @return : le tableau de type double,double de la liste des caps pour les 4 ports les plus proches du point de départ du bateau
	 */
	public static double[][] tabCapQuatrePorts (){
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		
        double[] coeffD = coeffDir();
        double[] ordOr = ordOrig();
        Point[] quatreP = quatrePortsLesPlusProches();
		
		double tabCapQuatrePorts[][] = new double[500][4];
		for(int i = 0; i < tabCapQuatrePorts[0].length; i++) {
			Vector[] a = Courant.getCourant(coeffD[i], ordOr[i], new Point(48.294054, -5.623783), quatreP[i]);
			for(int j = 0; j < tabCapQuatrePorts.length; j++) {
				tabCapQuatrePorts[j][i] = capRS(a[j].arrivee.abcisse, a[j].arrivee.ordonnee, Point.GpsToBreizh(h, l, new Point (a[j].arrivee.abcisse, a[j].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(h, l, new Point (a[j].arrivee.abcisse, a[j].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(h, l, new Point(48.294054, -5.623783)).abcisse, Point.GpsToBreizh(h,l, new Point(48.294054, -5.623783)).ordonnee, Point.GpsToBreizh(h,l, quatreP[i]).abcisse, Point.GpsToBreizh(h,l, quatreP[i]).ordonnee, 6*7.33);
			}
		}
		return tabCapQuatrePorts;
	}
	
	/**
	 * 
	 * @param cap
	 * @return le tableau de tous les points intermediaires
	 */
	public static Point[][] pointInter(){
		
		double[][] caps = tabCapQuatrePorts();
		Point[] quatreP = quatrePortsLesPlusProches();
		Point[][] pointInter = new Point[500][4];
		
		for(int i = 0; i < 4; i++) {
			double distance = distanceDeAr(DialogInfo.info[1],DialogInfo.info[0],quatreP[i].abcisse,quatreP[i].ordonnee)/500;
			double latDe 	= DialogInfo.info[1];
			double longDe 	= DialogInfo.info[0];
			for(int j = 0; j < 500; j++) {
				double cap = caps[j][i];
				double latAr = coordGeoLat(latDe,distance,cap);
				pointInter[j][i] = new Point(latAr,coordGeoLong(longDe,latDe,latAr,distance,cap));
				latDe 	= pointInter[j][i].abcisse;
				longDe 	= pointInter[j][i].ordonnee;
			}
		}
		return pointInter;
	}
	
	public static Point PortLePlusRapide() {
		return null;
	}
	
	/**
	 * affiche le tableau de la liste des caps pour les 4 ports les plus proches
	 */
	public static void affTab() {
		double essai [][] = tabCapQuatrePorts();
		for(int i = 0; i < essai[0].length; i++) {
			for(int j = 0; j < essai.length; j++) {
				System.out.print(essai[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 
	 * @return : le tableau des caps pour le port le plus rapide à atteindre
	 */
	public static double[] tabCapLePortLePlusRapide() {
		
		if(portLePlusRapide() == quatrePortsLesPlusProches()[0]) {
			double[] tab = new double[tabCapQuatrePorts().length];
			for(int i = 0; i < tab.length; i++) {
				tab[i] = tabCapQuatrePorts()[i][0];
			}
			return tab;
			
		}
		else {
			if(portLePlusRapide() == quatrePortsLesPlusProches()[1]) {
				double[] tab = new double[tabCapQuatrePorts().length];
				for(int i = 0; i < tab.length; i++) {
					tab[i] = tabCapQuatrePorts()[i][1];
				}
				return tab;
			}
			else {
				if(portLePlusRapide() == quatrePortsLesPlusProches()[2]) {
					double[] tab = new double[tabCapQuatrePorts().length];
					for(int i = 0; i < tab.length; i++) {
						tab[i] = tabCapQuatrePorts()[i][2];
					}
					return tab;
				}
				else {
					if(portLePlusRapide() == quatrePortsLesPlusProches()[3]) {
						double[] tab = new double[tabCapQuatrePorts().length];
						for(int i = 0; i < tab.length; i++) {
							tab[i] = tabCapQuatrePorts()[i][3];
						}
						return tab;
					}
				}
			}
		}
		return null;
		
	}
	
	
	
	
	
	/**
	 * 
	 * @return : un tableau de type double qui retourne toutes les distances en miles nautiques entre les différents caps à prendre pour le port d'indice zéro
	 */
	public static double[] essaiZero () {
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		
		int nbCap = 0;
		Vector [] a = Courant.getCourant(coeffDir()[0], ordOrig()[0], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[0]);
		for(int k = 0; k < a.length; k++) {
			if(capDeg(a[k].depart.abcisse, a[k].depart.ordonnee, a[k].arrivee.abcisse, a[k].arrivee.ordonnee)
				!= capDeg(a[k+1].depart.abcisse, a[k+1].depart.ordonnee, a[k+1].arrivee.abcisse, a[k+1].arrivee.ordonnee)
				|| distanceDeAr(a[k].depart.abcisse, a[k].depart.ordonnee, a[k].arrivee.abcisse, a[k].arrivee.ordonnee)
				!= distanceDeAr(a[k+1].depart.abcisse, a[k+1].depart.ordonnee, a[k+1].arrivee.abcisse, a[k+1].arrivee.ordonnee)) {
				nbCap = nbCap + 1;
			}
		}
		double tabDistance [] = new double[nbCap];
		
		for (int i = 0; i < tabDistance.length; i++) {
			double interLatX = latXInterRSetRF ( Point.GpsToBreizh(680, 1280, new Point (a[i].arrivee.abcisse, a[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (a[i].arrivee.abcisse, a[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[0]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[0]).ordonnee, DialogInfo.info[2] * 7.33);
			double interLongY = longYInterRSetRF( Point.GpsToBreizh(680, 1280, new Point (a[i].arrivee.abcisse, a[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (a[i].arrivee.abcisse, a[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[0]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[0]).ordonnee, DialogInfo.info[2] * 7.33,
								interLatX);

			double interLat = latInterRSetRF(interLatX, interLongY);
			double interLong = longInterRSetRF(interLatX, interLongY);
			
			tabDistance[i] = distanceDeAr(DialogInfo.info[1], DialogInfo.info[0], interLat, interLong);
		}
		
		return tabDistance;
	}
	
	
	/**
	 * 
	 * @return : un tableau de type double qui retourne toutes les distances en miles nautiques entre les différents caps à prendre pour le port d'indice un
	 */
	public static double[] essaiUn () {
		int nbCap = 0;
		Vector [] a = Courant.getCourant(coeffDir()[1], ordOrig()[1], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[1]);
		for(int k = 0; k < a.length; k++) {
			if(capDeg(a[k].depart.abcisse, a[k].depart.ordonnee, a[k].arrivee.abcisse, a[k].arrivee.ordonnee)
				!= capDeg(a[k+1].depart.abcisse, a[k+1].depart.ordonnee, a[k+1].arrivee.abcisse, a[k+1].arrivee.ordonnee)
				|| distanceDeAr(a[k].depart.abcisse, a[k].depart.ordonnee, a[k].arrivee.abcisse, a[k].arrivee.ordonnee)
				!= distanceDeAr(a[k+1].depart.abcisse, a[k+1].depart.ordonnee, a[k+1].arrivee.abcisse, a[k+1].arrivee.ordonnee)) {
				nbCap = nbCap + 1;
			}
		}
		double tabDistance [] = new double[nbCap];
		
		for (int i = 0; i < tabDistance.length; i++) {
			double interLatX = latXInterRSetRF ( Point.GpsToBreizh(680, 1280, new Point (a[i].arrivee.abcisse, a[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (a[i].arrivee.abcisse, a[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[1]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[1]).ordonnee, DialogInfo.info[2] * 7.33);
			double interLongY = longYInterRSetRF( Point.GpsToBreizh(680, 1280, new Point (a[i].arrivee.abcisse, a[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (a[i].arrivee.abcisse, a[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[1]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[1]).ordonnee, DialogInfo.info[2] * 7.33,
								interLatX);

			double interLat = latInterRSetRF(interLatX, interLongY);
			double interLong = longInterRSetRF(interLatX, interLongY);
			
			tabDistance[i] = distanceDeAr(DialogInfo.info[1], DialogInfo.info[0], interLat, interLong);
		}
		
		return tabDistance;
	}
	
	
	/**
	 * 
	 * @return : un tableau de type double qui retourne toutes les distances en miles nautiques entre les différents caps à prendre pour le port d'indice deux
	 */
	public static double[] essaiDeux () {
		
		
		
		int nbCap = 0;
		Vector[]a = Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2]);
		for(int k = 0; k < a.length; k++) {
			if(capDeg(a[k].depart.abcisse, a[k].depart.ordonnee, a[k].arrivee.abcisse, a[k].arrivee.ordonnee)
				!= capDeg(a[k+1].depart.abcisse, a[k+1].depart.ordonnee, a[k+1].arrivee.abcisse, a[k+1].arrivee.ordonnee)
				|| distanceDeAr(a[k].depart.abcisse, a[k].depart.ordonnee, a[k].arrivee.abcisse, a[k].arrivee.ordonnee)
				!= distanceDeAr(a[k+1].depart.abcisse, a[k+1].depart.ordonnee, a[k+1].arrivee.abcisse, a[k+1].arrivee.ordonnee)) {
				nbCap = nbCap + 1;
			}
		}
		double tabDistance [] = new double[nbCap];
		
		for (int i = 0; i < tabDistance.length; i++) {
			double interLatX = latXInterRSetRF ( Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[2]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[2]).ordonnee, DialogInfo.info[2] * 7.33);
			double interLongY = longYInterRSetRF( Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[2]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[2]).ordonnee, DialogInfo.info[2] * 7.33,
								latXInterRSetRF ( Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[2], ordOrig()[2], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[2])[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[2]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[2]).ordonnee, DialogInfo.info[2] * 7.33));

			double interLat = latInterRSetRF(interLatX, interLongY);
			double interLong = longInterRSetRF(interLatX, interLongY);
			
			tabDistance[i] = distanceDeAr(DialogInfo.info[1], DialogInfo.info[0], interLat, interLong);
		}
		
		return tabDistance;
	}
	
	
	/**
	 * 
	 * @return : un tableau de type double qui retourne toutes les distances en miles nautiques entre les différents caps à prendre pour le port d'indice trois
	 */
	public static double[] essaiTrois () {
		int nbCap = 0;
		for(int k = 0; k < Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3]).length; k++) {
			if(capDeg(Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k].depart.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k].depart.ordonnee, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k].arrivee.ordonnee)
				!= capDeg(Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k+1].depart.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k+1].depart.ordonnee, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k+1].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k+1].arrivee.ordonnee)
				|| distanceDeAr(Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k].depart.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k].depart.ordonnee, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k].arrivee.ordonnee)
				!= distanceDeAr(Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k+1].depart.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k+1].depart.ordonnee, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k+1].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[k+1].arrivee.ordonnee)) {
				nbCap = nbCap + 1;
			}
		}
		double tabDistance [] = new double[nbCap];
		
		for (int i = 0; i < tabDistance.length; i++) {
			double interLatX = latXInterRSetRF ( Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[3]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[3]).ordonnee, DialogInfo.info[2] * 7.33);
			double interLongY = longYInterRSetRF( Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[3]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[3]).ordonnee, DialogInfo.info[2] * 7.33,
								latXInterRSetRF ( Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.ordonnee)).abcisse, Point.GpsToBreizh(680, 1280, new Point (Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.abcisse, Courant.getCourant(coeffDir()[3], ordOrig()[3], new Point(DialogInfo.info[1], DialogInfo.info[0]), quatrePortsLesPlusProches()[3])[i].arrivee.ordonnee)).ordonnee,  Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).abcisse, Point.GpsToBreizh(680, 1280, new Point(DialogInfo.info[1], DialogInfo.info[0])).ordonnee, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[3]).abcisse, Point.GpsToBreizh(680, 1280, quatrePortsLesPlusProches()[3]).ordonnee, DialogInfo.info[2] * 7.33));

			double interLat = latInterRSetRF(interLatX, interLongY);
			double interLong = longInterRSetRF(interLatX, interLongY);
			
			tabDistance[i] = distanceDeAr(DialogInfo.info[1], DialogInfo.info[0], interLat, interLong);
		}
		
		return tabDistance;
	}
	
	
	/**
	 * 
	 * @return : le portLePlusProche a atteindre
	 */
	public static Point portLePlusRapide() {
		double vZero = 0;
		double vUn = 0;
		double vDeux = 0;
		double vTrois = 0;
		for(int i = 0; i < essaiZero().length; i++) {
			vZero = vZero + essaiZero()[i];
		}
		double vZeroMoy = (vZero / essaiZero().length);
		
		
		for(int i = 0; i < essaiUn().length; i++) {
			vUn = vUn + essaiUn()[i];
		}
		double vUnMoy = (vUn / essaiUn().length);
		
		
		for(int i = 0; i < essaiDeux().length; i++) {
			vDeux = vDeux + essaiDeux()[i];
		}
		double vDeuxMoy = (vDeux / essaiDeux().length);
		
		
		for(int i = 0; i < essaiTrois().length; i++) {
			vTrois = vTrois + essaiTrois()[i];
		}
		double vTroisMoy = (vTrois / essaiTrois().length);
		
		
		
		Point portLePlusRapide = new Point(0,0);
		if( Math.max(Math.max(vZeroMoy, vUnMoy), Math.max(vDeuxMoy, vTroisMoy)) == vZeroMoy) {
			portLePlusRapide = quatrePortsLesPlusProches()[0];
		}
		else {
			if(Math.max(Math.max(vZeroMoy, vUnMoy), Math.max(vDeuxMoy, vTroisMoy)) == vUnMoy) {
				portLePlusRapide = quatrePortsLesPlusProches()[1];
			}
			else {
				if(Math.max(Math.max(vZeroMoy, vUnMoy), Math.max(vDeuxMoy, vTroisMoy)) == vDeuxMoy) {
					portLePlusRapide = quatrePortsLesPlusProches()[2];
				}
				else {
					if(Math.max(Math.max(vZeroMoy, vUnMoy), Math.max(vDeuxMoy, vTroisMoy)) == vTroisMoy) {
						portLePlusRapide = quatrePortsLesPlusProches()[3];
					}
				}
			}
		}
		return portLePlusRapide;
	}
	
	
	/**
	 * @return : le tableau des quatre ports où leur distance, qui les séparent avec le point du départ du bateau, est la plus courte par rapport aux autres ports
	 */
	public static Point[] quatrePortsLesPlusProches () {
			Point essai [] = Point.getPort();
			Point portsPlusProches[] = new Point[4];
			 for(int j = 1 ; j <= 4 ; j++) {
				 for (int i = 0; i < Point.getPort().length - j; i++) {
						if(distanceDeAr(48.294054, -5.623783,essai[i].abcisse, essai[i].ordonnee) < distanceDeAr(48.294054, -5.623783,essai[i+1].abcisse, essai[i+1].ordonnee)) {
							Point c = essai[i];
							essai[i] = essai[i+1];
							essai[i+1] = c;
						}
					}
					portsPlusProches[j-1] = essai[essai.length - j];
			 }
			return portsPlusProches;
	}
	
	public static void affQuatrePortsLesPlusProches() {
		for(int i = 0; i < quatrePortsLesPlusProches().length; i++) {
			System.out.println(quatrePortsLesPlusProches ()[i]+"\n");
		}
	}

	
	/**
	 * @return : le coefficient directeur de la droite (AB)
	 */
	public static double[] coeffDir () {
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		
		double latXA = Point.GpsToBreizh(h,l, new Point(48.294054, -5.623783)).abcisse;
		double longYA = Point.GpsToBreizh(h,l, new Point(48.294054, -5.623783)).ordonnee;
		double coeffDir [] = new double[4];
		for(int i = 0; i < coeffDir.length; i++) {
			double latXB = Point.GpsToBreizh(h,l, new Point(quatrePortsLesPlusProches()[i].abcisse, quatrePortsLesPlusProches()[i].ordonnee)).abcisse;
			double longYB = Point.GpsToBreizh(h,l, new Point(quatrePortsLesPlusProches()[i].abcisse, quatrePortsLesPlusProches()[i].ordonnee)).ordonnee;
			coeffDir[i] = (longYB - longYA)/(latXB - latXA);
		}
		return coeffDir;
	}
	
	
	/**
	 * @return : l'ordonnée à l'origine de la droite (AB)
	 */
	public static double[] ordOrig () {
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		
		double latXA = Point.GpsToBreizh(h,l, new Point(48.294054, -5.623783)).abcisse;
		double longYA = Point.GpsToBreizh(h,l, new Point(48.294054, -5.623783)).ordonnee;
		
		double ordOrig[] = new double[4];
		for(int i = 0; i < ordOrig.length; i++) {
			ordOrig[i] = longYA - coeffDir()[i] * latXA ;
		}
		 
		return ordOrig;
	}
	
	
	
	/**
	 * @return : un tableau de type Point avec les points des ports en coordonnées Breizh (les points B)
	 */
	public static Point[] tabPointsB () {
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		
		Point [] pointsB = new Point[4];
		for(int i = 0; i < pointsB.length; i++) {
			pointsB[i] = Point.GpsToBreizh(h,l, new Point(quatrePortsLesPlusProches()[i].abcisse, quatrePortsLesPlusProches()[i].ordonnee));
		}
		return pointsB;
	}
	
}
	
	
		