/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK5;

/**
 *
 * @author WINDOWS 11
 */
public class Manager extends karyawan{
    public Manager(double gajidasar){
        super(gajidasar);
    }
    @Override
    public double hittunjangan(){
        return gajidasar*0.2+400000;
    } 
}
