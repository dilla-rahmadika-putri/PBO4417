/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10.praktek;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ASUS
 */
public class BeratBadan extends Frame implements ActionListener {
    Label l1,l2,l3,l4,l5;
    TextField tf1,tf2,tf3,tf4;
    Button b1;
    
    BeratBadan(){
        Frame frame = new Frame("Menghitung BMI");
        l1 = new Label("NIM: ");
        l1.setBounds(50, 50, 100, 20);
        l2 = new Label("NAMA: ");
        l2.setBounds(50, 100, 100, 20);
        l3 = new Label("BERAT: ");
        l3.setBounds(50, 100, 100, 20);
        l4 = new Label("TINGGI: ");
        l4.setBounds(50, 100, 100, 20);
        l5 = new Label();
        l5.setBounds(50, 200, 200, 20);
        
        tf1 = new TextField();
        tf1.setBounds(150, 100, 150, 20);
        tf2 = new TextField();
        tf2.setBounds(150, 100, 150, 20);
        tf3 = new TextField();
        tf3.setBounds(150, 100, 150, 20);
        tf4 = new TextField();
        tf4.setBounds(150, 100, 150, 20);
        
        b1 = new Button("HITUNG");
        b1.setBounds(50, 100, 100, 20);
        b1.addActionListener(this);
        
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(tf4);
        frame.add(b1);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    
    }
    public void actionPerformed(ActionEvent e){
            String s2 = tf1.getText();
            String s3 = tf2.getText();
            double b = Double.parseDouble(tf3.getText());
            double t = Double.parseDouble(tf4.getText());
            double hasil = 0;
            
            if(e.getSource()== b1){
                hasil = b/(t*t/100);
                if((hasil >= 18.5) && (hasil <= 24.9)){
                    l5.setText("Berat badan normal");
                }
                else{
                    l5.setText("Berat badan obesitas");
            }
        }
    }    
     public static void main(String[]args){
       new BeratBadan();
     }
}
