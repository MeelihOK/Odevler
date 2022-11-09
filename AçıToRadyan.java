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
public class AçıToRadyan {
    public static void main(String[] args) {
       /*  ADIM1 Basla
           ADIM2 Kullanıcıdan derece cınsınden deger al
           ADIM3 Kullanıcıdan alınan degerı radyan cınsıne cevır (π/180 ile çarp)   
           ADIM4 Kullanıcıdan alınan degerı ekrana yansıt
           ADIM5 Bıtır
        */
       Scanner input = new Scanner(System.in);
        System.out.println("Acı cınsınden degerınızı gırın");
        int acı = input.nextInt();
        double Radyan = (double) acı*0.0174532925  ;
        System.out.println("Radyan:"+Radyan);     
        
        
       
       
       
       
        
        
        
        
        
        // TODO code application logic here
    }
    
}
