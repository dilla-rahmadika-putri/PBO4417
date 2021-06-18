/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOAdmin;
import DAO.ImplementUser;
import Model.ModelUser;
import Model.ModelTblData;
import View.adminForm;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerDataAdmin {
    adminForm frame;
    ImplementUser impUser;
    List<ModelUser> MdlUser;

    public ControllerDataAdmin(adminForm frame) {
        this.frame = frame;
        impUser = new DAOAdmin();
        MdlUser = impUser.getAll();
    }
    public void reset(){
        frame.getTf_No().setText("");
        frame.getTf_Nik().setText("");
        frame.getTf_Nama().setText("");
        frame.getCb_Jk().setSelectedItem("");
        frame.getTf_Tinggal().setText("");
        frame.getTf_Usia().setText("");
        frame.getTf_Alasan().setText("");
    }
    public void isiTable(){
        MdlUser = impUser.getAll();
        ModelTblData mtd = new ModelTblData(MdlUser);
        frame.getTbl_peserta().setModel(mtd);
    }
    public void isiField(int row){
        frame.getTf_No().setText(String.valueOf(MdlUser.get(row).getNo()));
        frame.getTf_Nik().setText(String.valueOf(MdlUser.get(row).getNik()));
        frame.getTf_Nama().setText(MdlUser.get(row).getNama());
        frame.getCb_Jk().setSelectedItem(MdlUser.get(row).getJk());
        frame.getTf_Tinggal().setText(MdlUser.get(row).getTinggal());
        frame.getTf_Usia().setText(String.valueOf(MdlUser.get(row).getUsia()));
        frame.getTf_Alasan().setText(MdlUser.get(row).getAlasan());
    }
    public void insert(){
        if(!frame.getTf_Nama().getText().trim().isEmpty() & !frame.getTf_Nama().getText().trim().isEmpty()){
            ModelUser m = new ModelUser();
            m.setNik(Integer.parseInt(frame.getTf_Nik().getText()));
            m.setNama(frame.getTf_Nama().getText());
            m.setJk(frame.getCb_Jk().getSelectedItem().toString());
            m.setTinggal(frame.getTf_Tinggal().getText());
            m.setUsia(Integer.parseInt(frame.getTf_Usia().getText()));
            m.setAlasan(frame.getTf_Alasan().getText());
            
            
            impUser.insert(m);
            JOptionPane.showMessageDialog(null, "Data Berhasil diSimpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diSimpan");
        }
    }
    public void delete(){
        if(!frame.getTf_No().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTf_No().getText());
            impUser.delete(no);
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diHapus");
        }
    }
    public void update(){
        if(!frame.getTf_No().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTf_No().getText());
            ModelUser m = new ModelUser();
            m.setNik(Integer.valueOf(frame.getTf_Nik().getText()));
            m.setNama(frame.getTf_Nama().getText());
            m.setJk(frame.getCb_Jk().getSelectedItem().toString());
            m.setTinggal(frame.getTf_Tinggal().getText());
            m.setUsia(Integer.valueOf(frame.getTf_Usia().getText()));
            m.setAlasan(frame.getTf_Alasan().getText());
            m.setNo(Integer.valueOf(frame.getTf_No().getText()));
            
            impUser.update(m);
            JOptionPane.showMessageDialog(null, "Data Berhasil diPerbarui");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diPerbarui");
        }
    }
    public void isiTableCariNama(){
        MdlUser = impUser.getCariNama(frame.getTf_Cari().getText());
        ModelTblData mtd = new ModelTblData(MdlUser);
        frame.getTbl_peserta().setModel(mtd);
    }
    public void CariNama(){
        if(!frame.getTf_Cari().getText().trim().isEmpty()){
            impUser.getCariNama(frame.getTf_Cari().getText());
            isiTableCariNama();
        }else{
            JOptionPane.showMessageDialog(null, "Masukan Nama");
        }
    }
    
}
