/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Nilai extends Mahasiswa {
    float nilai;
    
    public void setNilai(float nilaiT,float nilaiP){
        System.out.println("Nilai Mata kuliah pokok     : " +nilaiP);
        System.out.println("Nilai Mata kuliah tambahan  : " +nilaiT);
        
        nilai = (float) ((nilaiP * 0.60) + (0.40 * nilaiT));
    }
    public float getNilai(){
        return nilai;
    }
    
}
