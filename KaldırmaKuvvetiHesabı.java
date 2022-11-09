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
public class KaldırmaKuvvetiHesabı {
    public static void main(String[] args) {
        /*
        ADIM1 BASLA
        ADIM2 Cısmın batan hacmının kutlesını al
        ADIM3 Cısmın battıgı sıvının yogunlugunu al
        ADIM4 Verılen bılgıler ıle kaldırma kuvvetı hesapla
        ADIM5 Elde edılen kaldırma kuvvetını ekrana yazdır
        ADIM7 BITIR
        */
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen batan cısmın hacımın gırınız");
        int batanhacım = input.nextInt() ;
        
        System.out.println("Lutfen cısmın yogunlugunu gırınız");
        int sıvıyogunlugu = input.nextInt() ;
        
        double kaldırmakuvvetı = (double) batanhacım * sıvıyogunlugu ;
        System.out.println("Kaldırma Kuvvetı:"+kaldırmakuvvetı);
}
}