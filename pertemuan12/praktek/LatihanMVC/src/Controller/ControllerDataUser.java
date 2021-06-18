/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOUser;
import DAO.ImplementUser;
import Model.ModelUser;
import Model.ModelTblData;
import View.userForm;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerDataUser {
    userForm frame;
    ImplementUser impUser;
    List<ModelUser> MdlUser;

    public ControllerDataUser(userForm frame) {
        this.frame = frame;
        impUser = new DAOUser();
        MdlUser = impUser.getAll();
    }
    public void reset(){
        frame.getTf_No().setText("");
        frame.getTf_Nik().setText("");
        frame.getTf_Nama().setText("");
        frame.getCb_Jk().setSelectedItem("");
        frame.getTf_Tinggal().setText("");
        frame.getTf_usia().setText("");
        frame.getTf_alasan().setText("");
    }
    public void insert(){
        if(!frame.getTf_Nama().getText().trim().isEmpty() & !frame.getTf_Nama().getText().trim().isEmpty()){
            ModelUser m = new ModelUser();
            m.setNik(Integer.parseInt(frame.getTf_Nik().getText()));
            m.setNama(frame.getTf_Nama().getText());
            m.setJk(frame.getCb_Jk().getSelectedItem().toString());
            m.setTinggal(frame.getTf_Tinggal().getText());
            m.setUsia(Integer.parseInt(frame.getTf_usia().getText()));
            m.setAlasan(frame.getTf_alasan().getText());
            impUser.insert(m);
            JOptionPane.showMessageDialog(null, "Data Berhasil diSimpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diSimpan");
        }
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
        frame.getTf_usia().setText(String.valueOf(MdlUser.get(row).getUsia()));
        frame.getTf_alasan().setText(MdlUser.get(row).getAlasan());
    }
    
}
