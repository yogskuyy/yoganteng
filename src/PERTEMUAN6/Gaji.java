/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN6;

/**
 *
 * @author WINDOWS 11
 */
public class Gaji {
    int gajipokok, gajitotal, hrlembur, hrhadir;
    public Gaji(){
      gajipokok = 2500000;
      hrlembur = 50000;
    }
    int hitgaji (){
        gajitotal = gajipokok;
        return gajitotal;
    }
    int hitgaji(int jmlhrlembur){
        gajitotal = gajipokok + (hrlembur*jmlhrlembur);
        return gajitotal;
    }
    int hitgaji(int jmlHariLembur, int jmlhadir){
        gajitotal = gajipokok + (hrlembur * jmlHariLembur)+(jmlhadir*hrhadir);
        return gajitotal;
    }
}

 
