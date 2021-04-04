/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Teori;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author ASUS
 */
public class queue extends AlatTulis {
    private final Queue <AlatTulis> Barang = new LinkedList <AlatTulis>();
    queue(){
    }
    public boolean tambah(AlatTulis Barang){
        return this.Barang.add(Barang);
    }
    public boolean hapus(AlatTulis Barang){
        return this.Barang.remove(Barang);
    }
    public void tampil(){
        for (int i = 0; i < Barang.size(); i++){
            System.out.println(Barang.element().getBarang());
        }
    }
    public void size(){
        AlatTulis head = this.Barang.peek();
        System.out.println("Head pada queue : " + head);
        int size = Barang.size();
        System.out.println("Size pada queue : " + size);
    }
    public void poll(){
        AlatTulis PeekBarang = this.Barang.poll();
        System.out.println("Poll pada queue : " + PeekBarang.getBarang());
    }
}
