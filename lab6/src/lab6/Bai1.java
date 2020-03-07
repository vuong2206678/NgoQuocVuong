/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author MR VUONG
 */
public class Bai1 {
     public static void main(String[] args) {
        String fullname ="";
        Scanner s = new Scanner (System.in);
         System.out.println("moi ban nhap ho va ten: ");
         fullname= String.valueOf(s.nextLine());
         int KyTuTrangDauTien = fullname.indexOf(" ");
         int KyTuTrangCuoiCung= fullname.lastIndexOf("");
         String ho= 
                 fullname.substring(0,KyTuTrangDauTien).toUpperCase();
         String ten=
                fullname.substring(KyTuTrangCuoiCung,fullname.length()).toUpperCase();
         String dem=
                fullname.substring(KyTuTrangCuoiCung,fullname.length()-ten.length());
         System.out.printf("ho ten: %s %s %s",ho, dem, ten);
    }
    
}
