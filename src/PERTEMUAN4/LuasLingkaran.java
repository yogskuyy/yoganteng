/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN4;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 11
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        
        // Membaca jari-jari dari pengguna
        double jariJari = input.nextDouble();
        
        // Menghitung luas lingkaran
        double luasLingkaran = 3.14 * jariJari * jariJari;
        
        // Menampilkan hasil
        System.out.println("Luas lingkaran adalah: " + luasLingkaran);
        
        // Menutup objek Scanner
        input.close();
    }   
}
