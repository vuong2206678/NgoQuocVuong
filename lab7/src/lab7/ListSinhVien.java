/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.List;


public class ListSinhVien<T>{
    List<SinhVienPoLy> ls = new ArrayList<>();
    public void nhapListSV(T sv)
    {
        ls.add((SinhVienPoLy) sv);
    }
    public void xuatListSV() 
    { 
        for(SinhVienPoLy sv: ls) 
        { 
            sv.xuat();
        }
    } 
        public void xuatListHLGioi() 
        {
            for(SinhVienPoLy sv: ls) 
            {
                if(sv.getHocLuc().equalsIgnoreCase("Gioi"))
                {
                    System.out.println("Sinh vien co hoc luc gioi");
                    sv.xuat(); 
                }
            }
        }
}
