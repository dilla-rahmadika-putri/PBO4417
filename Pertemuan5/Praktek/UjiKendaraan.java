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
public class UjiKendaraan {
    public static void main(String[]args){
        Vehicle kendaraan = new Vehicle();
        kendaraan.turnLeft();
        kendaraan.goStraight();
        kendaraan.turnRight();
        
        Bicycle bike = new Bicycle();
        bike.ringBell();
        
        MotorVehicle motor = new MotorVehicle(3,"H 1234 DR");
        System.out.println("Plat motor : " + motor.getLicencePlate());
        System.out.println("Gigi motor : " + motor.getSizeofEngine());
    }
}
