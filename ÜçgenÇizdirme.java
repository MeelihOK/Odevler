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
public class ÜçgenÇizdirme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgen boyutunuzu giriniz");
        int a = input.nextInt();
        
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    
    }
}
