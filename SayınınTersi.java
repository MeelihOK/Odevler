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
public class SayınınTersi {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int sayi = input.nextInt();
        
        System.out.println("---------------");
        System.out.print("Sayının tersi:  ");
        
        while (sayi > 0 ) {
            System.out.print(sayi % 10);
            sayi = sayi / 10 ;
            
        }
        
        
    }
}
