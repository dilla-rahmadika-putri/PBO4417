/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class KoneksiDB {
    static Connection con;
    
    public static Connection connection(){
        if (con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("pbo");
            data.setUser("root");
            data.setPassword("");
            try{
                con = data.getConnection();
            }catch (SQLException ex){
                System.out.println("Tidsk Terkoneksi");
            }
        }
        return con;
    }
}
