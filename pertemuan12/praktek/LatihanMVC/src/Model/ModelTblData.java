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
public class ModelTblData extends AbstractTableModel {
    List<ModelUser> mb;
    
    public ModelTblData(List<ModelUser> mb) {
        this.mb = mb;
    }
    @Override
    public int getRowCount() {
        return mb.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return mb.get(row).getNo();
            case 1:
                return mb.get(row).getNama();
            case 2:
                return mb.get(row).getNik();
            case 3:
                return mb.get(row).getJk();
            case 4:
                return mb.get(row).getTinggal();
            case 5:
                return mb.get(row).getUsia();
            case 6:
                return mb.get(row).getAlasan();
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
                return "NIK";
            case 3:
                return "JENIS KELAMIN";
            case 4:
                return "TEMPAT TINGGAL";
            case 5:
                return "USIA";
            case 6:
                return "ALASAN";
            default:
                return null;
        }
    }
    
}
