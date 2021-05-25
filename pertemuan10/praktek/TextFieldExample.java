/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10.praktek;
import java.awt.*;
/**
 *
 * @author ASUS
 */
public class TextFieldExample {
    public static void main(String[]args){
        Frame f = new Frame("Welcome Dilla");
        TextField t1,t2;
        t1 = new TextField("Dilla Rahmadika");
        t1.setBounds(50, 100, 200, 30);       
        t2 = new TextField("A11.2019.11741");
        t2.setBounds(50, 150, 200, 30);
        
        f.add(t1);
        f.add(t2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }   
}
