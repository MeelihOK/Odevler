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
public class PozitifBölenler {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Lutfen pozitif bolenlerini gormek istediginiz bir tam sayi giriniz");
        int sayi = imput.nextInt();
        int S = 1;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i ==0) {
                System.out.println(i); 
            }
            
        }
                
        
        
    }
}
