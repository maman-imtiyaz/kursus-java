/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungluas;

/**
 * @author     : Maman 
 * kelas       : Logical with Java Hari Sabtu
 * create date : 
 * soal no.    : 
 * case        : Perhitungan luas lingkaran, segitiga dan persegi panjang
 */
public class HitungLuas {
    
    /**
     * daftar variable global
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable
        double phi; //konstanta
        int r,a,t,p,l;   
        
        //Initialisasi
        phi= 3.14;
        r= 7;  //jari-jari lingkaran
        a= 5;
        t= 7;
        p= 10;
        l= 4;
        
        //Luas Lingkaran
        System.out.println("Program Luas Lingkaran");
        System.out.println("Masukkan panjang jari-jari: " + r);
      
        int ll = (int) (0.5*phi*r*r);
        System.out.println("Luas Lingkarang : " + ll);
        
        //Luas Segitiga
        System.out.println("Program Luas Segitiga");
        System.out.println("Masukkan Nilai alas: " + a);
        System.out.println("Masukkan Nilai tinggi: " + t);
        
        int ls = (int) (0.5*a*t);
        System.out.println("Luas Segitiga : " + ls);
        
        //Luas segiempat
        System.out.println("Program Luas Segiempat");
        System.out.println("Masukkan Nilai panjang: " + p);
        System.out.println("Masukkan Nilai panjang: " + l);
        
        int lp = (int) (p*l);
        System.out.println("Luas Persegi : " + lp);
        
    }
    
}
