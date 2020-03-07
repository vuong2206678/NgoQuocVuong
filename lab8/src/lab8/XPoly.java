/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final public class XPoly { 
public static double sum(double...x)
{
    double tong=0;
    for(double a: x)
    {
        tong +=a;
    } 
    return tong;
} 
public static double min(double...x)
    { List<Double> ls = new ArrayList<>();
     for(double a: x)
     {
         ls.add(a);
     }
     Collections.sort(ls);
     return ls.get(0);
   } 
public static double max(double...x)
{
    List<Double> ls = new ArrayList<>();
    for(double a: x)
    {
        ls.add(a);
    }
    Collections.sort(ls);
    return ls.get(ls.size()-1);
}
public static String toUpperFirstChar(String str)
{
    String[] mangs = str.split(" ");
    String strMoi="";
    for(int i=0;i<mangs.length;i++)
    {
        char kytudau= mangs[i].charAt(0);
        char kyTuDauChuHoa= String.valueOf(kytudau).toUpperCase().charAt(0);
        mangs[i] = kyTuDauChuHoa+mangs[i].substring(1);
        strMoi += mangs[i]+" "; 
} 
    return strMoi; 

} 
}