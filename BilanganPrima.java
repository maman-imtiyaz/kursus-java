/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganprima;

/**
 * @author     : Maman 
 * kelas       : Logical with Java Hari Sabtu
 * create date : 
 * soal no.    : 
 * case        : Pengecekan bilangan prima
 */
public class BilanganPrima {

    /**
     * daftar variable global
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable dan Initialisasi
        int n=50;
        
        //Method
        for (int i=2; i<n; i++){
            boolean isPrima = true;
            for (int j =2;j<i;j++){
                if(i%j==0){
                    isPrima = false;
                    break;
                }
            }
            if(isPrima==true){
                System.out.print(i+",");
                
            }
        }
        System.out.println();
    }
    
}
