/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class ModelTblBarang extends AbstractTableModel{
    
    List<ModelBarang> lmb;

    public ModelTblBarang(List<ModelBarang> lmb) {
        this.lmb = lmb;
    }
    
    @Override
    public int getRowCount() {
        return lmb.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lmb.get(row).getNo();
            case 1:
                return lmb.get(row).getNama();
            case 2:
                return lmb.get(row).getHarga();
            default:
                return null;
        }  
    }
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "NO";
            case 1:
                return "NAMA";
            case 2:
                return "HARGA";
            default:
                return null;
        }
    }
}
