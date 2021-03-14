package Pertemuan1.Praktek.Praktek2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dilla Rahmadika Putri
 */
class TV {
    int channel;
    int volumeLevel;
    boolean on;
    
    TV(){
    }
    
    void turnOn(boolean on){
        on = true;
    }
    void turnOff(boolean on){
        on = false;
    }
    void setChannel(int newChannel){
        channel = newChannel;
    }
    void setVolume(int NewVolumeLevel){
        volumeLevel = NewVolumeLevel;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
    void volumeUp(){
        ++volumeLevel;
    }
    void volumeDown(){
        --volumeLevel;
    }
    
}
