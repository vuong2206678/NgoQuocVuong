/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;


public class bai4 {
    public static void main(String[] args) {
		int i,j;
		System.out.println("Nhap: ");
		Scanner sc = new Scanner(System.in);
		String[] hoten=new String[5];
		String[] hocluc=new String[5];
		int [] diem=new int[5];
		for(i=0;i<hoten.length;i++)
		{
			hoten[i]=sc.nextLine();
			diem[i]=sc.nextInt();
			if(diem[i]<5)
			{
				hocluc[i]="Yeu";
			}
			else if(diem[i]>=5 && diem[i]<6.5)
			{
				hocluc[i]="TB";
			}
			else if(diem[i]>=6.5 && diem[i]<8)
			{
				hocluc[i]="Kha";
			}
			else if(diem[i]>=8)
			{
				hocluc[i]="Gioi";
			}
		}
		for(j=0;j<hoten.length;j++)
		{
			System.out.printf("Ho ten: %s;diem: %d;hoc luc :%s",hoten[j],diem[j],hocluc[j]);
			System.out.println();
		}
		for(i=0;i<hoten.length;i++)
		{
			for(j=i+1;j<hoten.length;j++)
			{
				if(diem[i]>diem[j])
				{
					int t1=diem[i];
					diem[i]=diem[j];
					diem[j]=t1;
					String t2=hoten[i];
					hoten[i]=hoten[j];
					hoten[j]=t2;
					String t3=hocluc[i];
					hocluc[i]=hocluc[j];
					hocluc[j]=t3;
				}
			}
		}
	}

}
