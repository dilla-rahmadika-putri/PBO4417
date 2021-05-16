/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.teori;
import java.awt. *;
import java.awt.event. *;
/**
 *
 * @author ASUS
 */
public class AwtControlDemo {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    
    public AwtControlDemo(){
        prepareGUI();
    }
    
    private void prepareGUI(){
        mainFrame = new Frame("Contoh Java AWT");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
        
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void showEventDemo(){
        headerLabel.setText("Kontrol aksi berupa tombol");
        
        Button okButton = new Button("OK");
        Button submitButton = new Button("SUBMIT");
        Button cancelButton = new Button("CANCEL");
        
        okButton.setActionCommand("OK");
        submitButton.setActionCommand("SUBMIT");
        cancelButton.setActionCommand("CANCEL");
        
        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
        
        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);
        
        mainFrame.setVisible(true);
    }
    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if( command.equals("OK")){
                statusLabel.setText("Tombol ok berhasil diklik");
            }
            else if( command.equals("SUBMIT")){
                statusLabel.setText("Tombol submit berhasil diklik");
            }
            else{
                statusLabel.setText("Tombol cancel berhasil diklik");
            }
        }
    }
    public static void main(String[]args){
        AwtControlDemo awtControlDemo = new AwtControlDemo();
        awtControlDemo.showEventDemo();
    }
}
