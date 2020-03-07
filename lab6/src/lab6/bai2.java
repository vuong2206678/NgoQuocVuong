/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MR VUONG
 */
public class bai2 {
    private static boolean isNhap;
    public static void main(String[] args) {
        List<SanPham> arrSanPham = new ArrayList<>();
            Scanner s = new Scanner(System.in);
            boolean is=true;
            String input="";
            while (isNhap)
            {
             System.out.println("Ban co muon nhap khong?");
             input = String.valueOf(s.nextLine());
             if(input.equalsIgnoreCase("N"))
                     {
                      isNhap= false;
                      break;
                     }
                     else if (input.equalsIgnoreCase("Y")) {
                         
                        SanPham sp = new SanPham();
                        System.out.println("Moi ban nhap: Ten, Hang, Gia"); 
                        sp.setName(String.valueOf(s.nextLine()));
                        sp.setComp(String.valueOf(s.nextLine()));
                        sp.setPrice (Double.parseDouble (s.nextLine()));
                        arrSanPham.add(sp);
                             }
                        }

for(SanPham sp : arrSanPham){

        if (sp.getComp().equalsIgnoreCase ("Nokia")){

        System.out.println("san pham Nokia");
        String kq = sp.Xuat();
        System.out.printf("s",kq);
            }
        }
    }

   
}
