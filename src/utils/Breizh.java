package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import utils.Point;

public class Breizh {
	
	private int[] pointsX;
	private int[] pointsY;
	
	/**
	 * @param hauteurFenetre La hauteur de la fenetre
	 * @param largeurFenetre La largeur de la fenetre
	 * Créer un objet Bretagne adapte a la taille de la fenetre
	 */
	public Breizh(double hauteurFenetre, double largeurFenetre) {
		pointsX = Xreturn(largeurFenetre);
		pointsY = Yreturn(hauteurFenetre);
	}
	
	
	/*
	 * Pour avoir le tableaux des points X
	 */
	public int[] getPointsX() {
		return pointsX;
	}

	/*
	 * Pour avoir le tableaux des points Y
	 */
	public int[] getPointsY() {
		return pointsY;
	}
	
	
	
	//C EST PRIVE !!!
	
	private static int[] Xreturn(double hauteur) {
		double[] pointsX = new double[390];
		int[] res = new int[390];
	    int i = 0;
	    Path cheminX = Paths.get("pointX.txt");
	    try (BufferedReader reader = Files.newBufferedReader(cheminX)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		pointsX[i] = Double.valueOf(line);
	    		i++;
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    for(i=0;i<390;i++) {
	    	//res[i] = (int)(250 - 79.57747155 * Math.log(Math.tan(Math.PI/4+((pointsX[i]+180)/360)/2)));
	    	res[i] = (int)( ((Point)(Point.GpsToBreizh(hauteur,hauteur,new Point(pointsX[i],0)))).abcisse );
	    }
	    return res;
	}
	
	private static int[] Yreturn(double largeur) {
		double[] pointsY = new double[390];
		int[] res = new int[390];
	    int i = 0;
	    Path cheminY = Paths.get("pointY.txt");
	    try (BufferedReader reader = Files.newBufferedReader(cheminY)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		pointsY[i] = Double.valueOf(line);
	    		i++;
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    for(i=0;i<390;i++) {
	    	//res[i] = (int)(500 * ((pointsY[i]+180)/360));
	    	res[i] = (int)( ((Point)(Point.GpsToBreizh(largeur,largeur,new Point(0,pointsY[i])))).abcisse );
	    }
	    return res;

	}
	
}
