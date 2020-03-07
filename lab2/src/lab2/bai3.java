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
public class bai3 {
    public static void main(String[] args) {
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
