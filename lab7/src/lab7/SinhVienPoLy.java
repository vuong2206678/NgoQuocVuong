/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

abstract public class SinhVienPoLy{
private String hoTen;
private String nganh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

abstract public double getDiemTB();
abstract public void nhap();
public String xuat() 
{ 
    return "Ho ten: "+this.hoTen+"; Nganh: "+this.nganh+"; Hoc luc: "+this.getHocLuc();
}
    public String getHocLuc() { 
String xepLoai="";
if(this.getDiemTB()<5)
{
    xepLoai = "Yeu"; 
} 
else if(this.getDiemTB()<6.5)
{
    xepLoai = "TB";
} 
else if(this.getDiemTB()<8)
{
    xepLoai = "Kha";
}  
else {
    xepLoai= "Gioi";
}
return xepLoai;
    }
}
