/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

public class Vuong extends ChuNhat
{
    private double canh;
    public Vuong(double canh) 
    { 
        super(canh,canh);
        this.canh=canh;
    }
    
    @Override public double getChuVi()
    {
        return this.canh * 4;
    } 
    @Override public double getDienTich()
    {
     return this.canh * this.canh;
    } 
} 
