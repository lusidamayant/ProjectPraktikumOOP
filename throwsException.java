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
public class throwsException {
    static void Error()throws ClassNotFoundException{
        System.out.println("ada yang eror nih");
        throw new ClassNotFoundException("eror sudah saya tangkap");
        
    }
    public static void main(String[]args){
        try{
            throwsException.Error();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
