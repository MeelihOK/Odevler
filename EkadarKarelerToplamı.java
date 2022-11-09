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
public class EkadarKarelerToplamı {
    public static void main(String[] args) {
        /*
        
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayii giriniz");
        int a = input.nextInt();
        int toplam = 0;
        for (int i = 0 ; i < a; i++) {
            toplam = toplam + (i * i) ;
        }
        System.out.println("Toplam sonucunus"+ toplam);
            
        
                
                
        
        // TODO code application logic here
    }
}
