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
public class DirençGerilimHesabı {
    public static void main(String[] args) {
        
        /*
        ADIM1 Basla
        ADIM2 Iletkenın dırencını al 
        ADIM3 Iletkenın akımını al 
        ADIM4 verilen değerlerle uçlarındakı gerilimi hesapla
        ADIM5 Bulunan gerilimi ekrana yansıt
        ADIM6 Bıtır
   
        */
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;      
        System.out.println("Lutfen ıletkenın dırencını gırınız");
        int Dırenc = input.nextInt() ;
        
        System.out.println("Lutfen ıletkenın akımını gırnız");
        int Akım = input.nextInt();
        
        double Gerilim = (double) Dırenc* Akım   ;
        System.out.println("Gerilim:"+Gerilim);
        
    }
}
