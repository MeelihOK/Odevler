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
public class TekÇiftToplamlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();
        int toplam = 0;
        int tektoplam = 0;
        int cifttoplam = 0;
        for (int i = 0; i <= sayi; i++) {
           
            if (i % 2 == 0){
                cifttoplam = tektoplam + i;
            }
            
            else {
                tektoplam = tektoplam + i;
                
            }
            toplam = toplam + i;
        }
        System.out.println("Cift sayi toplamı: " +cifttoplam+ "Tek sayi toplami: " +tektoplam+ " Genel toplam: " +toplam);
        
        
        
    }
    
}
