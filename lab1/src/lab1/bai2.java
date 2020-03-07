/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
		int dai,rong , dientich,chuvi,canhnhonhat;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		dai = sc.nextInt();
		System.out.println("nhap chieu rong: ");
		rong = sc.nextInt(); 
		chuvi= (dai+rong)*2;
		System.out.println("chu vi =" + "(" + dai + "+" + rong + ")" + "*" + 2 + "=" + chuvi);
		dientich = dai * rong;
		System.out.println("dien tich" + "="+ dai+"*"+ rong +"="+ dientich  );
		canhnhonhat = Math.min(dai, rong);
		System.out.println("canh nho nhat : "+ canhnhonhat);
	}


    
}
