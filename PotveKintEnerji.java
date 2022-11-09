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
public class PotveKintEnerji {
    public static void main(String[] args) {
        
        /*
        ADIM1 Basla
        ADIM2 Maddenın hızını al 
        ADIM3 Maddenın yukseklıgını al 
        ADIM4 Maddenın kutlesını al
        ADIM5 Verılen bılgıler dahılınde potansıyel enerjısını hesapla  
        ADIM6 verılen bılgıler dahılınde kıtenık enerjısını hesapla
        Adım7 Elde edılen potansıyel ve kınetık enerjıyı ekrana yansıt
        ADIM8 Bıtır
        */
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Cısmın kutlesını gırınız(kg)");
        int Kutle = input.nextInt();
        
        System.out.println("Lutfen hızınısı gırınız (m/sn)");
        int Hız = input.nextInt();
         
        System.out.println("Lutfen yukseklıgınızı gırınız(m)");
        int Yukseklık = input.nextInt() ;
        
        double Kınetık_Enerjı = (double) 1 / 2 * Kutle * Hız * Hız ;
        
        double Potansıyel_Enerjı = (double) Kutle *  Yukseklık * 10;
        
          System.out.println("Kınetık Enerjı: "+Kınetık_Enerjı+ "Potansıyel Enerjı"+ Potansıyel_Enerjı);    
          
           
        
        
        
        
    }
}
