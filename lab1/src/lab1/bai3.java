/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author MR VUONG
 */
public class bai3 {
    public static void main(String[] args) {
		int canh,thetich;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap canh: ");
		canh = sc.nextInt();
		thetich=canh*canh*canh;
		System.out.println("The tich lap phuong = " + canh + "*" +canh+ "*"+canh +"="+ thetich );
		
	}

    
}
