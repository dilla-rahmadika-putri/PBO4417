/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelUser;
import Koneksi.KoneksiDatabase;
import DAO.ImplementUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DAOAdmin implements ImplementUser{
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (nik,nama,jk,tinggal,usia,alasan) VALUES (?,?,?,?,?,?)";
    final String update = "UPDATE tbl_pendaftaran set nik=?, nama=?, jk=?, tinggal=?, usia=?, alasan=? WHERE no=?";
    final String delete = "DELETE FROM tbl_pendaftaran WHERE no=?";
    final String select = "SELECT * FROM tbl_pendaftaran";
    final String CariNama = "SELECT * FROM tbl_pendaftaran WHERE nama like?"; 

    public DAOAdmin() {
        connection = KoneksiDatabase.connection();
    }
    
    public void insert(ModelUser m) {
        PreparedStatement statement = null;
        try{
           statement = connection.prepareStatement(insert); 
           statement.setInt(1, m.getNik());
           statement.setString(2, m.getNama());
           statement.setString(3, m.getJk());
           statement.setString(4, m.getTinggal());
           statement.setInt(5, m.getUsia());
           statement.setString(6, m.getAlasan());
           statement.executeUpdate();
           ResultSet r = statement.getGeneratedKeys();
           while (r.next()){
               m.setNo(r.getInt(1));
           }
        }catch (SQLException ex){
            System.out.println("Berhasil Input Data");
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                System.out.println("Gagal Input Data");
            }
        }       
    }

    public void delete(int no) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, no);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete Data");
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                System.out.println("Gagal Delete Data");
            }
        }       
    }
    
    public void update(ModelUser m) {
        PreparedStatement statement = null;
        try{
           statement = connection.prepareStatement(update); 
           statement.setInt(1, m.getNik());
           statement.setString(2, m.getNama());
           statement.setString(3, m.getJk());
           statement.setString(4, m.getTinggal());
           statement.setInt(5, m.getUsia());
           statement.setString(6, m.getAlasan());
           statement.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Berhasil Update Data");
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                System.out.println("Gagal Update Data");
            }
        }
    }

    public List<ModelUser> getAll() {
        List<ModelUser> mb = null;
        Statement s;
        try {
            mb = new ArrayList<ModelUser>();
            s = connection.createStatement();
            ResultSet r = s.executeQuery(select);
            while(r.next()){
                ModelUser m = new ModelUser();
                m.setNo(r.getInt("no"));
                m.setNik(r.getInt("nik"));
                m.setNama(r.getString("nama"));
                m.setJk(r.getString("jk"));
                m.setTinggal(r.getString("tinggal"));
                m.setUsia(r.getInt("usia"));
                m.setAlasan(r.getString("alasan"));
                mb.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
         return mb;   
        }
    

    public List<ModelUser> getCariNama(String nama) {
        List<ModelUser> mb = null;
        try{
            mb = new ArrayList<ModelUser>();
            PreparedStatement s = connection.prepareStatement(CariNama);
            s.setString(1, "%" + nama + "%");
            ResultSet r = s.executeQuery();
            while(r.next()){
                ModelUser m = new ModelUser();
                m.setNo(r.getInt("no"));
                m.setNik(r.getInt("nik"));
                m.setNama(r.getString("nama"));
                m.setJk(r.getString("jk"));
                m.setTinggal(r.getString("tinggal"));
                m.setUsia(r.getInt("usia"));
                m.setAlasan(r.getString("alasan"));
                mb.add(m);
            }
        }catch(SQLException ex){
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mb;
        }
    
}
