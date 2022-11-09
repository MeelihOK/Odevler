/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödevler;
import java.util.Scanner;

/**
 *
 * @author Melih
 */
public class ÜçgenAlanHesabı {
    public static void main(String[] args) {
        /*
        ADIM1 Başla
        ADIM2 Ucgenın taban alanı değerini al   
        ADIM3 Alınan değer uygun mu uygunsa devam et    
        ADIM4 Ucgenın yukseklık degerını gırın 
        ADIM5 Ucgenın yukseklık degerı uygunsa devam et 
        ADIM6 Ucgenın taban uzunlugu ve yukseklıgını çarp   
        ADIM7 Ucgenın alanını ekrana yansıt
        ADIM8 Bıtır
        */
        Scanner input = new Scanner(System.in);     
      int a;
        System.out.println("Ucgenın taban uzunlugunu gırın");
     a = input.nextInt();
          
      int b;
        System.out.println("Ucgenın yukseklıgını gırınız");
     b = input.nextInt();
     
     int alan = a*b/ 2;
        System.out.println("alan:)"+alan);
       
       
        
        // TODO code application logic here
    }
}
