package penitipankendaraan;

import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    public static Connection setKoneksi() {
            String konString = "jdbc:mysql://localhost:3306/db_parkir";
            Connection koneksi = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(konString,"root","");
            System.out.println("Koneksi Berhasil");
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection failed");    
        } catch (SQLException ex) {
        Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Connection failed");
        }
    return koneksi;
    }
    
    public static int execute(String SQL) {
        int status = 0;
        Connection koneksi = setKoneksi();
        try {
            Statement st = koneksi.createStatement();
            status = st.executeUpdate(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        return status;
    }

    public static ResultSet executeQuery(String SQL) {
          ResultSet rs = null;
          Connection koneksi = setKoneksi();
        try {
            Statement st = koneksi.createStatement();
            rs = st.executeQuery(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
          }
        return rs;
    }
        static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
        }    
    }
