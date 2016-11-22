/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

import java.util.Scanner;

/**
 *
 * @author Otik
 */
public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan bilangan yang mau di tambahkan :");
        int a = sc.nextInt();
        System.out.print("Masukan jumlah perulangan :");
        int b = sc.nextInt();
        
        int hasil=0;
        String angka="";
        
        for (int i = 0; i <= b; i++) {
          hasil += a;
      angka = Integer.toString(a);
      System.out.println(angka);
        }
        System.out.println("------ +");
        System.out.println(hasil);

    }
}
