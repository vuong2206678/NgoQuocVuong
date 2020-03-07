
package lab2;

import java.util.Scanner;


public class Lab2 {

    public static void main(String[] args) {
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
    
}
