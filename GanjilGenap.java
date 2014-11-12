/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenap;

/**
 * @author     : Maman 
 * kelas       : Logical with Java Hari Sabtu
 * create date : 
 * soal no.    : 
 * case        : Pengecekan bilangan ganjil dan genap
 */
public class GanjilGenap {

    /**
     * daftar variable global
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable
        int n,x,y;
        
        //Initialisasi
        n=20;
        x=1;
        y=2;
        
        //Method
        System.out.println("Bilangan Ganjil:");
        for (int i=1 ; i<n ; i++){
            System.out.print(x + "," );
            x=x+y;
        }
        System.out.println();
        System.out.println("Bilangan Genap:");
        for (int i=1 ; i<n ; i++){
            System.out.print(y + "," );
            y=2+y;
        }
        System.out.println();
    }
    
}
