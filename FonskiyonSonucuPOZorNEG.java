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
public class FonskiyonSonucuPOZorNEG {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double x, sonuc;
    
         System.out.print("x^2 - 5x-3 Fonksiyonu için x giriniz");
         x = input.nextDouble();
         
         sonuc = ((Math.pow(x, 2))- (5*x)) +3;
         if (sonuc < 0){
             System.out.println("Sonuc negatif:"+ sonuc);
         }else if (sonuc > 0){
             System.out.println("Sonucunuz pozitif:"+ sonuc);
         }else {
             System.out.println("Sonuc = 0");
         }
         
         
    
    
    }
}
