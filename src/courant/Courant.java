package courant;

import java.io.IOException;
import ucar.nc2.dataset.NetcdfDataset;

public class Courant {

	public static void main(String[] args) {
		  String filename = "http://thredds.ucar.edu/thredds/dodsC/model/NCEP/GFS/CONUS_80km/GFS_CONUS_80km_20061019_0000.grib1";
		  NetcdfDataset ncd = null;
		  try {
		    ncd = NetcdfDataset.openDataset(filename);
		  } catch (IOException ioe) {
			  
		  } finally { 
		    if (null != ncd) try {
		      ncd.close();
		    } catch (IOException ioe) {
		    	
		    }
		 }
	}
}
