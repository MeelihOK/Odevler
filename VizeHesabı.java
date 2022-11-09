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
public class VizeHesabı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v , f;
        do {
            System.out.println("Lutfen vizenizi giriniz");
            v = input.nextInt();
        } while(v < 0 || v > 100);
        
        do{
            System.out.println("Lütfen final notunuzu giriniz");
            f = input.nextInt();
        } while(f < 0 || f > 100);
        double  ort = (f * 60 / 100) + (v * 40 / 100);
        if (80 <= ort && ort <=100){
            System.out.println(" Notunuz A");
           }
        else if (60<= ort && ort<=79){
            System.out.println(" Notunuz B");
        }
        else if (50 <= ort && ort <=59){
            System.out.println(" Notunuz C");
        }
        else {
            System.out.println(" Notunuz D");
        }
                
        
        // TODO code application logic here
    }
    
}
