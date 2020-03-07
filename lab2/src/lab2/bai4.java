/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author MR VUONG
 */
public class bai4 {
    public static void main(String[] args) {
		int q;
		System.out.println("1.Giai phuong trinh bac 1");
		System.out.println("2.Giai phuong trinh bac 2");
		System.out.println("3.Tinh tien dien");
		System.out.println("4.Thoat chuong trinh");
		Scanner sc = new Scanner(System.in);
		q= sc.nextInt();
		bai4 l = new bai4();
		if (q==1)
		{
			
			l.giaiPTB1();
		}
		else 
		if(q==2)
		{
			
			l.giaiPTB2();
		}
		else
		if(q==3)
		{
			
			l.tiendien();
		}
		else
		{
			System.exit(0);
		}
	}
	public void giaiPTB1()
	 {
			int a,b;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("a =");
			a = sc.nextInt();
			System.out.println("b =");
			b = sc.nextInt();
			if (a==0)
			{
				if (b==0)
					System.out.println("PT VSN");
				else 
					System.out.println("PT VN");
			}
			else 
				System.out.println("PT co nghiem= " + (float)-b/a);
		}

	
    public void giaiPTB2()
    {
    int a,b,c;
	float delta,x1,x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("a =");
		a = sc.nextInt();
		System.out.println("b =");
		b = sc.nextInt();
		System.out.println("c =");
		c = sc.nextInt();
		if (a==0)
		{
			if (b==0)
			{
				if(c==0)
				{
					System.out.println("PT VSN");
				}
				
			
			else 
			{
				System.out.println("PT VN");
			}
			}
		else 
		{
			System.out.println("PT co nghiem= " + (float)-b/a);	
		}
		}
		else
		{
			delta=b*b-4*a*c;
			if (delta<0)
			{
				System.out.println("PT bac 2 VN");
			}
			else 
			if (delta<0)
			{
			   System.out.println("Phuong trinh co 2 nghiep kep x1=x2=%.1f " + (float)((-b)/(2*a)));
			}
			   else 
			   {
			   	x1=(float)(-b+Math.sqrt(delta))/2*a;
			   	x2=(float)(-b-Math.sqrt(delta))/2*a;
			    System.out.println("PT co nghiem phan biet: x1 =%.1f va x2= %.1f" +x1+ x2  );
			   
		       }
			   }
	}
    public void tiendien()
    {
		int tien,sodien;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so dien =");
		sodien = sc.nextInt();
		if(sodien<50)
		{
			tien = sodien*1000;
		}
		else 
		{
			tien=50*1000+(sodien-50)*1200;
		}
		System.out.println("So tien : "+ tien);
	}
	

    
}
