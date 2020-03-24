package utils;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import utils.Point;
import java.util.ArrayList;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Breizh {
	
	private int[] pointsX;
	private int[] pointsY;
	
	/**
	 * @param hauteurFenetre La hauteur de la fenetre
	 * @param largeurFenetre La largeur de la fenetre
	 * Creer un objet Bretagne adapte a la taille de la fenetre
	 */
	public Breizh(double hauteurFenetre, double largeurFenetre) {
		//int[] pointsInterX = Xreturn(hauteurFenetre);
		//int[] pointsInterY = Yreturn(largeurFenetre);
		
		Path chemin = Paths.get("Points Bretagne.txt");
		ArrayList<Double> txt =  new ArrayList<Double>();
	    try (BufferedReader reader = Files.newBufferedReader(chemin)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		String Line = line.replace(',', ' ');
	    		String[] Sentence = Line.split(" ");
	    		//System.out.println(Sentence.length);
	    		for(String m:Sentence) {
	    			if(!m.equals("")) {
	    				txt.add(Double.valueOf(m));
	    				//System.out.println(m);
	    			}
	    		}
	    		
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    
	    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
	    
        ArrayList<Integer>pointsXInter = new ArrayList<Integer>();
        ArrayList<Integer>pointsYInter = new ArrayList<Integer>();
        
	    Double [] valFinal = txt.toArray(new Double[txt.size()]);
	    for(int i=0;i<txt.size()-1;i+=2) {
	    	Point p = new Point(valFinal[i+1],valFinal[i]);
	    	//System.out.println(p);
	    	p = Point.GpsToBreizh(h, l, p);
	    	//System.out.println(p);
	    	pointsXInter.add((int)p.abcisse);
	    	pointsYInter.add((int)p.ordonnee);
	    }
	    
	    pointsX = new int[pointsXInter.size()];
	    pointsY = new int[pointsYInter.size()];
	    
	    for(int i = 0;i<pointsXInter.size();i++) {
	    	pointsX[i] = pointsXInter.get(i);
	    	pointsY[i] = pointsYInter.get(i);
	    }
	    
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
	    	//res[i] = (int)-( ((Point)(Point.GpsToBreizh(hauteur,hauteur,new Point(pointsX[i],0)))).abcisse );
	    	res[i] = (int)((pointsX[i]-46.996142)*hauteur/2.294026);
	    	//
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
	    	//res[i] = (int)-( ((Point)(Point.GpsToBreizh(largeur,largeur,new Point(0,pointsY[i])))).abcisse );
	    	res[i] = (int)(((-1.0*pointsY[i])-1.505404)*largeur/4.163826);
	    }
	    return res;

	}
	
}
