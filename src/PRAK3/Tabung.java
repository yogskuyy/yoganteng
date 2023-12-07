/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK3;

/**
 *
 * @author WINDOWS 11
 */
public class Tabung extends Lingkaran{
    int t;
    double volume, luasPermukaan;

public Tabung(){
    t = 20;
} 
void keterangan(){
    Deskripsi();
    System.out.println("Menghitung Volume Tabung");
    }
double HitVolumeTabung(){
    volume = ((phi*r*r)*t);
    return volume;
}
}

