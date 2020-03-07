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
public class bai2 {
    public static void main(String[] args) {
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

    
}
