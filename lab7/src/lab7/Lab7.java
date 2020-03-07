/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

public class Lab7 {

    public static void main(String[] args) {
        ChuNhat cn = new ChuNhat(7,5);
        ChuNhat v = new Vuong(4);
        double chuviCN = cn.getChuVi();
        double dientichCN = cn.getDienTich(); 
        double chuviV = v.getChuVi();
        double dientichV = v.getDienTich(); 
        System.out.printf("Hinh chu nhat: chu vi: %f; dien tich: %f",chuviCN, dientichCN); 
        System.out.println("");
        System.out.printf("Hinh Vuong: chu vi: %f; dien tich: %f",chuviV, dientichV); 
        
        ListSinhVien<SinhVienIT> svit = new ListSinhVien<>();
        SinhVienIT sv = new SinhVienIT();
        sv.nhap();
        svit.nhapListSV(sv);
        svit.xuatListSV();
        svit.xuatListHLGioi(); 
        ListSinhVien<SinhVienBiz> svBiz = new ListSinhVien<>();
        SinhVienBiz svb = new SinhVienBiz();
        svb.nhap();
        svBiz.nhapListSV(svb);
        svBiz.xuatListSV();
        svBiz.xuatListHLGioi(); 

        
    } 
 }
    
