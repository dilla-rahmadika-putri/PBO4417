/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Teori;
import java.util.Stack;
/**
 *
 * @author ASUS
 */
public class TEST {
    public static void main(String[]args){
        //Array
        System.out.println("Array List");
        Array array = new Array();
        AlatTulis nulis = new AlatTulis();
        AlatTulis nulis1 = new AlatTulis();
        AlatTulis nulis2 = new AlatTulis();
        
        nulis.setBarang("Pensil");
        nulis1.setBarang("Spidol");
        nulis2.setBarang("Rautan");
        
        //Menambah data pada array
        array.tambah(nulis);
        array.tambah(nulis1);
        array.tambah(nulis2);
        array.tampil();
        
        //Menghapus data pada array
        System.out.println("Perubahan setelah data dihapus");
        array.hapus(nulis2);
        array.tampil();
        
        //Stack
        System.out.println("Stack");
        stack Stack = new stack();
        
        //Push pada stack
        Stack.Push(nulis);
        Stack.Push(nulis1);
        Stack.Push(nulis2);
        Stack.tampil();
        
        //Pop pada stack
        Stack.Pop();
        System.out.println("Perubahan setelah data dihapus");
        Stack.tampil();
        
        //Peek pada stack
        Stack.Peek();
        
        //Queue
        System.out.println("Queue");
        queue Queue = new queue();
        
        //Tambah pada queue
        Queue.tambah(nulis);
        Queue.tambah(nulis1);
        Queue.tambah(nulis2);
        Queue.tampil();
        
        //Hapus pada queue
        Queue.hapus(nulis1);
        System.out.println("Perubahan setelah dihapus");
        Queue.tampil();
        
        //poll pada queue
        Queue.poll();
        System.out.println("Perubahan setelah dihapus bagian head queue");
        Queue.tampil();
        
        Queue.size();
        
        
        
        
        
    }
    
}
