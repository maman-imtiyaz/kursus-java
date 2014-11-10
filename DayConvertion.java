/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayconvertion;

/**
 * @author     : Maman 
 * kelas       : Logical with Java Hari Sabtu
 * create date : 
 * soal no.    : 
 * case        : Konversi hari dan bulan
 */
public class DayConvertion {
    
    /**
     * daftar variable global
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Varriable
        String hari_conv = null,bln_conv = null;
        int tgl,hari,bln,thn;
        
        //Initialisasi
        tgl=27;
        hari=1;
        bln=3;
        thn=2014;
        
        //Method Pilihan A
        //Konversi Hari
        if (hari==1) {
            hari_conv= "Senin";
        }
        if (hari==2) {
            hari_conv= "Selasa";
        }
        if (hari==3) {
            hari_conv= "Rabu";
        }
        if (hari==4) {
            hari_conv= "Kamis";
        }
        if (hari==5) {
            hari_conv= "Jumat";
        }
        if (hari==6) {
            hari_conv= "Sabtu";
        }
        if (hari==7) {
            hari_conv= "Minggu";
        }
        
        //Konversi Bulan
        if (bln==1) {
            bln_conv= "Januari";
        }
        if (bln==2) {
            bln_conv= "Februari";
        }
        if (bln==3) {
            bln_conv= "Maret";
        }
        if (bln==4) {
            bln_conv= "April";
        }
        if (bln==5) {
            bln_conv= "Mei";
        }
        if (bln==6) {
            bln_conv= "Juni";
        }
        if (bln==7) {
            bln_conv= "Juli";
        }
        if (bln==8) {
            bln_conv= "Agustus";
        }
        if (bln==9) {
            bln_conv= "September";
        }
        if (bln==10) {
            bln_conv= "Oktober";
        }
        if (bln==11) {
            bln_conv= "November";
        }
        if (bln==12) {
            bln_conv= "Desember";
        }
       
       System.out.print(hari_conv + ", ");
       System.out.print(tgl + " ");
       System.out.print(bln_conv + " ");
       System.out.println(thn);
         
        //Method Pilihan B
       //Konversi Hari
        switch (hari){
        case 1 :hari_conv= "Senin";
                break;
        case 2 :hari_conv= "Selasa";
                break;
        case 3 :hari_conv= "Rabu";
                break;
        case 4 :hari_conv= "Kamis";
                break;
        case 5 :hari_conv= "Jum'at";
                break;
        case 6 :hari_conv= "Sabtu";
                break;
        case 7 :hari_conv= "Minggu";
                break;
        }
        
        //Konversi Bulan
        switch (bln){
        case 1 :bln_conv= "Januari";
                break;
        case 2 :bln_conv= "Februari";
                break;
        case 3 :bln_conv= "Maret";
                break;
        case 4 :bln_conv= "April";
                break;
        case 5 :bln_conv= "Mei";
                break;
        case 6 :bln_conv= "Juni";
                break;
        case 7 :bln_conv= "Juli";
                break;
        case 8 :bln_conv= "Agustus";
                break;
        case 9 :bln_conv= "September";
                break;
        case 10 :bln_conv= "Oktober";
                break;
        case 11 :bln_conv= "November";
                break;
        case 12 :bln_conv= "Desember";
                break;
        }
        
        System.out.print(hari_conv + ", ");
        System.out.print(tgl + " ");
        System.out.print(bln_conv + " ");
        System.out.println(thn);
    
    }
        
 }
