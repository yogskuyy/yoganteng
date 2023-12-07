/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN6;

/**
 *
 * @author WINDOWS 11
 */
public class GajiSek extends hitGaji{
    int lembur;
    
    public GajiSek() {
        gajiPokok = 3000000;
        lembur = 50000;
    }
    @Override
    int Gaji(){
    return (gajiPokok + (jmlLembur*lembur));
    }
}
