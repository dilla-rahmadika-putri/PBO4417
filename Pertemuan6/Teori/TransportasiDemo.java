/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Transportasi.Bicycle;
import Transportasi.Mobil;

/**
 *
 * @author ASUS
 */
public class TransportasiDemo {
    public static void main(String[]args){
        Bicycle sepeda = new Bicycle();
        sepeda.lewat();
        sepeda.bell();
        
        Mobil car = new Mobil();
        car.setHidupkan();
        car.jalan();
        car.setMatikan();
    } 
}
