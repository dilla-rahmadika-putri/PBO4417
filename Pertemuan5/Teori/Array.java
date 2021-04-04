/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Teori;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */



public class Array extends AlatTulis {
    private final ArrayList <AlatTulis> alattulis = new ArrayList<>();
    public void tambah(AlatTulis Barang){
        alattulis.add(Barang);
    }
    public void tampil(){
        for (int i = 0; i <alattulis.size(); i++){
            System.out.println("Alat tulis : " + alattulis.get(i).getBarang());
        }
    }
    public void hapus(AlatTulis Barang){
        alattulis.remove(Barang);
    }
}
