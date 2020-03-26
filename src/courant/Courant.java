package courant;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import traitement.Traitement;
import utils.Point;

import ucar.nc2.dataset.NetcdfDataset;
import utils.Vector;

public class Courant {

	public static Vector[] Streams;
	
	public Courant() {
		double[] U 		= getValeur("Courant/CourantBon/UModif.txt");
		double[] V		= getValeur("Courant/CourantBon/VModif.txt");
		double[] latU	= getValeur("Courant/CourantBon/LatitudeUModif.txt");
		double[] latV	= getValeur("Courant/CourantBon/LatitudeVModif.txt");
		double[] longU	= getValeur("Courant/CourantBon/LongitudeUModif.txt");
		double[] longV	= getValeur("Courant/CourantBon/LongitudeVModif.txt");
		
		U 		= getVraiValeurs(U,		0,	6.103702/10000.0);
		V 		= getVraiValeurs(V,		0,	6.103702/10000.0);
		latU 	= getVraiValeurs(latU,	47.64443275805699,		1.3616265923437214/10000.0);
		latV 	= getVraiValeurs(latV,	47.64443275805699,		1.3616265923437214/10000.0);
		longU 	= getVraiValeurs(longU,	-0.7732916764040176,	1.5418768116020722/10000.0);
		longV 	= getVraiValeurs(longV,	-0.7732916764040176,	1.5418768116020722/10000.0);
		
		Vector[] streams = new Vector[U.length];
		for(int i = 0;i<streams.length;i++) {
			Point depart = new Point((latU[i]+latV[i])/2,(longU[i]+longV[i])/2);
			streams[i] = new Vector(depart,Vector.getArriveeGps(depart, V[i], U[i]),Vector.getVitesse(V[i], U[i]));
			streams[i].setF(V[i], U[i]);
		}
		/*
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("Courant/courantFinal.txt", "UTF-8");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}*/
		ArrayList<Vector> inter = new ArrayList<Vector>();
		
		for(int i = 0;i<streams.length;i++) {
			//writer.println(s);
			if(streams[i].depart.abcisse>46.996142 && streams[i].depart.abcisse<49.290168 && streams[i].depart.ordonnee<-1.505404 && streams[i].depart.ordonnee>-5.66923) {
				//System.out.println("Passé");
				inter.add(streams[i]);
			}
		}
		
		
		
		
		Streams = inter.toArray(new Vector[inter.size()]);

		//System.out.println(Streams[0]);
		//System.out.println(Streams[1]);
		//System.out.println(Traitement.distanceDeAr(Streams[0].depart.abcisse, Streams[0].depart.ordonnee, Streams[1].depart.abcisse, Streams[1].depart.ordonnee));
		//System.out.println(Streams.length);
		
		 /*
		int i = 0;
		for(Vector s:streams) {
			if(s.vitesse!=0) {
				System.out.println(s);
				System.out.println(i);
				break;
			}
			i++;
		}		*/
		
		/*
		System.out.println(U[100000]);
		//System.out.println(U[U.length-1]);
		
		System.out.println(V[100000]);
		//System.out.println(V[V.length-1]);
		
		System.out.println(latU[100000]);
		//System.out.println(longU[longU.length-1]);
		
		System.out.println(latV[100000]);
		//System.out.println(longV[longV.length-1]);
		 */
		
		System.out.println("Courant Chargé");
		//transforme("Courant/LatitudeU.txt","Courant/CourantBon/LatitudeUModif.txt");
		//transforme("Courant/LatitudeV.txt","Courant/CourantBon/LatitudeVModif.txt");
		//transforme("Courant/LongitudeU.txt","Courant/CourantBon/LongitudeUModif.txt");
		//transforme("Courant/LongitudeV.txt","Courant/CourantBon/LongitudeVModif.txt");
	}
	
	public static Vector[] getCourant(double a,double b,Point depart,Point arrivee) {
		
		Vector[] carre = petitCourant(depart,arrivee);
		System.out.println(carre.length);
		double distance = Math.sqrt(depart.abcisse*depart.abcisse + arrivee.ordonnee*arrivee.ordonnee);
		double intervalle = distance / 500.0;
		ArrayList<Vector> res = new ArrayList<Vector>();
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // get maximum window bounds
        Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

        int h = (int) maximumWindowBounds.getHeight();
        int l = (int) maximumWindowBounds.getWidth();
		
        
        
		for(int i = 0;i<=500;i++) {
			if(i%100==0) {
				System.out.println("getCourant i : " + i);
			}
			double ih = intervalle*i;
			double X = depart.abcisse + ih;
			double Y = a*X + b;
			Point p = new Point(X,Y);
			Point pGPS = Point.BreizhToGps(h, l, p);
			Vector inter = carre[0];
			int j =0;
			//double distancePI = Traitement.distanceDeAr(inter.depart.abcisse, inter.depart.ordonnee, pGPS.abcisse, pGPS.ordonnee);
			Point interdepart = Point.GpsToBreizh(h, l, inter.depart);
			double distancePI = Math.sqrt(((interdepart.abcisse-p.abcisse)*(interdepart.abcisse-p.abcisse)) + ((interdepart.ordonnee-p.ordonnee)*(interdepart.ordonnee-p.ordonnee)));
			for(Vector s:carre) {
				Point interS = Point.GpsToBreizh(h, l, s.depart);
				double distancePS = Math.sqrt(((interS.abcisse-p.abcisse)*(interS.abcisse-p.abcisse)) + ((interS.ordonnee-p.ordonnee)*(interS.ordonnee-p.ordonnee)));
				if(distancePS<distancePI) {
					inter = s;
					interdepart = Point.GpsToBreizh(h, l, inter.depart);
					distancePI = Math.sqrt(((interdepart.abcisse-p.abcisse)*(interdepart.abcisse-p.abcisse)) + ((interdepart.ordonnee-p.ordonnee)*(interdepart.ordonnee-p.ordonnee)));
				}
				//if(j==100000)
				//System.out.println("for : " + j);
				j++;
			}
			Vector Vfinal = new Vector(pGPS,Vector.getArriveeGps(pGPS, inter.getfVert(), inter.getfHori()),inter.vitesse);
			Vfinal.setF(inter.getfVert(), inter.getfHori());
			res.add(Vfinal);
		}
		return res.toArray(new Vector[res.size()]);
	}
	
	private static double[] getVraiValeurs(double[] tab,double offSet,double factor) {
		for(int i = 0;i<tab.length;i++) {
			if(tab[i] != -32768)
			tab[i] = tab[i]*factor + offSet;
			else tab[i] = 0;
		}
		return tab;
	}
	
	private static Vector[] petitCourant(Point depart, Point arrivee) {
		ArrayList<Vector> inter = new ArrayList<Vector>();
		if(Streams==null)new Courant();
		for(Vector s:Streams) {
			double LatS = s.depart.abcisse;
			double LongS = s.depart.ordonnee;
			
			double LatD = depart.abcisse;
			double LongD = depart.ordonnee;
			
			double LatA = arrivee.abcisse;
			double LongA = arrivee.ordonnee;
			if(Math.min(LatD, LatA)<=LatS && LatS<=Math.max(LatD, LatA)  && Math.min(LongD, LongA)<=LongS && LongS<=Math.max(LongD, LongA)) {
				inter.add(s);
			}
		}
		return inter.toArray(new Vector[inter.size()]);
	}
	
	private static double[] getValeur(String chemin) {
		//System.out.println(chemin);
		ArrayList<Double> res = new ArrayList<Double>();
		Path cheminX = Paths.get(chemin);
		try (BufferedReader reader = Files.newBufferedReader(cheminX)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		//res.add(Double.valueOf(line));
	    		try{
	    			res.add(Double.valueOf(line));
	    		}catch(java.lang.NumberFormatException e) {
	    			//System.out.println(line);
	    		}
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
		double[] resFinal = new double[res.size()];
		for(int i = 0;i<res.size();i++) {
			resFinal[i] = res.get(i);
		}
		return resFinal;
	}
	
	/*
  :short V(time=1, nj_v=1386, ni_v=1087);
  :long_name = "barotropic meridional velocity";
  :standard_name = "barotropic_sea_water_y_velocity_at_v_location";
  :units = "m s-1";
  :coordinates = "latitude_v longitude_v";
  :scale_factor = 6.103702E-4f; // float
  :add_offset = 0.0f; // float
  :valid_min = -32767S; // short
  :valid_max = 32767S; // short
  :_FillValue = -32768S; // short
  :_ChunkSizes = 1U, 1386U, 1087U; // uint
	 */
	private static void txtV() {
		
		Path cheminX = Paths.get("Courant/V.txt");
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("Courant/CourantBon/Vmodif.txt", "UTF-8");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		try (BufferedReader reader = Files.newBufferedReader(cheminX)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
		    	line = enleveTruc(line);
		    	String[] lineCut = line.split(" ");
		    	String newLine = bonnePhrase(lineCut);
		    	writer.println(newLine);
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
		writer.close();
		
	}
		/*
		 * short latitude_u(nj_u=1386, ni_u=1087);
  :long_name = "latitude at u location";
  :standard_name = "latitude_at_u_location";
  :units = "degrees_north";
  :scale_factor = 1.3616265923437214E-4; // double
  :add_offset = 47.64443275805699; // double
  :valid_min = -32767S; // short
  :valid_max = 32767S; // short
  :_FillValue = -32768S; // short
  :_ChunkSizes = 1386U, 1087U; // uint

latitude_u = 
		 * 
		 * short latitude_v(nj_v=1386, ni_v=1087);
  :long_name = "latitude at v location";
  :standard_name = "latitude_at_v_location";
  :units = "degrees_north";
  :scale_factor = 1.3616265923437214E-4; // double
  :add_offset = 47.64443275805699; // double
  :valid_min = -32767S; // short
  :valid_max = 32767S; // short
  :_FillValue = -32768S; // short
  :_ChunkSizes = 1386U, 1087U; // uint


latitude_v = 
		 * 
		 * short longitude_u(nj_u=1386, ni_u=1087);
  :long_name = "longitude at u location";
  :standard_name = "longitude_at_u_location";
  :units = "degrees_east";
  :scale_factor = 1.5418768116020722E-4; // double
  :add_offset = -0.7732916764040176; // double
  :valid_min = -32767S; // short
  :valid_max = 32767S; // short
  :_FillValue = -32768S; // short
  :_ChunkSizes = 1386U, 1087U; // uint


longitude_u = 
  
		 * 
		 * short longitude_v(nj_v=1386, ni_v=1087);
  :long_name = "longitude at v location";
  :standard_name = "longitude_at_v_location";
  :units = "degrees_east";
  :scale_factor = 1.5418768116020722E-4; // double
  :add_offset = -0.7732916764040176; // double
  :valid_min = -32767S; // short
  :valid_max = 32767S; // short
  :_FillValue = -32768S; // short
  :_ChunkSizes = 1386U, 1087U; // uint


longitude_v = 

		 * 
		 * 
		 * */
private static void transforme(String cheminTxt,String chemin2Txt) {
		
		Path cheminX = Paths.get(cheminTxt);
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(chemin2Txt, "UTF-8");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		try (BufferedReader reader = Files.newBufferedReader(cheminX)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
		    	line = enleveTruc(line);
		    	String[] lineCut = line.split(" ");
		    	String newLine = bonnePhrase(lineCut);
		    	writer.println(newLine);
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
		writer.close();
		
	}
	
	private static String bonnePhrase(String[] lineCut) {
		String res = "";
		for(String mot:lineCut) {
			if(!mot.equals("")) {
				res = res + mot + "\n";
			}
		}
		return res;
	}
	
	private static String enleveTruc(String line) {
		line = line.replace('{', ' ');
		line = line.replace('}', ' ');
		line = line.replace(',', ' ');
		return line;
	}
	
	/*
  :short U(time=1, nj_u=1386, ni_u=1087);
  :long_name = "barotropic zonal velocity";
  :standard_name = "barotropic_sea_water_x_velocity_at_u_location";
  :units = "m s-1";
  :coordinates = "latitude_u longitude_u";
  :scale_factor = 6.103702E-4f; // float
  :add_offset = 0.0f; // float
  :valid_min = -32767S; // short
  :valid_max = 32767S; // short
  :_FillValue = -32768S; // short
  :_ChunkSizes = 1U, 1386U, 1087U; // uint
*/
	private static void txtU() {
	  /*  PrintWriter writer = null;
		try {
			writer = new PrintWriter("Courant/Umodif.txt", "UTF-8");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	    Path cheminX = Paths.get("Courant/U.txt");
	    
	    ArrayList<String[]> txtU = new ArrayList<String[]>();
	    
	    try (BufferedReader reader = Files.newBufferedReader(cheminX)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
		    	//System.out.println(i);
	    		String[] lineCut = line.split(" ");
		    	txtU.add(lineCut);
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    
	    for(String[] line : txtU) {
    	   for(String mot : line) {
    		   writer.println(mot);
    	   }
	    }
	    
	    writer.close();
	    //System.out.println(txtU);
	    */
Path cheminX = Paths.get("Courant/CourantBon/UModif.txt");
	    
	    ArrayList<Double> txtU = new ArrayList<Double>();
	    
	    try (BufferedReader reader = Files.newBufferedReader(cheminX)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
		    	//System.out.println(i);
	    		if(!line.equals(""))
		    	txtU.add(Double.valueOf(line));
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    
	    System.out.println(txtU.size());
	    
	}
	
		 
}
class MyComp implements Comparator<Vector>{
	 
    @Override
    public int compare(Vector v1, Vector v2) {
    	double res = Math.random();
    	if(res<=0.5)return 1;
        if(res>0.5) return -1;
        return 0;
    }
     
}
