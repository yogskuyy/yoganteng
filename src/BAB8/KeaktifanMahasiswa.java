/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8interface.Menuutama;

import ProjectPrakBab3.*;

/**
 *
 * @author Computer 8
 */
public class KeaktifanMahasiswa extends Penilaian{
    int nilai_keaktifan;
    public KeaktifanMahasiswa(){
        this.nilai_keaktifan = 0;
    }
    @Override
    public double nilaiKeaktifan(){
        return((nilai_keaktifan * 0.1) + nilaiAkhir());
    }        
}
