/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author WINDOWS 11
 */

public class Login {    
    //atribut
String username; 
String inputUser;     
String password;     
String hasilPencocokkan; 
         public Login() 
    { 
        password = "itnmalang"; 
             } 
         //method
    public void setUsername (String username) 
    { 
       this.username = username;  
    }      
   private String KoreksiPassword() 
    { 
        if(password.compareTo(inputUser)==0)
        { 
            hasilPencocokkan = "BENAR"; 
        }      
    else{ 
            hasilPencocokkan = "SALAH"; 
        } 
        return hasilPencocokkan; 
    }      
        public String Korpassword(){
      return KoreksiPassword(); 
        }
}




