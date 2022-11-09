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
public class VücütKitleEndeksi {
    public static void main(String[] args) {
       /*
        ADIM1 BASLA
        ADIM2 Vucut kutlesını gırınız(Kg)
        ADIM3 Vucut boy uzunlugunu gırınız(metre)
        ADIM4 Gırılen verılerle vucut kutle endeksını hesapla
        ADIM5 Vucut kıtle endeksını ekrana yansıt
        ADIM6 BITIR
        
        VUCUT KITLE ENDEKSI
        18.5 VE ALTI  ÇOK ZAYIF
        18.5 - 24.9  NORMAL
        25 VE ÜSTÜ OBEZİTE
        */
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen vucut kutlenızı gırınız(Kg)");
        double Kutle = input.nextDouble();
        
        System.out.println("Lutfen boy uzunlugunuzu gırınız(Cm)");
        double Boy = input.nextDouble();
        
        double Vucut_Kıtle_Endeksı = Kutle / Boy / Boy * 10000   ;
        
        System.out.println("Vucut Kıtle Endeksı:"+Vucut_Kıtle_Endeksı);
        System.out.println("Lutfen saglıklı beslenmeye dıkkat edın :D");
        
                
        
    }
}
