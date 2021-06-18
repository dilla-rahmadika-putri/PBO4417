/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelBarang;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ImplementBarang {
    public void insert(ModelBarang m);
    public void delete(int no);
    public void update(ModelBarang m);
    public List<ModelBarang> getAll();
    public List<ModelBarang> getCariNama(String nama);
}
