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
public class UzunlukDönüşümleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m, response = 0, option;

        System.out.println("Metre giriniz");
        m = input.nextDouble();

        System.out.println("-------------------");
        System.out.println("İŞLEM MENÜSÜ");
        System.out.println("--------------------");
        System.out.println("1-  Milimetreye dönüştür");
        System.out.println("2-  Santimetreye dönüştür");
        System.out.println("3-  Desimetreye dönüştür");
        System.out.println("4-  Kliometreye dönüştür");
        option = input.nextDouble();

        if (option == 1) {
            response = m * 1000;
        } else if (option == 2) {
            response = m * 100;
        } else if (option == 3) {
            response = m * 10;
        } else if (option == 4) {
            response = m / 1000;
        } else {
            System.out.println("Gecerli bir deger giriniz");
        }

        System.out.println("Sonuc : " + response);

        // TODO code application logic here
    }
}
