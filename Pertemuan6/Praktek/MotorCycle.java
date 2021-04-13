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
public class MotorCycle extends MotorVehicle {
    private int numGear;
    
    MotorCycle(){
        this.numGear = 0;
    }
    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }
    public int getGearfoot(){
        return numGear;
    }
    
}
