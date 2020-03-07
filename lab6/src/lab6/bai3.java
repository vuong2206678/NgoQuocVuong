/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        List<SinhVien> arrSV = new ArrayList<SinhVien>();
        Scanner s = new Scanner(System.in);
        String partternEmail = "[a-zA-Z]@gmail.com"; 
        String partternPhone = "0[0-9]{9,10}";
        String partternCMT = "0123\\d{6}";
        boolean isNhap = true;
        String input = "";
        while( isNhap)
        {
            System.out.println("Ban co muon nhap Lieu khong?");
            input = String.valueOf(s.nextLine());
            if(input.equalsIgnoreCase("N"))
            {
                isNhap = false;
                break;
            }
            else if(input.equalsIgnoreCase("Y"))
            {
                System.out.println("Moi nhap TT: Ho ten, Email, SDT, CMT");
                SinhVien sv = new SinhVien();
                sv.setName(s.nextLine()) ;
                sv.setEmail(s.nextLine());
                sv.setPhone(s.nextLine());
                sv.setId(s.nextLine());
                if(!sv.getEmail().matches(partternEmail ))
                  {
                    System.out.println("Email khong dung dinh dang");
                  } 
                  
                if(!sv.getPhone().matches(partternPhone)) 
                { 
                    System.out.println("So dien thoai khong dung dinh dang"); 
                }
                if(!sv.getId().matches(partternCMT)) 
                { 
                    System.out.println("CMT khong dung dinh dang");  
                }
            }
        }
    }
}

    

