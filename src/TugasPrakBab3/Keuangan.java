/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakBab3;

/**
 *
 * @author ASUS
 */
public class Keuangan extends Kos{
    //Atribut
    protected int lantai, anak1,anak2;
    private int air, listrik, wifi;
    public double perawatan;
    
    //konstruktor setter
    public void SetAnakVIP(int anakVIP){
        this.anak1 = anakVIP;
    }
    public void SetAnakReg(int anakReg){
        this.anak2 = anakReg;
    }
    public void setAir(int Air){
        this.air = Air;
    }
    public void setListrik(int Listrik){
        this.listrik = Listrik;
    }
    public void setWifi(int Wifi){
        this.wifi = Wifi;
    }
    public void setPerawatan(double perawatan){
        this.perawatan = perawatan;
    }
    
    //method getter
    public int getVIP(){
        return anak1;
    }
    public int getReg(){
        return anak2;
    }
    public int PendapatanVIP(){
        return anak1*2500000;
    }
    public int PendapatanReg(){
        return anak2*400000;
    }
    public int getuangAir(){
        return air = TotalAnak()*20000;
    }
    public int getuangListrik(){
        return listrik*143000;
    }
    public int getuangWifi(){
        return wifi = 300000*lantai;
    }
    public int totalUang(){
        return PendapatanReg()+PendapatanVIP();
    }
    public int TotalAnak(){
        return getcetakMasuk()+anak1+anak2;
    }
    public double getPerawatan(){
        return perawatan;
    }
    
    //method
    public int uangAir(){
        return air ;
    }
    public int uangListrik(){
        return listrik;
    }
    public int uangWifi(){
        return wifi;
    }
    public double SisaSaldo(){
        return totalUang() - getPerawatan();
    }
    
    //abstract method
    public double Perawatan(){
        return perawatan = 500000;
    }
    public double Perawatan1(){
        return perawatan = lantai * 3000000;
    }
    public double Perawatan2(){
        return perawatan = 1500000 + TotalAnak()*200000;
    }
}
