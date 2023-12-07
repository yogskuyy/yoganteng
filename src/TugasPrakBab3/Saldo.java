/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakBab3;

/**
 *
 * @author ASUS
 */
public class Saldo extends Keuangan {
    private String ussername, pass,email,noRek, noHP;
    
    //konstruktor setter
    public void setdataUser(String Username){
        this.ussername = Username;
    }
    public void setdataPass(String Password){
        this.pass = Password;
    }
    public void setNoHP(String HP){
        this.noHP = HP;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNoRek(String Rek){
        this.noRek = Rek;
    }
    
    //method getter
    public String getdataUser(){
        return ussername;
    }
    public String getdatapass(){
        return pass;
    }
    public String getNoHP(){
        return noHP;
    }
    public String getEmail(){
        return email;
    }
    public String getRekening(){
        return noRek;
    }
    @Override
    public int totalUang(){
        return (20000000);
    }
}
