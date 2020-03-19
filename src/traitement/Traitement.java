package traitement;

import utils.Vector;
import utils.Point;
import java.util.ArrayList;


public class Traitement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(capDeg(47.4166667,-2.8333333333333335,47.4116651,-2.6207216)+" degrés");	//test de la fonction capDeg qui calcule le cap entre deux points	 
		System.out.println(distanceDeAr(47.4166667,-2.8333333333333335,47.4116651,-2.6207216)+" miles nautiques");	//test de la fonction distanceDeAr qui calcule la distance entre deux points	
		System.out.println(coordGeoDecLat(48, 6, 40.819, "N"));
	}

	
	
	
	
	//calcule la distance en miles nautiques entre deux points (coordonnées géographiques)
	//entrée : latitudes et longitudes des deux points ( convertis en degrés décimaux par les fonction : coordGeoDecLat et coordGeoDecLong
	//sortie : distance en miles nautiques entre les deux points 
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
	
	
	
	
	//calcul le cap à prendre pour aller d'un point A à un point B
	//entrée : latitudes et longitudes des deux points ( convertis en degrés décimaux par les fonctions : coordGeoDecLat et coordGeoDecLong)
	//sortie : cap entre les deux points (direction du vecteur)
	public static double capDeg(double latDe, double longDe, double latAr, double longAr) {
		double x = Math.log(Math.tan(Math.toRadians(latAr)/2 + 3.14/4)/Math.tan(Math.toRadians(latDe)/2 + 3.14/4));
		double y = Math.abs(Math.toRadians(longDe) - (Math.toRadians(longAr)) );
		double cap = Math.toDegrees(Math.atan2(y, x));	//cap en degrés
		return cap;
	}
	
		
	//calcul de la latitude de la destination à partir d'un point A, d'une distance et d'une direction
	//entrée : latitude du point de départ du vecteur, distance = vitesse (norme du vecteur)*temps (temps = 1h) donc distance = vitesse (noeuds), et de la direction du vecteur (cap)
	//sortie : latitude du point d'arrivée du vecteur (en général du vecteur courant)
	public static double coordGeoLat(double latDe,double distance, double cap){
		int rayonT = 6371;	//rayon de la Terre en km
		double latAr = Math.asin(Math.sin(Math.toRadians(latDe))
						*Math.cos(Math.toRadians(distance/rayonT))
						+ Math.cos(Math.toRadians(latDe))
						*Math.sin(Math.toRadians(distance/rayonT))
						*Math.cos(Math.toRadians(cap))) ;
		return latAr;
	}
	
	
	//calcul de la longitude de la destination à partir d'un point A, d'une distance, d'une direction et de la latitude de B
	//entrée : longitude du point de départ du vecteur, latitude du point de départ du vecteur, latitude du point d'arrivée du vecteur (foncion : coordGeoLat), de la direction du vecteur (cap), et de la distance = vitesse (norme du vecteur)*temps (temps = 1h) donc distance = vitesse (noeuds)
	//sortie : longitude du point d'arrivée du vecteur (souvent vecteur courant)
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


	/*public static double capRouteS (double latDe, double longDe, double capCourant, double temps, double vitesseC, double vitesseB) {
		double latPntC = coordGeoLat(latDe, vitesseC*temps,capCourant);	//latitude du point à la fin du vecteur courant
		double longPntC = coordGeoLong(longDe, latDe, latPntC, capCourant, vitesseC*temps);	//longitude du point à la fin du vecteur courant
		double distanceVectRs = vitesseB;	//prendre une heure pour tous les vecteurs
	}
	*/
	

	//A voir si une classe vecteur est utile
	public class Vecteur{
		private double direction;
		private double sens;
		private double norme;
		private double latPtnDe;
		private double longPntDe;
		
		
		public Vecteur(double direction, double sens, double norme, double latPtnDe, double longPntDe) {
			this.direction = direction;
			this.sens = sens;
			this.norme = norme;
			this.latPtnDe = latPtnDe;
			this.longPntDe = longPntDe;
		}
		
		
	}
	
	// equation d'un cercle : (x-a)^2 + (y-b)^2 = r^2
	// equation d'une droite : y = a*x + b
	// intersection entre un cercle et une droite : (x-a)^2 + (y-b)^2 - r^2 = a*x + b - y 
	

	
	
	// première solution ou solution double de l'équation : ax^2 + bx + c 
	//entrée : latitude du centre du cercle de (rayon = distance Route Surface = vitesse du bateau (car temps =  1h)) , longitude du centre du cercle, rayon, coeff directeur et ordonnée à l'origine de la droite porté par le vecteur de la Route Vraie (Route de Fond), 
	//sortie : première solution de l'intersection entre le cercle et la droite
	public static double pointIntersectionXUn(double latX, double longY, double rayon, double coeffDir, double ordOrig) {
		double a = 1 + coeffDir;
		double b = (-2)*latX + 2*coeffDir*ordOrig - 2*coeffDir*longY;
		double c = Math.pow(latX, 2) + Math.pow(ordOrig, 2) - Math.pow(rayon, 2) + longY*(longY - 2*ordOrig);
		double x = 0;
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta > 0) {
			 x = (b + Math.sqrt(delta))/(2*a);
		}
		else {
			if(delta == 0) {
				 x = b/(2*a);
			}
		}
		
		return x;
		
	}
	
	//deuxième solution ou solution double de l'équation : ax^2 + bx + c
	//entrée : latitude du centre du cercle de (rayon = distance Route Surface = vitesse du bateau (car temps =  1h)) , longitude du centre du cercle, rayon, coeff directeur et ordonnée à l'origine de la droite porté par le vecteur de la Route Vraie (Route de Fond), 
	//sortie : deuxième solution de l'intersection entre le cercle et la droite
	public static double pointIntersectionXDeux(double latx, double longy, double rayon, double coeffDir, double ordOrig) {
		double a = 1 + coeffDir;
		double b = (-2)*latx + 2*coeffDir*ordOrig - 2*coeffDir*longy;
		double c = Math.pow(latx, 2) + Math.pow(ordOrig, 2) - Math.pow(rayon, 2) + longy*(longy - 2*ordOrig);
		double x = 0;
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta > 0) {
			 x = (b - Math.sqrt(delta))/(2*a);
		}
		else {
			if(delta == 0) {
				 x = b/(2*a);
			}
		}
		
		return x;
		
	}
	
	//coordonnée x du point d'intersection entre le cercle et la droite entre le point de départ et le point d'arrivée de celle-ci
	//entrée : deux points d'intersection entre le cercle et la droite, point de départ et point d'arrivée
	//sortie : la coordonée x du point le plus proche du point d'arrivée qui correspond au point qui va nous permettre de déterminer le cap de la route surface
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
	
	//coordonnée y du point d'intersection entre le cercle et la droite entre le point de départ et le point d'arrivée de celle-ci
	//entrée : coeff directeur et ordonnée à l'origine de la droite portée par le vecteur de la route vraie, la coordonée x du point le plus proche du point d'arrivée qui correspond au point qui va nous permettre de déterminer le cap de la route surface (résulatat de la fonction : pointIntersectionX)
	//sortie : la coordonnée y du point le plus proche du point d'arrivée qui correspond au point qui va nous permettre de déterminer le cap de la route surface
	public static double pointIntersectionY (double coeffDir, double ordOrig, double x) {
		double y = coeffDir*x + ordOrig;
		return y;
	}
	
	
	//latitude convertie en degrés décimaux
	//entrée : degré, minute, seconde
	//sortie : latitude en degrés décimaux
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
	
	//longitude convertie en degres décimaux
	//entrée : degré, minute, seconde
	//sortie : longitude en degrés décimaux
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
	
	
	
	
	
	public static double latXInterRSetRF (double latXVectAr, double longYVectAr, double latXA, double longYA, double latXB, double longYB, double distanceRS) {
		double latX = pointIntersectionX(pointIntersectionXUn(latXVectAr, longYVectAr, distanceRS, (longYB - longYA) / (latXB - latXA), longYB - ((longYB - longYA) / (latXB - latXA)) * latXB ), pointIntersectionXDeux(latXVectAr, longYVectAr, distanceRS, (longYB - longYA) / (latXB - latXA), longYB - ((longYB - longYA) / (latXB - latXA)) * latXB ), latXA, latXB);
		return latX;
	}
	
	public static double longYInterRSetRF (double latXVectAr, double longYVectAr, double latXA, double longYA, double latXB, double longYB, double distanceRS, double latX) {
		double longY = pointIntersectionY( (longYB - longYA) / (latXB - latXA), longYB - ((longYB - longYA) / (latXB - latXA)) * latXB, latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS));
		return longY;
	}
	
	
	// convertir latX et lat en degré
	public static double latInterRSetRF (double latX, double longY) {
		return Point.BreizhToGps(45.0, 54.0, new Point(latX, longY)).abcisse;
	}
	
	//convertir longY et long en degré
	public static double longInterRSetRF (double latX, double longY) {
		return Point.BreizhToGps(45.0, 54.0, new Point(latX, longY)).ordonnee;
	}
	
	public static double capRS (double latVectAr, double longVectAr, double latXVectAr, double longYVectAr, double latXA, double longYA, double latXB, double longYB, double distanceRS) {
		double cap = capDeg(latVectAr, longVectAr, latInterRSetRF(latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS), longYInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS, latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS))), longInterRSetRF(latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS), longYInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS, latXInterRSetRF(latXVectAr, longYVectAr, latXA, longYA, latXB, longYB, distanceRS))));
		return cap;
	}
	
	
	public static double lkjjd (Vector[] tabVect, double latA, double longA, double latB, double longB ) {
		
		
		
		int i = 0;
		while(capDeg(tabVect[i].depart.abcisse, tabVect[i].depart.ordonnee, tabVect[i].arrivee.abcisse, tabVect[i].arrivee.ordonnee) == capDeg(tabVect[i+1].depart.abcisse, tabVect[i+1].depart.ordonnee, tabVect[i+1].arrivee.abcisse, tabVect[i+1].arrivee.ordonnee) && distanceDeAr(tabVect[i].depart.abcisse, tabVect[i].depart.ordonnee, tabVect[i].arrivee.abcisse, tabVect[i].arrivee.ordonnee) == distanceDeAr(tabVect[i+1].depart.abcisse, tabVect[i+1].depart.ordonnee, tabVect[i+1].arrivee.abcisse, tabVect[i+1].arrivee.ordonnee)) {
			i++;
		}
		
		double capUn = capRS (tabVect[i].arrivee.abcisse, tabVect[i].arrivee.ordonnee, Point.GpsToBreizh(45.0, 54.0, tabVect[i].arrivee).abcisse, Point.GpsToBreizh(45.0, 54.0, tabVect[i].arrivee).ordonnee, Point.GpsToBreizh(45.0, 54.0, new Point(latA,longA)).abcisse, Point.GpsToBreizh(45.0, 54.0, new Point(latA,longA)).ordonnee, Point.GpsToBreizh(45.0, 54.0, new Point(latB, longB)).abcisse, Point.GpsToBreizh(45.0, 54.0, new Point(latB, longB)).ordonnee, 5.0 );
		return capUn;
	
	}
	

	
	
	
	// faire une boucle if qui vérifie si le bateau n'est pas dans le polygone
	//
}
	