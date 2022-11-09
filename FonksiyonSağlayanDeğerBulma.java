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
public class FonksiyonSağlayanDeğerBulma {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen b sayisini giriniz");
        int b = input.nextInt();
        for (int i = 0; i <= 100; i++) {
            if (Math.pow(i, 3) - (Math.pow(i, 2)) == b) {
                System.out.println(i + " Sayısı bu fonksiyonu saglar");

            }

        }

    }
}
