package uts.if2.pkg10119080.kevinpratamasinaga.no3;


import uts.if2.pkg10119080.kevinpratamasinaga.no3.MusicGenre;
import uts.if2.pkg10119080.kevinpratamasinaga.no3.PopRock;
import uts.if2.pkg10119080.kevinpratamasinaga.no3.ProgressiveRock;
import uts.if2.pkg10119080.kevinpratamasinaga.no3.PsychedellicRock;

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
public class HardRock extends MusicGenre implements PopRock, ProgressiveRock, PsychedellicRock{
    public void genreHardRock(String artistName) {
        System.out.println(artistName + " adalah musisi Hard Rock");
    }
    
    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName + " adalah musisi Pop Rock");
    }
    
    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName + " adalah musisi Progressive Rock");
    }
    
    @Override
    public void genrePsychedellicRock(String artistName) {
        System.out.println(artistName + " adalah musisi Psychedellic Rock");
    }
}