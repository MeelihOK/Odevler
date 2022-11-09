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
public class ÜçgenÇeşitiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk kenarı giriniz ");
        int a = input.nextInt();
        System.out.println("İkinci kenari giriniz");
        int b = input.nextInt();
        System.out.println("Ucuncu kenari giriniz");
        int c = input.nextInt();
        
        if(a ==b && a == c)
            System.out.println("Ucgenınız eşkenar");
        else if(a!=b && a!=c )
            System.out.println("Ucgeniniz çeşitkenar");
        else
            System.out.println("Ucgeniniz ikizkenar");
            
    }
}
