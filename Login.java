/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Lusi Damayanti
 */
public class Login {
    private String username,password;
    public String nama;
    public Login(){
        nama = "Lusi damayanti";
        username="lucy";
        password="lucy1234";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   boolean CekLogin(String Username,String password){
       if(username.equals(getUsername())&&password.equals(getPassword())){
          return true; 
       }
       return false;
   }
   
}
        
    
    
    
