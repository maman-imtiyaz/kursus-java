/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angkaconvertion;

/**
 * @author     : Maman 
 * kelas       : Logical with Java Hari Sabtu
 * create date : 01 November 2014
 * soal no.    : 
 * case        : Konversi angka
 */
public class AngkaConvertion {
    
    /**
     * daftar variable global
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //variable
    String hsl_bagi1,hsl_bagi2,hsl_bagi3,satuan1;
    int hsl_bagi_ribuan,hsl_bagi_ratusan,hsl_bagi_puluhan,satuan;
    int inp_angka;
    int sisa;
    
    //Initialisasi
    inp_angka=2345;
    sisa=0;
    hsl_bagi1="";
    hsl_bagi2="";
    hsl_bagi3="";
    satuan1="";
    hsl_bagi_ribuan=0;
    hsl_bagi_ratusan=0;
    hsl_bagi_puluhan=0;
    satuan=0;
    
    
    if (inp_angka>=1000)
    {
	//Proses pembagian dengan ribuan
        hsl_bagi_ribuan=(inp_angka/1000);
        sisa=(inp_angka%1000);
    }
    if (sisa>=100)
    {
    //Proses pembagian dengan ratusan
    
        hsl_bagi_ratusan=(sisa/100);
        sisa=(sisa%100);
    }
    if (sisa>=10)
	{
    //Proses pembagian dengan puluhan
        hsl_bagi_puluhan=(sisa/10);
        satuan=(sisa%10);
    }
    
    if (hsl_bagi_ribuan==1){
        hsl_bagi1= "satu";
    }
    if (hsl_bagi_ribuan==2){
        hsl_bagi1= "dua";
    }
    if (hsl_bagi_ribuan==3){
        hsl_bagi1= "tiga";
    }
    if (hsl_bagi_ribuan==4){
        hsl_bagi1= "empat";
    }
    if (hsl_bagi_ribuan==5){
        hsl_bagi1= "lima";
    }
    
    if (hsl_bagi_ratusan==1){
        hsl_bagi2= "satu";
    }
    
    if (hsl_bagi_ratusan==2){
        hsl_bagi2= "dua";
    }
    if (hsl_bagi_ratusan==3){
        hsl_bagi2= "tiga";
    }
    if (hsl_bagi_ratusan==4){
        hsl_bagi2= "empat";
    }
    if (hsl_bagi_ratusan==5){
        hsl_bagi2= "lima";
    }
    
    
    
    if (hsl_bagi_puluhan==1){
        hsl_bagi3= "satu";
    }
    
    if (hsl_bagi_puluhan==2){
        hsl_bagi3= "dua";
    }
    if (hsl_bagi_puluhan==3){
        hsl_bagi3= "tiga";
    }
    if (hsl_bagi_puluhan==4){
        hsl_bagi3= "empat";
    }
    if (hsl_bagi_puluhan==5){
        hsl_bagi3= "lima";
    }
    
    
     if (satuan==1){
        satuan1= "satu";
    }
     if (satuan==2){
        satuan1= "dua";
    }
     if (satuan==3){
        satuan1= "tiga";
    }
     if (satuan==4){
        satuan1= "empat";
    }
     if (satuan==5){
        satuan1= "lima";
    }
    
    
    System.out.print(hsl_bagi1 + "ribu ");
    System.out.print(hsl_bagi2 + "ratus ");
    System.out.print(hsl_bagi3 + "puluh ");
    System.out.println(satuan1);
       
    
    
    
   }  

}
