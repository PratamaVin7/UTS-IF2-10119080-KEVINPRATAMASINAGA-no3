package uts.if2.pkg10119080.kevinpratamasinaga.no3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Genre Musik
 */
public class Rnb extends MusicGenre implements Blues, Jazz{
    
    @Override
    public void genreJazz(String artistName) {
        System.out.println(artistName + " adalah musisi Jazz");
    }
    
    @Override
    public void genreBlues(String artistName) {
        System.out.println(artistName + " adalah musisi Blues");
    }
}