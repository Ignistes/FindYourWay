package gui;

import java.nio.charset.Charset;

public class Gui {

	public static void main(String[] args) {
		
		FenetreBis logiciel = new FenetreBis(new Panneau(new String("  --  Bienvenue dans notre logiciel d'aide à la nagivation !".getBytes(),Charset.forName("UTF-8"))));
		
		
	}

}


