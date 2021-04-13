/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6.Praktek;

/**
 *
 * @author ASUS
 */
public class Car extends MotorVehicle{
    boolean seatbelt1;
    
    Car(){
        this.seatbelt1 = false;
    }
    public void setSeatBelt(boolean sabukPengaman){
       this.seatbelt1 = seatbelt1;
      
    }
    public boolean getSeatBelt(){
        return seatbelt1;
        
    }
    
}
