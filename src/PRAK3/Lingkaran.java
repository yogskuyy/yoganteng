/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK3;

/**
 *
 * @author WINDOWS 11
 */
public class Lingkaran {
    //atribut
    int r ;
    double phi, luas;
    
    //condtruktor
    public Lingkaran(){
        r = 7;
        phi = 3.14;
    }
    
    //method
    void Deskripsi(){
        System.out.println("Ini adalah hasil menghitung");
    }
    
    //mehod untuk menghitung
    double hitLuasLingkaran(){
        luas =(phi*r*r);
        return luas;
  }
}
