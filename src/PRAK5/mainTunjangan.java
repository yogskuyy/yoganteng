/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK5;

/**
 *
 * @author WINDOWS 11
 */
public class mainTunjangan {
    public static void main(String[] args){
        Tunjangan hitTunjangan = new Tunjangan();
        
        double tunjanganKaryawanBaru = hitTunjangan.hittungTunjangan(4000000);
        System.out.println("Tunjangan dari karyawa baru : "+ tunjanganKaryawanBaru);
        
        double tunjanganKaryawanLama = hitTunjangan.hittungTunjangan(6000000);
        System.out.println("Tunjangan dari karyawa lama : "+ tunjanganKaryawanLama);
        
        double tunjanganJabatan = hitTunjangan.hitTunjangan(9000000,3,"manager");
        System.out.println("Tunjangan dari pengalaman jabatan : "+ tunjanganJabatan);
    }
}
