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
public class PozitifOrNegatif {
    public static void main(String[] args) {
        /*
        ADIM1 BASLA
        ADIM2 Deger al
        ADIM3 Alınan değerın ne olduguna bul 
        ADIM4 Bulunan sonucu ekrana yazdır 
        ADIM5 BITIR
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayı = input.nextInt();
        if  (sayı<0)
            System.out.println("Sayınız negatif");
        else if (sayı>0)
            System.out.println("Sayınız pozitif");
        else if (sayı==0)
            System.out.println("Sayınız sıfıra eşit(Xd)");
        
                
        
        
        // TODO code application logic here
    }
}
