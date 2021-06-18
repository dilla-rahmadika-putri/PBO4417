/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelBarang;
import koneksi.KoneksiDB;
import DAO.ImplementBarang;
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
public class DAOBarang implements ImplementBarang{

    Connection connection;
    final String insert = "INSERT INTO barang (nama,harga) VALUES (?,?)";
    final String update = "UPDATE barang set nama=?, harga=? WHERE no=?";
    final String delete = "DELETE FROM barang WHERE no=?";
    final String select = "SELECT * FROM barang";
    final String CariNama = "SELECT * FROM barang WHERE nama like?"; 

    public DAOBarang() {
        connection = KoneksiDB.connection();
    }
    
    @Override
    public void insert(ModelBarang mb) {
        PreparedStatement statement = null;
        try{
           statement = connection.prepareStatement(insert); 
           statement.setString(1, mb.getNama());
           statement.setDouble(2, mb.getHarga());
           statement.executeUpdate();
           ResultSet r = statement.getGeneratedKeys();
           while (r.next()){
               mb.setNo(r.getInt(1));
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

    @Override
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
    
    @Override
    public void update(ModelBarang mb) {
        PreparedStatement statement = null;
        try{
           statement = connection.prepareStatement(update); 
           statement.setString(1, mb.getNama());
           statement.setDouble(2, mb.getHarga());
           statement.setDouble(3, mb.getNo());
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

    @Override
    public List<ModelBarang> getAll() {
        List<ModelBarang> lmb = null;
        Statement s;
        try {
            lmb = new ArrayList<ModelBarang>();
            s = connection.createStatement();
            ResultSet r = s.executeQuery(select);
            while(r.next()){
                ModelBarang mb = new ModelBarang();
                mb.setNo(r.getInt("no"));
                mb.setNama(r.getString("nama"));
                mb.setHarga(r.getDouble("harga"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lmb;   
        }
    

    @Override
    public List<ModelBarang> getCariNama(String nama) {
        List<ModelBarang> lmb = null;
        try{
            lmb = new ArrayList<ModelBarang>();
            PreparedStatement s = connection.prepareStatement(CariNama);
            s.setString(1, "%" + nama + "%");
            ResultSet r = s.executeQuery();
            while(r.next()){
                ModelBarang mb = new ModelBarang();
                mb.setNo(r.getInt("no"));
                mb.setNama(r.getString("nama"));
                mb.setHarga(r.getDouble("harga"));
                lmb.add(mb);
            }
        }catch(SQLException ex){
            Logger.getLogger(DAOBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmb;
        }
}
