/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN4;

/**
 *
 * @author WINDOWS 11
 */
public class Luas {
   double r;
    double t;
    
    Luas(double k,double j){
        r=k;
        t=j;
    }
    double luas_o(double a){
        double L;
        L = 3.14*a*a;
        System.out.println("Luas Lingkaran: " + L);
        return L;
    }
        double volume_T(double c,double T){
        double Vol;
        Vol = 3.14*c*c*T;
        System.out.println("Luas Tabung adalah: " + Vol);
        return Vol;
        }
}
