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
public class buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    
    /**
     *
     * @param judul
     * @param pengarang
     * @param penerbit
     * @param tahun
     */
    public buku(String judul,String pengarang,String penerbit,int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    /**
     *
     */
    public void CetakBuku(){
        System.out.println("Judul Buku: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun: " + tahun);
    }
}
