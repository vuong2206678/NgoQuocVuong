/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;


public class bai4 {
    public static void main(String[] args) {
		int a,b,c,delta;
		float candelta;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a: ");
		a=sc.nextInt();
		System.out.println("nhap b: ");
		b=sc.nextInt();
		System.out.println("nhap c: ");
		c=sc.nextInt();
		delta = b*b-4*a*c;
		candelta = (float)Math.sqrt(delta);
		System.out.println("Can delta = "+ candelta);
	}

    
}
