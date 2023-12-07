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
import java.util.Scanner;
public class throwExcaption {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int jmlkaki;
        System.out.println("Berapa jumlah kaki kerbau");
        try{
            System.out.println("jumlah kaki=");
            jmlkaki = input.nextInt();
            if(jmlkaki!=4){
                throw new NullPointerException("terjadi kesalahan nih!!");
            }else{
                System.out.println("benar jumlah kaki kerbau 4");
            }
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        
        
    }
    
}
