/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelUser;
import java.util.List;


/**
 *
 * @author ASUS
 */
public interface ImplementUser {
    public void insert(ModelUser m);
    public void delete(int no);
    public void update(ModelUser m);
    public List<ModelUser> getAll();
    public List<ModelUser> getCariNama(String nama);
    
}
