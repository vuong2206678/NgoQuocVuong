/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;
public class SoThuc {
    private ArrayList<Double> list;
    public void Nhap()
    {
        list=new ArrayList<>();
        Scanner s = new Scanner (System.in);
        String qd;
        boolean yn=true;
        while (yn){
            System.out.println(" moi nhap so: ");
            String x = s.nextLine();            
            list.add(Double.parseDouble(x));
            qd = s.nextLine();
            switch(qd){
                case "Y":
                    yn=true;
                    break;
                case "N":
                    yn=false;
                    break;
                default:
                    System.out.println("hay nhap lai 1 so: ");
                            
            }    }
    }
    public void Xuat()
    {
        for(Double x :list)
        {  
            System.out.println(x);
        }
    }

    
}
    
