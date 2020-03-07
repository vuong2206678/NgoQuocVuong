/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

class Product {
    private String tenSP;
		private double dongia;
		private double giamgia;
		public Product()
		{
		}
		public Product(String t, double d, double g)
		{
			this.tenSP=t;
			this.dongia=d;
			this.giamgia=g;
		}
		public double getThueNhapKhau()
		{
			double tnk=this.dongia*0.1;
			return tnk;
		}
		public void nhap()
		{
			System.out.println("Nhap thong tin ");
			Scanner sc=new Scanner(System.in);
			this.tenSP= sc.nextLine();
			this.dongia= sc.nextDouble();
			sc.nextLine();
			this.giamgia= sc.nextDouble();
			
		}
		public void xuat()
		{
			System.out.printf("Ten: %s; Gia: %f; Giam Gia: %f ",this.tenSP,this.dongia,this.giamgia);
		}
		public String getTenSP()
		{
			return this.tenSP;
		}
		public void setTenSP(String t)
		{
			this.tenSP = t;
		}
		public double getDonGia()
		{
			return this.dongia;
		}
		public void setDongia(double d)
		{
			this.dongia = d;
		}
		public double getgiamGia()
		{
			return this.giamgia;
		}
		public void setgiamGia(double g)
		{
			this.giamgia = g;
		}

    
}
