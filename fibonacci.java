/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deret.fibonacci;

/**
 * @author     : Maman 
 * kelas       : Logical with Java Hari Sabtu
 * create date : 
 * soal no.    : 
 * case        : Membuat Deret Fibonacci
 */
public class fibonacci {
    
    /**
     * daftar variable global
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Variable
    int x,y;
    int n;
    
    //Initialisasi
    x= 0;
    y= 1;        // x dan y merupakan variabel harga awal bertipe integer
    n= 25;    // variabel n sebagai variabel input untuk batas pengulangan
    
    //Method
    for (int i=1;i<n;i++){      // ini untuk pengulangan dalam bentuk for
      System.out.print(x+" ");  // mencetak nilai deret fibonacci dalam struktur for
      x=x+y;        //  statement operator penugasan
      y=x-y;     // statement operator penugasan
    }
    System.out.println();   //cetak ganti baris baru
    }
} 