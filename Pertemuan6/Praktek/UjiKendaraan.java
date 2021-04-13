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
public class UjiKendaraan {
    public static void main(String[]args){
        
        Vehicle kendaraan = new Vehicle();
        System.out.println("=====KENDARAAN=====");
        kendaraan.speed = 70;
        kendaraan.color = "Black";
        System.out.println("Kendaraan berwarna " + kendaraan.color);
        kendaraan.goStraight();
        kendaraan.turnLeft();
        kendaraan.turnRight();
        System.out.println("Melaju dengan kecepatan : " + kendaraan.speed + "KM/Jam");
    
        Bicycle sepeda = new Bicycle();
        System.out.println("=====SEPEDA=====");
        KendaraanMelaju(sepeda);
        System.out.println("Sepeda lewat...");
        sepeda.ringBell();
        
        
        MotorVehicle bermotor = new MotorVehicle();
        System.out.println("=====KENDARAAN BERMOTOR=====");
        bermotor.color = "Red";
        bermotor.speed = 50;
        bermotor.licencePlate = "H 123 IDN";
        bermotor.sizeofEngine = 250;
        KendaraanMelaju(bermotor);
        System.out.println("Kendaraan bermotor berwarna : " + bermotor.color);
        System.out.println("Melaju dengan kecepatan : " + bermotor.speed + "KM/Jam");
        System.out.println("Kendaraan bermotor memiliki plat nomer " + bermotor.licencePlate);
        System.out.println("Kendaraan bermotor dengan ukuran mesin :" + bermotor.sizeofEngine);
        
        
        MotorCycle motor = new MotorCycle();
        System.out.println("=====SEPEDA MOTOR=====");
        motor.color = "White";
        motor.setGearFoot(4);
        KendaraanMelaju(motor);
        System.out.println("Sepeda motor berwarna : " + motor.color);
        System.out.println("Sepeda motor berada digear : " + motor.getGearfoot());
        
        
        Car mobil = new Car();
        System.out.println("=====MOBIL=====");
        mobil.color = "Silver";
        mobil.speed = 90;
        mobil.setSeatBelt(true);
        KendaraanMelaju(mobil);
        System.out.println("Mobil berwarna : " + mobil.color);
        System.out.println("Mobil dengan kecepatan : " + mobil.speed + "KM/Jam");
        System.out.println("Apakah sabuk pengaman sudah dipakai? " + mobil.seatbelt1); 
        
        
    }
    public static void KendaraanMelaju(Vehicle berkendara){
        berkendara.goStraight();
    }

}
