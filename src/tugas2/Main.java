/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author WINDOWS 11
 */
// Kelas utama (Main class)
public class Main {
    public static void main(String[] args) {
        // Membuat objek bolpoin
        AlatTulis AlatTulisMerah = new AlatTulis("Merah", 2500, "Bulat");

        // Memanggil metode getInfo
        AlatTulisMerah.getInfo();

        // Memanggil metode tulis
        AlatTulisMerah.tulis("Menggambar");

        // Memanggil metode isiTinta
        AlatTulisMerah.isiTinta(30);

        // Memanggil metode getInfo setelah mengisi tinta
        AlatTulisMerah.getInfo();
    }
}

