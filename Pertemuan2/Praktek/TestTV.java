package Pertemuan2.Praktek;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dilla Rahmadika Putri
 */
public class TestTV {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn(true);
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn(true);
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.volumeUp();
        
        System.out.println("Channel TV 1 adalah "+ tv1.channel + " dan level volume adalah " + tv1.volumeLevel);
        System.out.println("Channel TV 2 adalah " + tv2.channel + " dan level volume adalah " + tv2.volumeLevel);
        
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());
        
        TV tvku = new TV();
        man1.beliTV(tvku);
        man1.cekTV();
        System.out.println(man1.punyaTV);
        
        man1.jualsemuaTV();
        man1.cekTV();
        System.out.println(man1.punyaTV);
                
    }
    
}
