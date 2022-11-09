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
public class RakamlarToplamı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sayinizi giriniz");
        int N = input.nextInt();
        int toplam = 0 ;
        while(N > 0) {
           int kalan = N % 10 ;
           toplam = toplam + kalan;
           N = N /10;
           
           
            
            
        }
        System.out.println("Toplam"+toplam);
        
            
        // TODO code application logic here
    }
    
}
