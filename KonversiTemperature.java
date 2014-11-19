/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversitemperature;

/**
 * @author     : Maman 
 * kelas       : Logical with Java Hari Sabtu
 * create date : 
 * soal no.    : 
 * case        : Konversi Temperature
 */
public class KonversiTemperature {
    
    /**
     * daftar variable global
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable
        int c,r,f;
        float cf,cr,fc,fr,rc,rf;
        
        // Initialisasi
        c= 45;
        f= 113;
        r= 36;
	ijfkjcnkdsjoe
       
        //konversi c --> f
        System.out.println("Program Konversi C ke F");
        System.out.println("Masukkan nilai awal= " + c + "°C");
        
        cf =(float) (1.8*c+32);
        
        System.out.println("Hasil Konversi= " + cf + "°F");
        
        //konversi c --> r
        System.out.println("Program Konversi C ke R");
        System.out.println("Masukkan nilai awal= " + c + "°C");
        
        cr =(float) (0.8*c);
        
        System.out.println("Hasil Konversi= " + cr + "°R");
        
        //konversi f --> c
        System.out.println("Program Konversi F ke C");
        System.out.println("Masukkan nilai awal= " + f + "°F");
        
        fc =(float) (0.56*f-32);
        
        System.out.println("Hasil Konversi= " + fc + "°C");
        
        //konversi f --> r
        System.out.println("Program Konversi F ke R");
        System.out.println("Masukkan nilai awal= " + f + "°F");
        
        fr =(float) (0.44*f-32);
        
        System.out.println("Hasil Konversi= " + fr + "°R");
        
        //konversi r --> c
        System.out.println("Program Konversi R ke C");
        System.out.println("Masukkan nilai awal= " + r + "°R");
        
        rc =(float) (1.25*r+32);
        
        System.out.println("Hasil Konversi= " + rc + "°C");
        
        //konversi r --> f
        System.out.println("Program Konversi R ke F");
        System.out.println("Masukkan nilai awal= " + r + "°R");
        
        rf =(float) (2.25*r+32);
        
        System.out.println("Hasil Konversi= " + rf + "°F");
              
    }
    
}
