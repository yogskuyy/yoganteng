/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK5;

/**
 *
 * @author WINDOWS 11
 */
public class staffmarketing extends karyawan{
        public staffmarketing(double gajidasar){
        super(gajidasar);
    }
    @Override
    public double hittunjangan(){
        return gajidasar*0.1+200000;
    }
    
}
