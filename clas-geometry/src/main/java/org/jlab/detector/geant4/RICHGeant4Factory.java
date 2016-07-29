/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jlab.detector.geant4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jlab.geom.base.ConstantProvider;
import org.jlab.geom.geant.Geant4Basic;
/**
 *
 * @author gangel
 */
public class RICHGeant4Factory
{
	
	  private final static Geant4Basic motherVolume = new Geant4Basic("fc", "Box", 0);

	    private final HashMap<String, String> properties = new HashMap<>();
	    

  

    // The empty constructor
    public RICHGeant4Factory() {
    	  for (int sector = 1; sector <= 1; sector++) {
              
          // sector is not used up to now
    	System.out.println("Test groovy");
                Geant4Basic layerVolume = Box (sector);
                layerVolume.setMother(motherVolume );
            
    	  }
    }


	 public Geant4Basic Box(int sector) {
	        //Geant4Basic  mother = new Geant4Basic();
		 //Layer is a variable create as test to mimic FTOF code
		 int layer=1;
		 List<Geant4Basic> paddles = this.createLayer(layer);
		// define the parameter of the Trapezoid on the Geant4 guide
	        double[] params = new double[5];
	        params[0] = 30;
	        params[1] = 10;
	        params[2] = 10;
	        params[3] = 15;
	        params[4] = 60;

	        Geant4Basic panelVolume = new Geant4Basic("Rich_box", "Trd", params);
	    // ** Understand what this function does.
	        panelVolume.setId(0, 1, 0);
	        
	        // Put the box in a certain position (TRANSLATION), .setRotation allows to rotate it
	        panelVolume.setPosition(100, 100, 100);
	        panelVolume.setRotation("xzy", 0,0,0);
	        paddles.get(0).setName("test_print");
            paddles.get(0).setMother(panelVolume);
            paddles.get(0).setId(0,1,0);

	        return panelVolume;
	    }
	
	
	  public List<Geant4Basic> createLayer( int layer) {

	   

	        String paddleLengthStr = "panel folder panel" + "/paddles/Length";

	        //List<Geant4Basic>  mother = new ArrayList<Geant4Basic>();
	        List<Geant4Basic> paddleVolumes = new ArrayList<>();
	            String vname = String.format("sci_S%d_L%d_C%d", 0, layer, 1);
	            Geant4Basic volume = new Geant4Basic(vname, "Box",
	                     2.,  2.,  2.);

	           
	            volume.setPosition(0.0, 0.0, 0);
	            volume.setRotation("xyz", 0, 0, 0);
	            paddleVolumes.add(volume);
	        
	        return paddleVolumes;
	    }

	
	
		/* Previous weird implementation
		// Define a mother volume as a Box 500x500x500 that rappresent an approximation of the electronic panel
	Geant4Basic mEl_Panel_Volume = new Geant4Basic("RICH","box",500,500,500); 
	   // Loop so to create and move the PMTs inside the volume
	for(int _p=0;_p<10; _p++)
	{
	// Define a single PMT volume that will be the Children of the mEl_Panel_Volume class 
	Geant4Basic PMT = new Geant4Basic("","box",10,10,10);
	PMT.setPosition((10*_p)+5,10,10);
	mEl_Panel_Volume.getChildren().add(PMT);
	}
	
	}
	
	*/
	
	// The Following are copied by the FTOF and we need to work on it. 
	
	 public Geant4Basic getMother() {
	        return motherVolume;
	    }
	 @Override
	    public String toString() {
	        StringBuilder str = new StringBuilder();
System.out.print("I am in the to string before for");
	        for(Geant4Basic layerVolume : motherVolume.getChildren()) {
	        	System.out.println("Ao, sono nel ciclo 2222");
	            str.append(layerVolume.gemcString());
	            str.append(System.getProperty("line.separator"));

	            for(Geant4Basic paddleVolume : layerVolume.getChildren()) {
	                str.append(paddleVolume.gemcString());
	                str.append(System.getProperty("line.separator"));
	            }
	        }

	        return str.toString();
	    }

	    public String getProperty(String name) {
	        return properties.containsKey(name) ? properties.get(name) : "none";
	    }
	
// To Remove once the groovy script is done

public static void main(String[] args) {
	
	RICHGeant4Factory factory = new RICHGeant4Factory();	
	String test = factory.toString() ;
	 System.out.println("Test di stampa 22");
	  StringBuilder str = new StringBuilder();

      for(Geant4Basic layerVolume : motherVolume.getChildren())
      { System.out.println("I am in the loop");
          str.append(layerVolume.gemcString());
          //to remove the comment as soon as possibile 
          //str.append(System.getProperty("line.separator"));
/*
          for(Geant4Basic paddleVolume : layerVolume.getChildren()) {
              str.append(paddleVolume.gemcString());
              str.append(System.getProperty("line.separator"));
            
          }
          */
 }
      System.out.println(str);

}
}
