/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyekakhir_powerrangers;

/**
 *
 * @author Isa Agiya
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
 
public class koneksi {
    public static Connection bukaKoneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user ="root";
            String pass ="";
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasirinaje", user, pass);
            JOptionPane.showMessageDialog(null, "koneksi berhasil", "pesan", JOptionPane.INFORMATION_MESSAGE);
            return cn;
        } catch (Exception e) {
            return null;
            
        }
    }
    
}
