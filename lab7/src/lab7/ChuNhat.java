/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author MR VUONG
 */
public class ChuNhat {
    private double rong;
    private double dai;
    public double getChuVi()
    {
        return (this.dai+this.rong)*2;
    }
    public double getDienTich()
    {
        return this.dai*this.rong;
    }
    public ChuNhat(double rong, double dai){
        this.rong=rong;
        this.dai=dai;
    }
}
