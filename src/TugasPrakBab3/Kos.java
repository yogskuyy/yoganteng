/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakBab3;

/**
 *
 * @author ASUS
 */
public abstract class Kos {
    //Abstract Method
    public abstract double Perawatan();
    
    //Atribut
    protected String penghuni, kamar, kasur, lemari, kamarMandi, tglMasuk; //Mendeklarasikan setiap Variabel
    private int byrKos,jumlahAnk; //Mendeklarasikan setiap Variabel
    public int total;
    //Konstruktor
    public void dataMasuk(int Masuk){
    this.jumlahAnk = Masuk; //Mengembalikan nilai Masuk
    }
    public void dataPenghuni(String Penghuni){
    this.penghuni = Penghuni; //Mengembalikan nilai Pengguni
    }
    public void dataKamar(String Kamar){
    this.kamar = Kamar; //Mengembalikan nilai Kamar
    }
    public void dataKasur(String Kasur){
    this.kasur = Kasur; //Mengembalikan nilai Kasur
    }
    public void dataLemari(String Lemari){
    this.lemari = Lemari; //Mengembalikan nilai Lemari
    }
    public void dataKamarMandi(String KamarMandi){
    this.kamarMandi = KamarMandi; //Mengembalikan nilai Kamar Mandi
    }
    public void dataTglMasuk(String TglLogin){
    this.tglMasuk = TglLogin; //Mengembalikan nilai TglLogin
    }
    public void setdataByr(int bayar){
        this.byrKos = bayar;
    }
    public void setdatajumlahAnk(int jumlahAnk){
        this.jumlahAnk = jumlahAnk;
    }
    //method
    public void dataBayar(int BayarKos){
    this.byrKos = BayarKos; //Mengembalikan nilai BayarKos
    } 
    public String cetakPenghuni(){
        return penghuni; //Mengembalikan nilai penghuni
    }
    public String cetakKamar(){
        return kamar; //Mengembalikan nilai kamar
    }
    public String cetakKasur(){
        return kasur;  //Mengembalikan nilai Kasur
    }
    public String cetakLemari(){
        return lemari; //Mengembalikan nilai Lemari
    }
    public String cetakKamarMandi(){
        return kamarMandi; //Mengembalikan nilai Kamar Mandi
    }
    public String cetakTglMasuk(){
        return tglMasuk; //Mengembalikan nilai TglLogin
    }
    public int getcetakBayar(){
        return byrKos; //Mengembalikan nilai BayarKos
    }
    public int getcetakMasuk(){
        return jumlahAnk; //Mengembalikan nilai JumlahAnk
    }  
    //method hitungan
    public int Pemasukan (){
        total = jumlahAnk*byrKos;
        return total; //Mengembalikan nilai total
    }
}
