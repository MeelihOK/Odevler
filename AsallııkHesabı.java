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
public class AsallııkHesabı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sayı gırınız");
        
        int N = input.nextInt();
        boolean
                asal = true ; //boolean varsayımdır!!
        for (int i = 2; i < N; i++) {
            if(N % i ==0)
            {
                asal = false;
            }
        }
        if (asal == true){
            System.out.println(N+" sayısı asaldır");
        }
        else
            System.out.println(" Asal değil!");
         
       
           
           
           
               
    }
}
