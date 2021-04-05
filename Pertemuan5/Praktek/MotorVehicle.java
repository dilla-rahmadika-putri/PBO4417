/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Praktek;

/**
 *
 * @author ASUS
 */
public class MotorVehicle extends Vehicle{
    int sizeofEngine;
    String licencePlate;
    
    MotorVehicle(){
        this.sizeofEngine = 1;
        this.licencePlate = "H 1 IDN";
    }
    MotorVehicle(int sizeofEngine, String licencePlate){
        this.sizeofEngine = sizeofEngine;
        this.licencePlate = licencePlate;
    }
    public int getSizeofEngine(){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
}
