/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumOOP;

/**
 *
 * @author WINDOWS 11
 */
public class Kos extends Gedung{
    //Atribut
    String penghuni, kamar, kasur, lemari, kamarMandi, tglMasuk; //Mendeklarasikan setiap Variabel
    int byrKos,total,jumlahAnk; //Mendeklarasikan setiap Variabel
    
    //Konstruktor
    void dataMasuk(int Masuk){
    this.jumlahAnk = Masuk; //Mengembalikan nilai Masuk
    }
    void dataPenghuni(String Penghuni){
    this.penghuni = Penghuni; //Mengembalikan nilai Pengguni
    }
    void dataKamar(String Kamar){
    this.kamar = Kamar; //Mengembalikan nilai Kamar
    }
    void dataKasur(String Kasur){
    this.kasur = Kasur; //Mengembalikan nilai Kasur
    }
    void dataLemari(String Lemari){
    this.lemari = Lemari; //Mengembalikan nilai Lemari
    }
    void dataKamarMandi(String KamarMandi){
    this.kamarMandi = KamarMandi; //Mengembalikan nilai Kamar Mandi
    }
    void dataTglMasuk(String TglLogin){
    this.tglMasuk = TglLogin; //Mengembalikan nilai TglLogin
    }
    void dataBayar(int BayarKos){
    this.byrKos = BayarKos; //Mengembalikan nilai BayarKos
    } 
    String cetakPenghuni(){
        return penghuni; //Mengembalikan nilai penghuni
    }
    String cetakKamar(){
        return kamar; //Mengembalikan nilai kamar
    }
    String cetakKasur(){
        return kasur;  //Mengembalikan nilai Kasur
    }
    String cetakLemari(){
        return lemari; //Mengembalikan nilai Lemari
    }
    String cetakKamarMandi(){
        return kamarMandi; //Mengembalikan nilai Kamar Mandi
    }
    String cetakTglMasuk(){
        return tglMasuk; //Mengembalikan nilai TglLogin
    }
    int cetakBayar(){
        return byrKos; //Mengembalikan nilai BayarKos
    }
    int cetakMasuk(){
        return jumlahAnk; //Mengembalikan nilai JumlahAnk
    }
    String cetaknama_kos(){
        return nama_kos; //Mengembalikan nilai nama_kos
    }
    String cetakalamat_kos(){
        return alamat_kos; //Mengembalikan nilai alamat_kos
    }
    
    //method
    int Pemasukan (){
        total = jumlahAnk*byrKos;
        return total; //Mengembalikan nilai total
    }
}
