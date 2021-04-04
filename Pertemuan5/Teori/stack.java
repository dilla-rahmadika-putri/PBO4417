/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Teori;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class stack extends AlatTulis{
    private final Stack <AlatTulis> Barang = new Stack <AlatTulis>();
    stack(){
    }
    public AlatTulis Push(AlatTulis Barang){
        return this.Barang.push(Barang);
    }
    public void tampil(){
        for(int i = 0; i < Barang.size(); i++){
            System.out.println(Barang.get(i).getBarang());
        }
    }
    public void Pop(){
        AlatTulis PopBarang = this.Barang.pop();
        System.out.println("Pop pada stack : " + PopBarang.getBarang());
    }
    public void Peek(){
        AlatTulis PeekBarang = this.Barang.peek();
        System.out.println("Peek pada stack : " + PeekBarang.getBarang());
    }
}
