/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.S;

public class SinhVien {
    private String hoTen;
    private ArrayList<String>list= new ArrayList<>();;
    public void Nhap()
    {
        Scanner s = new Scanner (System.in);
        String qd;
        boolean yn=true;
        while (yn){
            System.out.println(" moi nhap ho ten: ");
            this.hoTen = s.nextLine();
            list.add(this.hoTen);
            qd = s.nextLine();
            switch(qd){
                case "Y":
                    yn=true;
                    break;
                case "N":
                    yn=false;
                    break;
                default:
                    System.out.println("hay nhap lai ho ten: ");
                            
            }
                    
        }
    }
    public void Xuat()
    {
        System.out.println("-------------");
        System.out.println("danh sach nhap: ");
        for(String x: list)
        {
            System.out.println(x);
        }
    }
    public void XuatDanhSachNgauNhien()
    {
        System.out.println("-------------");
        System.out.println("danh sach ngau nhien");
        Collections.shuffle(list);
        this.Xuat();
    }
    public void XuatDanhSachGiamDan()
    {
        System.out.println("----------");
        System.out.println("nhap ho ten muon xoa: ");
        Collections.shuffle(list);
        this.Xuat();
    }
    public void TimXoaHoTen()
    {
        System.out.println("---------");
        System.out.println("nhap ho ten muon xoa: ");
        Scanner s= new Scanner(System.in);
        this.hoTen=s.nextLine();
        for (String x:list)
        {
            if(x.equals(this.hoTen))
            {
                list.remove(x);
            }
        }
        this.Xuat();
    }
   
}
