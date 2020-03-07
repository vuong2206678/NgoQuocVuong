/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;


public class bai4 {
    private String tenSP;
	private double dongia;
	private double giamgia;
	public bai4()
	{
	}
	public bai4(String t, double d, double g)
	{
		this.tenSP=t;
		this.dongia=d;
		this.giamgia=g;
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
