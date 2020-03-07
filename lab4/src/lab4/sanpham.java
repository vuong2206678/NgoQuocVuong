/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;


class sanpham {
    private String ten;
			private double gia;
			private double giamgia;
			public sanpham()
			{
			}
			public sanpham(String t, double g, double giam)
			{
				this.ten=t;
				this.gia=g;
				this.giamgia=giam;
			}
			public double getThueNhapKhau()
			{
				double tnk=this.gia*0.1;
				return tnk;
			}
			public void nhap()
			{
				System.out.println("nhap ten,gia,giamgia");
				Scanner sc=new Scanner(System.in);
				this.ten= sc.nextLine();
				this.gia= sc.nextDouble();
				sc.nextLine();
				this.giamgia= sc.nextDouble();
			}
			public void xuat()
			{
				System.out.printf("Ten: %s; Gia: %f; Giam Gia: %f; Thue Nhap Khau:%f ",
						this.ten,this.gia,this.giamgia,this.getThueNhapKhau());
			}


    
}
