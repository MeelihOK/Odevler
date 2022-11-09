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
public class DaireninHesaplamaları {
    public static void main(String[] args) {
        /*
        
        ADIM1 Basla 
        ADIM2 Yarı cap degerı al   
        ADIM3 Alınan yarı capaa uygun formulle alanını hesapla 
        ADIM4 Alınnan yarı capa uygun formulle hacmını hesapla 
        ADIM5 Bulunan degerlerı ekrana yansıt   
        ADIM6 Bıtır
     
        
        */
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yarı capınızı gırın");
        int yarıcap = input.nextInt();
        
        double π = 3.14;
        double Alan = (double) yarıcap*yarıcap*π ;
        double Hacim = (double) 4/3*π*yarıcap*yarıcap*yarıcap;
        
        System.out.println("Alan:"+Alan+"Hacim:"+Hacim);        
        
      
        
        
        
                
        
        
    }
    
}
