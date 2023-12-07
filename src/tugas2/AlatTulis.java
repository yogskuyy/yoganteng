/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author WINDOWS 11
 */
class AlatTulis {
    // Atribut
    private String warna;
    private int tintaLevel;
    private String jenisUjung;

    // Konstruktor
    public AlatTulis(String warna, int tintaLevel, String jenisUjung) {
        this.warna = warna;
        this.tintaLevel = tintaLevel;
        this.jenisUjung = jenisUjung;
    }

    // Metode untuk menulis
    public void tulis(String teks) {
        if (tintaLevel > 0) {
            System.out.println("Fungsi: " + teks);
            tintaLevel--;
        } else {
            System.out.println("Tinta habis. Ganti bolpoin.");
        }
    }

    // Metode untuk mengisi ulang tinta
    public void isiTinta(int tambahanTinta) {
        if (tintaLevel + tambahanTinta <= 100) {
            tintaLevel += tambahanTinta;
            System.out.println("Tinta ditambahkan. Level tinta sekarang: " + tintaLevel);
        } else {
            System.out.println("Tintaa sudah digunakan (76%).");
        }
    }

    // Metode untuk mendapatkan info status bolpoin
    public void getInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Harga: " + tintaLevel);
        System.out.println("Jenis Ujung: " + jenisUjung);
    }
}


