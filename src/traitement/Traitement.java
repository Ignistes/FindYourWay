
package traitement;

public class Traitement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(capDeg(47.4166667,-2.8333333333333335,47.4116651,-2.6207216)+" degr�s");	//test de la fonction capDeg qui calcule le cap entre deux points	 
		System.out.println(distanceDeAr(47.4166667,-2.8333333333333335,47.4116651,-2.6207216)+" miles nautiques");	//test de la fonction distanceDeAr qui calcule la distance entre deux points	
		System.out.println(coordGeoDecLat(48,6,40.819,"N"));
	}

	
	
	
	
	//calcule la distance en miles nautiques entre deux points (coordonn�es g�ographiques)
	//entr�e : latitudes et longitudes des deux points ( convertis en degr�s d�cimaux par les fonction : coordGeoDecLat et coordGeoDecLong
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
	
	
	
	
	//calcul le cap � prendre pour aller d'un point A � un point B
	//entr�e : latitudes et longitudes des deux points ( convertis en degr�s d�cimaux par les fonctions : coordGeoDecLat et coordGeoDecLong)
	//sortie : cap entre les deux points (direction du vecteur)
	public static double capDeg(double latDe, double longDe, double latAr, double longAr) {
		double x = Math.log(Math.tan(Math.toRadians(latAr)/2 + 3.14/4)/Math.tan(Math.toRadians(latDe)/2 + 3.14/4));
		double y = Math.abs(Math.toRadians(longDe) - (Math.toRadians(longAr)) );
		double cap = Math.toDegrees(Math.atan2(y, x));	//cap en degr�s
		return cap;
	}
	
		
	//calcul de la latitude de la destination � partir d'un point A, d'une distance et d'une direction
	//entr�e : latitude du point de d�part du vecteur, distance = vitesse (norme du vecteur)*temps (temps = 1h) donc distance = vitesse (noeuds), et de la direction du vecteur (cap)
	//sortie : latitude du point d'arriv�e du vecteur (en g�n�ral du vecteur courant)
	public static double coordGeoLat(double latDe,double distance, double cap){
		int rayonT = 6371;	//rayon de la Terre en km
		double latAr = Math.asin(Math.sin(Math.toRadians(latDe))
						*Math.cos(Math.toRadians(distance/rayonT))
						+ Math.cos(Math.toRadians(latDe))
						*Math.sin(Math.toRadians(distance/rayonT))
						*Math.cos(Math.toRadians(cap))) ;
		return latAr;
	}
	
	
	//calcul de la longitude de la destination � partir d'un point A, d'une distance, d'une direction et de la latitude de B
	//entr�e : longitude du point de d�part du vecteur, latitude du point de d�part du vecteur, latitude du point d'arriv�e du vecteur (foncion : coordGeoLat), de la direction du vecteur (cap), et de la distance = vitesse (norme du vecteur)*temps (temps = 1h) donc distance = vitesse (noeuds)
	//sortie : longitude du point d'arriv�e du vecteur (souvent vecteur courant)
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
		double latPntC = coordGeoLat(latDe, vitesseC*temps,capCourant);	//latitude du point � la fin du vecteur courant
		double longPntC = coordGeoLong(longDe, latDe, latPntC, capCourant, vitesseC*temps);	//longitude du point � la fin du vecteur courant
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
	

	
	
	// premi�re solution ou solution double de l'�quation : ax^2 + bx + c 
	//entr�e : latitude du centre du cercle de (rayon = distance Route Surface = vitesse du bateau (car temps =  1h)) , longitude du centre du cercle, rayon, coeff directeur et ordonn�e � l'origine de la droite port� par le vecteur de la Route Vraie (Route de Fond), 
	//sortie : premi�re solution de l'intersection entre le cercle et la droite
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
	
	//deuxi�me solution ou solution double de l'�quation : ax^2 + bx + c
	//entr�e : latitude du centre du cercle de (rayon = distance Route Surface = vitesse du bateau (car temps =  1h)) , longitude du centre du cercle, rayon, coeff directeur et ordonn�e � l'origine de la droite port� par le vecteur de la Route Vraie (Route de Fond), 
	//sortie : deuxi�me solution de l'intersection entre le cercle et la droite
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
	
	//coordonn�e x du point d'intersection entre le cercle et la droite entre le point de d�part et le point d'arriv�e de celle-ci
	//entr�e : deux points d'intersection entre le cercle et la droite, point de d�part et point d'arriv�e
	//sortie : la coordon�e x du point le plus proche du point d'arriv�e qui correspond au point qui va nous permettre de d�terminer le cap de la route surface
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
	
	//coordonn�e y du point d'intersection entre le cercle et la droite entre le point de d�part et le point d'arriv�e de celle-ci
	//entr�e : coeff directeur et ordonn�e � l'origine de la droite port�e par le vecteur de la route vraie, la coordon�e x du point le plus proche du point d'arriv�e qui correspond au point qui va nous permettre de d�terminer le cap de la route surface (r�sulatat de la fonction : pointIntersectionX)
	//sortie : la coordonn�e y du point le plus proche du point d'arriv�e qui correspond au point qui va nous permettre de d�terminer le cap de la route surface
	public static double pointIntersectionY (double coeffDir, double ordOrig, double x) {
		double y = coeffDir*x + ordOrig;
		return y;
	}
	
	
	//latitude convertie en degr�s d�cimaux
	//entr�e : degr�, minute, seconde
	//sortie : latitude en degr�s d�cimaux
	public static double coordGeoDecLat (int deg, int minute, double sec, String pntCard) {
		double latX = 0;
		if(pntCard == "N" || pntCard == "n") {
			latX = deg + minute/60 + sec/3600;
		}
		else {
			if(pntCard == "S" || pntCard == "s") {
				latX = (deg + minute/60 + sec/3600)*(-1);
			}
		}
		return latX;
	
	}
	
	//longitude convertie en degr�s d�cimaux
	//entr�e : degr�, minute, seconde
	//sortie : latitude en degr�s d�cimaux
	public static double coordGeoDecLong(int deg, int minute, double sec, String pntCard) {
		double longX = 0;
		if(pntCard == "E" || pntCard == "e") {
			longX = deg + minute/60 + sec/3600;
		}
		else {
			if(pntCard == "O" || pntCard == "o") {
				longX = (deg + minute/60 + sec/3600)*(-1);
			}
		}
		return longX;
	}
	
	
	
	
	// faire une boucle if qui v�rifie si le bateau n'est pas dans le polygone
	//
}

	