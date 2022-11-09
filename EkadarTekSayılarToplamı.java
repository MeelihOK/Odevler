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
public class EkadarTekSayılarToplamı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sayı gırınız");
        int deger = input.nextInt();
        int i;
        int toplam = 0;
       
        
        for ( i = 0 ; i<=deger ; i++){
            if ((i%2)==1) {
                toplam = toplam + i;
                
               
                        
            }
         
            
            
        }
        System.out.println("Toplam: "+toplam);
        
        
    }
}
