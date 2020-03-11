package gui;

public class DialogInfo {
	private String taille, longitude, latitude, poids;

	public DialogInfo() {
	}

	public DialogInfo(String taille, String poids, String longitude, String latitude) {
		this.taille = taille;
		this.poids = poids;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String[] getInfos() {
		String[] infos = new String[4];
		infos[0] = longitude;
		infos[1] = latitude;
		infos[2] = poids;
		infos[3] = taille;
		return infos;
	}
	
	

	public boolean latitudeOK(String info) {
		return false;
	}

	public boolean longitudeOK(String info) {
		return true;
	}

	public boolean tailleOK(String info) {
		return true;
	}

	public boolean poidsOK(String info) {
		return true;
	}

	public String toString() {
		String str;
		if (tailleOK(taille) && poidsOK(poids) && longitudeOK(longitude) && latitudeOK(latitude)) {
			str = "Description du bâteau" + "\n";
			str += "Longitude : " + this.longitude + "\n";
			str += "Latitude : " + this.latitude + "\n";
			str += "Taille : " + this.taille + "\n";
			str += "Poids : " + this.poids + "\n";
		} else {
			str = "Nous ne pouvons pas traiter ces informations !" + "\n";
			str += "Veuillez regarder comment entrer ses informations dans la page d'accueil.";
			
			
		}
		return str;
	}
}
