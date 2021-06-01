/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOMahasiswa;
import mvc.DAOInterface.Imahasiswa;
import mvc.Model.Mahasiswa;
import mvc.Model.TabelModelMahasiswa;
import mvc.View.FormMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class ControllerMahasiswa {
        FormMahasiswa frame;
        Imahasiswa implMahasiswa;
        List<Mahasiswa> lb;
    
    public class ControllerMahasiswa(FormMahasiswa frame){
        this.frame = frame;
        implMhasiswa = new DAOMahasiswa();
        lb = implMahasiswa.getAll();
    }
    public void reset(){
        frame.getTxtID().setText("");
        frame.getTxtNim().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
    }
    public void isiTable(){
        lb = implMahasiswa.getAll();
        TableModelMahasiswa tmb = new TableModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    public void isiField(int row){
        frame.getTxtID().setText(lb.get(row).getId().toString());
        frame.getTxtNim().setText(lb.get(row).getNim());
        frame.gettxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
    }
    public void insert(){
        if(!frame.getTxtNim().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()){
            Mahasiswa b = new Mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            implMahasiswa.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    public void update(){
        if(!frame.getTxtID().getText().trim().isEmpty()){
            Mahasiswa b = new Mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            implMahasiswa.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    public void delete(){
        if(!frame.getTxtID().getText().trim().isEmpty()){
            int id = Integer.parseInt(frame.getTxtID().getText());
            implMahasiswa.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(frame, "Pilih Data Yang Akan Dihapus");
        }
    }
    public void isiTabLeCariNama(){
        lb = implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    public void carinama(){
        if(!frame.getTxtCariNama().getText().trim().isEmpty()){
            implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
            isiTabLeCariNama();
        }else{
            JOptionPane.showMessageDialog(frame, "Silahkan Pilih Data");
        }
    }
}
    