/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author MR VUONG
 */
public class SanPham {
    private String name;
    private String comp;
    private double price;
    
    public SanPham(String name,String comp,double price)
    {
        this.name = name;
        this.comp= comp;
        this.price= price;
    }
    public String Xuat()
    {
        return "thong tin SP: "+ this.name+";"+this.comp+";"+this.price;
    }
    public SanPham(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

   
    
}
