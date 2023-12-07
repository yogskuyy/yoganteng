/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK5;

/**
 *
 * @author WINDOWS 11
 */
public class maintunjanganKaryawan {
    public static void main(String[] args) {
        Manager manager = new Manager(8000000);
        staffmarketing staff= new staffmarketing(4500000);
        
        System.out.println("Tunjangan Manager : "+manager.hittunjangan());
        System.out.println("Tunjangan staff marketing : "+staff.hittunjangan());
    }
}
