package org.jlab.detector.geant4;
//Created by gangel on July 29 2016
public class RICHParameters {
// This class is used until a database will be released. It uses the .txt file created by Silvia Pisano
	// that you can find in the github of Maurizio Ungaro under /detector/clas12/rich
	
	
	double par_RichBox_dz      =    634.81  ; //mm,  half box
	double par_RichBox_dx1     =    135     ; //mm,  half width entrance window close to beam pipe 
	double par_RichBox_dx2     =    2090.22 ; //mm,  half width entrance window maximum radiu
	double par_RichBox_dx3     =    135     ; //mm,  half width rear window close to beam pipe
	double par_RichBox_dx4     =    2090.22 ; //mm,  half width rear window maximum radius
	double par_RichBox_dy1     =    1882.49 ; //mm,  half heigth entrance window
	double par_RichBox_dy2     =    1882.49 ; //mm,  half heigth rear window 
	 
	double par_RichBox_alp1    =    0       ; //deg, rotation entrance window
	double par_RichBox_alp2    =    0       ; //deg, rotation rear window
	double par_RichBox_th      =    -25     ; //deg, central axis inclination
	double par_RichBox_ph      =    90      ; //deg, central axis inclination is a rotation around x axis

	double par_RichBox_x       =    0       ; //mm, descr x
	double par_RichBox_y       =    1706.145; //mm, descr y
	double par_RichBox_z       =    5705.13 ; //mm, descr z
	
	
	
	double par_RichBox_the      =   25.0    ; // deg,   descr thea
	double par_RichBox_phi      =   180.0   ; // deg,   descr phi	
	double par_RichBox_psi      =   90.0    ; // deg, descr psi
	
	double par_RichBox_y_offset =   284.31  ; // mm,
	
	double par_SteelPlate_y     =   0.0     ; // mm, y-width of the steel plate on the beam line
	
	double old_par_RichBox_dz   =   627.18  ; //  mm,   half depth                                            
	double old_par_RichBox_dx1  =   175     ; //  mm,   half width entrance window close to beam pipe 
	double old_par_RichBox_dx2  =   2107.275; //  mm,   half width entrance window maximum radiu	
	double old_par_RichBox_dx3  =   175     ; //  mm,   half width rear window close to beam pipe
	double old_par_RichBox_dx4  =   2107.275; //  mm,   half width rear window maximum radius
	double old_par_RichBox_dy1  =   1882.7  ; //  mm,   half heigth entrance window
	double old_par_RichBox_dy2  =   1882.7  ; //  mm,   half heigth rear window 	
	double old_par_RichBox_alp1 =   0       ; //  deg,   rotation entrance window
	double old_par_RichBox_alp2 =   0       ; //  deg,   rotation rear window
	double old_par_RichBox_th   =   -25     ; //  deg,   central axis inclination
	double ld_par_RichBox_ph    =   90      ; //  deg,   central axis inclination is a rotation around x axis
	
	
	

}
