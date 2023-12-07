/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN4;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) { 
        //Lingkaran
        Luas bulat = new Luas(10,0);
        bulat.luas_o(bulat.r);
        
        //Tabung
        Luas tabung = new Luas(2,2);
        tabung.volume_T(tabung.r,tabung.t);
        }
}
