/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Scanner;
public class SinhVienIT extends SinhVienPoLy{
    private double diemJava;
    private double diemHTML;
    private double diemCSS; 
@Override
public double getDiemTB()
{
    return (2*diemJava+ diemHTML+ diemCSS)/4; 
} 
@Override
public void nhap() {
Scanner s = new Scanner(System.in);
    System.out.println("moi ban nhap SV IT: ten; Nganh; DiemJava; DiemHTML; DiemCss");
    super.setHoTen(String.valueOf(s.nextLine()));
    super.setNganh(String.valueOf(s.nextLine()));
    this.diemJava = Double.parseDouble(s.nextLine());
    this.diemHTML= Double.parseDouble(s.nextLine());
    this.diemCSS = Double.parseDouble(s.nextLine());
}
}
