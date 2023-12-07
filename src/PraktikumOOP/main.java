/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumOOP;

/**
 *
 * @author WINDOWS 11
 */
public class main {
        public static void main(String[] args) {
        kendaraan1 mobil = new kendaraan1();
       
        System.out.println("Nama Kendaraan : " + mobil.nama);
        System.out.println("Warna Kendaraan : " + mobil.warna);
        System.out.println("Merek Kendaraan : " + mobil.pabrikan);
        System.out.println("Jumlah Roda : " + mobil.speed + "km/jm \n");
        System.out.println("Cara Kendaraan Bergerak : ");
        System.out.print("Saat Maju : " + mobil.nama);
        mobil.kendaraanMaju();
        System.out.print("Saat Mundur : " + mobil.nama);
        mobil.kendaraanMundur();
        System.out.print("Saat Berhenti : " + mobil.nama);
        mobil.kendaraanBerhenti();
        }
}
