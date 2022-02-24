/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keliling.balok;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class KelilingBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // write your code here
        Scanner input = new Scanner(System.in);
        Balok b = new Balok();

        System.out.println("     KELILING BALOK");
        System.out.println("-------------------------");
        System.out.println();
        
            System.out.print("Masukkan Panjang : ");
            b.p = input.nextInt(); //menginputkan nilai Panjang
            System.out.print("Masukkan Lebar   : ");
            b.l = input.nextInt(); //menginputkan nilai Lebar
            System.out.print("Masukkan Tinggi  : ");
            b.t = input.nextInt(); //menginputkan nilai Tinggi
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("Keliling Balok: "+b.Keliling());
            System.out.println("-------------------------");
        
    }
}