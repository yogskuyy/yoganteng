/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumOOP;

/**
 *
 * @author WINDOWS 11
 */
public class KeuanganKos {
    public static void main(String[] args) {
        //Objek baru
        Kos VIP = new Kos();
        Kos Reg = new Kos();
        
        //Objek 1
        VIP.dataMasuk(2);
        VIP.dataPenghuni("Raka Wahyu Prayoga");
        VIP.dataKamar("Good Quality(VIP)");
        VIP.dataKasur("Spring Bed");
        VIP.dataLemari("Lemari 2 Pintu + Cermin");
        VIP.dataKamarMandi("Kamar Mandi Dalam");
        VIP.dataTglMasuk("9 September 2022");
        VIP.dataBayar(2500000);
        
        Reg.dataMasuk(3);
        Reg.dataPenghuni("Romlah");
        Reg.dataKamar("Low Quality(Reg)");
        Reg.dataKasur("Kasur Kapuk");
        Reg.dataLemari("Lemari Plastik");
        Reg.dataKamarMandi("Kamar Mandi Luar");
        Reg.dataTglMasuk("9 September 2022");
        Reg.dataBayar(400000);
           
        System.out.println("Penghuni VIP");
        System.out.println("Jumlah Penghuni Masuk   : "+ VIP.cetakMasuk());
        System.out.println("Nama                    : "+ VIP.cetakPenghuni());
        System.out.println("Jenis Kamar             : "+ VIP.cetakKamar());
        System.out.println("Jenis Kasur             : "+ VIP.cetakKasur());
        System.out.println("Jenis Lemari            : "+ VIP.cetakLemari());
        System.out.println("Fasilitas               : "+ VIP.cetakKamarMandi());
        System.out.println("Tanggal Login           : "+ VIP.cetakTglMasuk());
        System.out.println("Harga Kamar             : "+ VIP.cetakBayar());
        System.out.println("Total Pemasukan         : "+ VIP.Pemasukan()+"\n");
        
        System.out.println("Penghuni Regular");
        System.out.println("Jumlah Penghuni Masuk   : "+ Reg.cetakMasuk());
        System.out.println("Nama                    : "+ Reg.cetakPenghuni());
        System.out.println("Jenis Kamar             : "+ Reg.cetakKamar());
        System.out.println("Jenis Kasur             : "+ Reg.cetakKasur());
        System.out.println("Jenis Lemari            : "+ Reg.cetakLemari());
        System.out.println("Fasilitas               : "+ Reg.cetakKamarMandi());
        System.out.println("Tanggal Login           : "+ Reg.cetakTglMasuk());
        System.out.println("Harga Kamar             : "+ Reg.cetakBayar());
        System.out.println("Total Pemasukan         : "+ Reg.Pemasukan());
    } 
}
