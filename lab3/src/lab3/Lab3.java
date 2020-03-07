/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        int a,i;
		System.out.println("nhap so : ");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		boolean SNT = true;
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				SNT = false;
				break;
			}
			i++;
		}
		if(SNT == true)
		{
			System.out.println("La so nguyen to ");
		}
		else
		{
			System.out.println("Khong phai la so nguyen to");
		}

    }
    
}
