/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class inputjejarii {
   public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       System.out.println("Masukkan nilai jejari bulatan: ");
       double jejari = input.nextDouble();
       
       double luas = jejari * jejari * 3.14159;
       
       System.out.println("Luas bagi bulatan yang mempunyai jejari " +jejari + " adalah : " +luas);
   }
    
}
