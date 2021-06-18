/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOBarang;
import DAO.ImplementBarang;
import Model.ModelBarang;
import Model.ModelTblBarang;
import View.FromBarang;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerBarang {
    FromBarang frame;
    ImplementBarang impBarang;
    List<ModelBarang> lmb;

    public ControllerBarang(FromBarang frame) {
        this.frame = frame;
        impBarang = new DAOBarang();
        lmb = impBarang.getAll();
    }
    public void reset(){
        frame.getTf_no().setText("");
        frame.getTf_nama().setText("");
        frame.getTf_harga().setText("");
    }
    public void isiTable(){
        lmb = impBarang.getAll();
        ModelTblBarang mtb = new ModelTblBarang(lmb);
        frame.getTbl_barang().setModel(mtb);
    }
    public void isiField(int row){
        frame.getTf_no().setText(String.valueOf(lmb.get(row).getNo()));
        frame.getTf_nama().setText(lmb.get(row).getNama());
        frame.getTf_harga().setText(String.valueOf(lmb.get(row).getHarga()));
    }
    public void insert(){
        if(!frame.getTf_nama().getText().trim().isEmpty() & !frame.getTf_nama().getText().trim().isEmpty()){
            ModelBarang m = new ModelBarang();
            m.setNama(frame.getTf_nama().getText());
            m.setHarga(Double.valueOf(frame.getTf_harga().getText()));
            
            impBarang.insert(m);
            JOptionPane.showMessageDialog(null, "Data Berhasil diSimpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diSimpan");
        }
    }
    public void delete(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTf_no().getText());
            impBarang.delete(no);
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diHapus");
        }
    }
    public void update(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTf_no().getText());
            ModelBarang m = new ModelBarang();
            m.setNama(frame.getTf_nama().getText());
            m.setHarga(Double.valueOf(frame.getTf_harga().getText()));
            m.setNo(Integer.valueOf(frame.getTf_no().getText()));
            
            impBarang.update(m);
            JOptionPane.showMessageDialog(null, "Data Berhasil diPerbarui");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diPerbarui");
        }
    }
    public void isiTableCariNama(){
        lmb = impBarang.getCariNama(frame.getTf_cari().getText());
        ModelTblBarang mtb = new ModelTblBarang(lmb);
        frame.getTbl_barang().setModel(mtb);
    }
    public void CariNama(){
        if(!frame.getTf_cari().getText().trim().isEmpty()){
            impBarang.getCariNama(frame.getTf_cari().getText());
            isiTableCariNama();
        }else{
            JOptionPane.showMessageDialog(null, "Masukan Nama");
        }
    }
}
