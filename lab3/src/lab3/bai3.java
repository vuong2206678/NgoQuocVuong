/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;


public class bai3 {
    public static void main(String[] args) {
		int i,j,tong,k;
        int dem=0;
		float tbc;
		System.out.println("Nhap mang: ");
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for (i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		Arrays.sort(a);
		System.out.println("Sap xep");
		for (j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		System.out.println("Min"+a[0]);
		tong=0;
		for(k=0;k<a.length;k++)
		{
			if(a[k]%3==0)
			{
				tong = tong +a[k];
				dem++;
			}
		}
		tbc=(float)tong/dem;
		System.out.println("Trung binh cong chia het cho 3: "+tbc);
	}

    
}
