/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK5;

/**
 *
 * @author WINDOWS 11
 */
public class Tunjangan {
    public double hittungTunjangan(int gajiDasar){
        return gajiDasar* 0.1;
    }
public double hittungTunjangan(int gajiDasar, int tahunPengalaman){
    double tunjangan = gajiDasar * 0.1;
    if(tahunPengalaman >= 5){
        tunjangan += 100000;
    }
    return tunjangan;
}

public double hitungTunjanag(int gajiDasar, int tahunPengalaman, String jenisPekerjaan){
    double tunjangan = gajiDasar * 0.1;
    if(tahunPengalaman>= 5){
        tunjangan += 300000;
        }
    if (jenisPekerjaan.equalsIgnoreCase("manager")){
        tunjangan += 500000;
    }
    return tunjangan;
}

    double hitTunjangan(int i, int i0, String manager) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

