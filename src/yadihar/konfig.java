/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yadihar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class konfig {
    private static Connection MYSQLconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/manajementperusahaan";
            String user ="root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLconfig = DriverManager.getConnection(url,user,pass);
        }catch(SQLException e){
            System.out.println("koneksi ke data base gagal" + e.getMessage());

        }
        return MYSQLconfig;
    }

    static Connection getconfigDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Connection getcofigDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
