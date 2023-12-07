/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumOOP;

/**
 *
 * @author WINDOWS 11
 */
public class kendaraan1 {
    
    String nama, warna, pabrikan;
    int speed;
    
    public kendaraan1(){
    this.nama = "vios";
    this.warna = "Silver";
    this.pabrikan = "Toyota";
    this.speed = 200;
}
    
    void kendaraanMaju(){
        System.out.println(" Berjalan Maju");
    }
    void kendaraanMundur(){
        System.out.println(" Berjalan Mundur");
    }
    void kendaraanBerhenti(){
        System.out.println(" Berjalan Berhenti");
    }
}
