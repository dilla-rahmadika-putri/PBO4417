/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Manusia{
    String nim;
    
    Mahasiswa(){
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void Jurusan(){
        System.out.println("Teknik Informatika");
    }
}
