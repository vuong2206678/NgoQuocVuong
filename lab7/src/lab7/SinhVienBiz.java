/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Scanner;

public class SinhVienBiz extends SinhVienPoLy{
    private double diemMKT;
    private double diemSale; 
@Override
public double getDiemTB()
{
    return (2*diemMKT+diemSale)/3;
}  
@Override
public void nhap()
{
    Scanner s = new Scanner(System.in);
    System.out.println("Mo_ ban nhap SV IT: Ten; Nganh; DiemMKT; DiemSale");
    super.setHoTen(String.valueOf(s.nextLine()));
    super.setNganh(String.valueOf(s.nextLine()));
    this.diemMKT = Double.parseDouble(s.nextLine());
    this.diemSale= Double.parseDouble(s.nextLine());  
}
}
