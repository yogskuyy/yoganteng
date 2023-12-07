/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN6;

/**
 *
 * @author WINDOWS 11
 */
public class GajiMng extends hitGaji{
    int jmlhrlembur, hrlembur;
    
    public GajiMng(){
        gajiPokok = 3000000;
        hrlembur=50000;
        hadir = 15000;
    }
    @Override
    int Gaji(){
        return (gajiPokok +(hadir*jmlHadir)+(hrlembur*jmlhrlembur));
    }
}
