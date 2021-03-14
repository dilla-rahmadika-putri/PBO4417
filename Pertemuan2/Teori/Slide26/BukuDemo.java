package Pertemuan2.Teori.Slide26;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class BukuDemo {
    public static void main(String[] args){
        buku KumpulanBuku = new buku("Pemrograman Berbasis Objek dengan java","indraiani","Elexmedia Komputindo",2007);
        buku KumpulanBuku2 = new buku("Dasar Pemrograman java","Abdul Kadir","Andi Offset",2004);
        
        KumpulanBuku.CetakBuku();
        KumpulanBuku2.CetakBuku();
    }
}
