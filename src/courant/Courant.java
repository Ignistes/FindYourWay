package courant;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import ucar.nc2.dataset.NetcdfDataset;
import utils.Vector;

public class Courant {

	public Vector[] Streams;
	
	public Courant() {
		double[] U;
		double[] V;
		double[] latU;
		double[] latV;
		double[] longU;
		double[] longV;
		txtU();
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
