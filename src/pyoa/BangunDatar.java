/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyoa;

/**
 *
 * @author WINDOWS 11
 */
public class BangunDatar {
    //atribut 
    double r, keliling, luas, volume, t; 
     
    //method 
    double hitLuas() 
    { 
        luas = 3.14 * r * r;          
        return luas; 
    }
    double hitKeliling() 
    { 
        keliling = 2 * 3.14 * r;         
        return keliling; 
    } 
    double hitVolume() 
    { 
        volume = 3.14 * r * t;         
        return volume; 
    } 
    //konstruktor 
    BangunDatar(){        
    r = 10;         
    t = 5; 
    } 
}