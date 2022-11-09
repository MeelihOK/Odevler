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
public class TEKorÇift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int a = input.nextInt();
        
        if ( a  %  2 == 0)
            System.out.println("Sayiniz çifttir");
        else 
            System.out.println("Sayınız tektir");
            
     
        
    }
}
