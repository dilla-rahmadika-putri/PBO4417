package Pertemuan2.Teori.Slide18;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Mobil2 {
    String HidupkanMobil;
    String MatikanMobil;
    int UbahGigi = 0;
    
    Mobil2(){
    }
    void turnOn(boolean on){
        on = true;
    }
    void turnOff(boolean on){
        on = false;
    }
    void setHidupkan(){
        System.out.println("Mobil Hidup");
    }
    void setMatikan(){
        System.out.println("Mobil Mati");
    }
    void GantiGigi(int newValue){
        UbahGigi = UbahGigi + newValue;
        System.out.println("Gigi mobil berada di " + UbahGigi);
    } 
}
