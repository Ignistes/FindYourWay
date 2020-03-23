package gui;

import traitement.Traitement;

public class DialogInfo {
	private String taille, vitesse, degreLo, minuteLo, secondeLo, copoLo, degreLa, minuteLa, secondeLa, copoLa;
	private String longitude, latitude;

	public static double[] info;

	public DialogInfo() {
	}

	public DialogInfo(String taille, String vitesse, String latitude, String longitude) {
		this.vitesse = vitesse;
		this.taille = taille;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public DialogInfo(String taille, String vitesse, String degreLa, String minuteLa, String secondeLa, String copoLa,
			String degreLo, String minuteLo, String secondeLo, String copoLo) {
		this.taille = taille;
		this.vitesse = vitesse;
		this.degreLo = degreLo;
		this.minuteLo = minuteLo;
		this.secondeLo = secondeLo;
		this.copoLo = copoLo;
		this.degreLa = degreLa;
		this.minuteLa = minuteLa;
		this.secondeLa = secondeLa;
		this.copoLa = copoLa;
		this.longitude = degreLo + "°" + minuteLo + "'" + secondeLo + "''" + copoLo;
		this.latitude = degreLa + "°" + minuteLa + "'" + secondeLa + "''" + copoLa;
	}

	/**
	 * Donne les informations rentrées par l'utilisateur sous forme de tableau
	 * 
	 * @return un tableau de taille 10 contenant les infos de l'utilisateur 
	 * 0 -> longitude degré°minute'seconde''pCardinal 
	 * 1 -> latitude degré°minute'seconde''pCardinal 
	 * 2 -> vitesse du bateau 
	 * 3 -> taille du bateau
	 */
	public double[] getInfos() {
		double [] infos = new double[4];
		if (FenetreBis.whatCo() == false) {
			try {
				double lat = Double.valueOf(latitude);
				double longi = Double.valueOf(longitude);
				double vite = Double.valueOf(vitesse);
				double tail = Double.valueOf(taille);
				
				infos[0] = longi;
				infos[1] = lat;
				infos[2] = vite;
				infos[3] = longi;
			} catch (Exception e){
				return null;
			}
		}else {
			try {
				int deglo = Integer.valueOf(degreLo);
				int minlo = Integer.valueOf(minuteLo);
				double seclo = Double.valueOf(secondeLo);
				infos[0] = Traitement.coordGeoDecLong(deglo, minlo, seclo, copoLo);
				
				int degla = Integer.valueOf(degreLa);
				int minla = Integer.valueOf(minuteLa);
				double secla = Double.valueOf(secondeLa);
				infos[1] = Traitement.coordGeoDecLat(degla, minla, secla, copoLa);
				
				double vit = Double.valueOf(vitesse);
				double tai = Double.valueOf(taille);
				infos[2] = vit;
				infos[3] = tai;
			} catch (Exception e){
				return null;
			}		
		}
		info = infos;
		return infos;
		
	}
	
	/**
	 * Dis si la latitude decimale que l'utilisateur a entre est bonne
	 * @param latitude la latitude decimale que l'utilisateur a rentre
	 * @return true si la latitude est dans le cadre de notre logiciel, false sinon
	 */
	public boolean latitudeDecOk(String latitude) {
		try {
			double lat = Double.valueOf(latitude);
			return (lat > 46.996142 && lat < 49.290168);
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Dis si la longitude decimale que l'utilisateur a entre est bonne
	 * @param longitude la longitude decimale que l'utilisateur a rentre
	 * @return true si la longitude est dans le cadre de notre logiciel, false sinon
	 */
	public boolean longitudeDecOk(String longitude) {
		try {
			double lo = Double.valueOf(longitude);
			return (lo > -5.72922 && lo < -1.565402);
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Dis si la longitude entrée par l'utilisateur est bonne
	 * 
	 * @param degre,
	 *            minute, seconde, copo les données entrées par l'utilisateur sous
	 *            forme de String
	 * @return true si l'utilisateur est dans le cadre de notre logiciel au niveau
	 *         de la longitude, false sinon
	 */
	public boolean latitudeOK(String degre, String minute, String seconde, String copo) {
		if (degre != null && minute != null && seconde != null && copo != null) {
			try {
				int deg = Integer.valueOf(degre);
				int min = Integer.valueOf(minute);
				double sec = Double.valueOf(seconde);
				String cp = copo.toString();
				return (Traitement.coordGeoDecLat(deg, min, sec, cp) > 46.996142
						&& Traitement.coordGeoDecLat(deg, min, sec, cp) < 49.290168);

			} catch (Exception e) {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Dis si la latitude entrée par l'utilisateur est bonne
	 * 
	 * @param degre,
	 *            minute, seconde, copo les données entrées par l'utilisateur sous
	 *            forme de String
	 * @return true si l'utilisateur est dans le cadre de notre logiciel au niveau
	 *         de la latitude, false sinon
	 */
	public boolean longitudeOK(String degre, String minute, String seconde, String copo) {
		if (degre != null && minute != null && seconde != null && copo != null) {
			try {
				int deg = Integer.valueOf(degre);
				int min = Integer.valueOf(minute);
				double sec = Double.valueOf(seconde);
				String cp = copo.toString();
				return (Traitement.coordGeoDecLong(deg, min, sec, cp) > -5.729228
						&& Traitement.coordGeoDecLong(deg, min, sec, cp) < -1.565402);
			} catch (Exception e) {
				System.out.println("catch");
				return false;
			}
		} else {
			System.out.println("false");
			return false;
		}
	}

	/**
	 * Dis si la longitude entrée par l'utilisateur est bonne
	 * 
	 * @param info
	 *            la taille du bateau entrée par l'utilisateur sous forme de String
	 * @return true si l'utilisateur a bien rentré un double, false sinon
	 */
	public boolean tailleOK(String info) {
		boolean ok = true;
		try {
			double t = Double.valueOf(info);
		} catch (Exception e) {
			ok = false;
		}
		return ok;
	}

	/**
	 * Dis si la longitude entrée par l'utilisateur est bonne
	 * 
	 * @param info
	 *            la vitesse du bateau entrée par l'utilisateur sous forme de String
	 * @return true si l'utilisateur a bien rentré un double, false sinon
	 */
	public boolean vitesseOK(String info) {
		boolean ok = true;
		try {
			double t = Double.valueOf(info);
		} catch (Exception e) {
			ok = false;
		}
		return ok;
	}

	/**
	 * Dis si la longitude entrée par l'utilisateur est bonne
	 * 
	 * @return true si l'utilisateur a bien rentré ses informations, false sinon
	 */
	public boolean infosOK() {
		if (FenetreBis.whatCo() == true) {
			return (longitudeOK(degreLo, minuteLo, secondeLo, copoLo) && latitudeOK(degreLa, minuteLa, secondeLa, copoLa)
					&& tailleOK(taille) && vitesseOK(vitesse));
		} else {
			return (longitudeDecOk(longitude) && latitudeDecOk(latitude) && tailleOK(taille) && vitesseOK(vitesse));
		}
		
	}

	public String toString() {
		String str;
		if (infosOK()) {
			str = "Description du bâteau" + "\n";
			str += "Longitude : " + longitude + "\n";
			str += "Latitude : " + latitude + "\n";
			str += "Taille : " + this.taille + " mètres" + "\n";
			str += "Vitesse : " + this.vitesse + " noeuds" + "\n";
		} else {
			str = "Nous ne pouvons pas traiter ces informations !" + "\n";
			str += "Veuillez regarder comment entrer ses informations dans la page d'accueil.";
		}
		return str;
	}
}
