package gui;

import traitement.Traitement;

public class DialogInfo {
	private String taille, vitesse, degreLo, minuteLo, secondeLo, copoLo, degreLa, minuteLa, secondeLa, copoLa;
	private String longitude, latitude;

	public DialogInfo() {
	}

	public DialogInfo(String taille, String vitesse, String degreLa, String minuteLa, String secondeLa, String copoLa,
			String degreLo, String minuteLo, String secondeLo, String copoLo) {
		this.taille = taille;
		this.vitesse = vitesse;
		this.longitude = degreLo + "°" + minuteLo + "'" + secondeLo + "''" + copoLo;
		this.latitude = degreLa + "°" + minuteLa + "'" + secondeLa + "''" + copoLa;
	}

	/**
	 * Donne les informations rentrées par l'utilisateur sous forme de tableau
	 * 
	 * @return un tableau de taille 10 contenant les infos de l'utilisateur 
	 * de 0 à 3 -> longitude degré°minute'seconde''pCardinal 
	 * de 4 à 7 -> latitude degré°minute'seconde''pCardinal 
	 * 8 -> taille du bateau 
	 * 9 -> vitesse
	 */
	public String[] getInfos() {
		String[] infos = new String[10];
		infos[0] = degreLo;
		infos[1] = minuteLo;
		infos[2] = secondeLo;
		infos[3] = copoLo;
		infos[4] = degreLa;
		infos[5] = minuteLa;
		infos[6] = secondeLa;
		infos[7] = copoLa;
		infos[8] = taille;
		infos[9] = vitesse;
		return infos;
	}

	/**
	 * Dis si la longitude entrée par l'utilisateur est bonne
	 * 
	 * @param degre, minute, seconde, copo les données entrées par l'utilisateur sous forme de String
	 * @return true si l'utilisateur est dans le cadre de notre logiciel au niveau de la longitude, false sinon
	 */
	public boolean latitudeOK(String degre, String minute, String seconde, String copo) {
		if (degre != null && minute != null && seconde != null
				&& (copo == "N" || copo == "n" || copo == "S" || copo == "s")) {
			try {
				int deg = Integer.valueOf(degre);
				int min = Integer.valueOf(minute);
				double sec = Double.valueOf(seconde);
				System.out.println("lat :" + Traitement.coordGeoDecLat(deg, min, sec, copo) );
				return (Traitement.coordGeoDecLat(deg, min, sec, copo) > 46.996142
						&& Traitement.coordGeoDecLat(deg, min, sec, copo) < 49.290168);
				
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
	 * @param degre, minute, seconde, copo les données entrées par l'utilisateur sous forme de String
	 * @return true si l'utilisateur est dans le cadre de notre logiciel au niveau de la latitude, false sinon
	 */
	public boolean longitudeOK(String degre, String minute, String seconde, String copo) {
		if (degre != null && minute != null && seconde != null && copo != null) {
			System.out.println("if");
			try {
				System.out.println("try");
				int deg = Integer.valueOf(degre);
				int min = Integer.valueOf(minute);
				double sec = Double.valueOf(seconde);
				System.out.println("lat :" + Traitement.coordGeoDecLong(deg, min, sec, copo) );
				return (Traitement.coordGeoDecLong(deg, min, sec, copo) > -5.729228
						&& Traitement.coordGeoDecLong(deg, min, sec, copo) < -1.565402);
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
	 * @param info la taille du bateau entrée par l'utilisateur sous forme de String
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
	 * @param info la vitesse du bateau entrée par l'utilisateur sous forme de String
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
		return (latitudeOK(degreLa, minuteLa, secondeLa, copoLa) && longitudeOK(degreLo, minuteLo, secondeLo, copoLo)
				&& tailleOK(taille) && vitesseOK(vitesse));
	}

	public String toString() {
		String str;
		for (int i = 0 ; i<getInfos().length; i++) {
			System.out.println(getInfos()[i]);
		}
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
