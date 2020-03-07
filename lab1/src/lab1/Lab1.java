/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double diem;
		String ten;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten : ");
		ten = sc.nextLine();
		System.out.println("Nhap diem trung binh: ");
		diem= sc.nextDouble();
		System.out.println("diem : " + diem);
		System.out.println("ten : " + ten);
//
    }
    
}
