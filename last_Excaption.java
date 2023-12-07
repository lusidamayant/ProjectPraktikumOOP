/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Lusi Damayanti
 */
public class last_Excaption {
    public static void main(String []args){
        try {
            int a,b,hasil;
            
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("===program pembagian===");
            System.out.println("masukkan angka 1=");
            a =Integer.parseInt(Keyboard.next());
            System.out.println("masukkan angka 2");
            b = Integer.parseInt(Keyboard.next());
            hasil=a/b;
            System.out.println();Integer.toString(hasil);
        }catch (ArithmeticException c){
            JOptionPane.showMessageDialog(null,"Nilai pembagi tidak boleh o!!","warning", 2 );
        }catch (NumberFormatException d){
            JOptionPane.showMessageDialog(null,"input yang anda masukkan huruf bukan angka ","warning ",2);
        }finally{
            System.out.println("Terima kasih telah menjalangkan program ");
            
            
        }
    }
    
}
