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
public class HaftanınGünleri {
    public static void main(String[] args) {
        /*
        ADIM1 BASLA
        ADIM2 Sayı al
        ADIM3 Alınan degerın sonucunu bul
        ADIM4 Alınan degere gore sonucu ekrana yazdır
        ADIM5 BITIR
        */
        // TODO code application logic here
       Scanner input = new Scanner(System.in)  ;
        System.out.println("Sayı gırınız");
        int gun = input.nextInt();
        
        switch (gun) {
            case 1 :
                System.out.println("Pazartesi");
             break ;
            case 2: 
                System.out.println("Salı");
             break ;
            case 3 :
                System.out.println("Çarşamba");
             break ;
            case 4 :
                System.out.println("Perşembe");
             break;
            case 5 :
                System.out.println("Cuma");
             break;
            case 6 :
                    System.out.println("Cumartesi");
             break;
            case 7:
                System.out.println("Pazar");
            break;            
        }
    }
}
