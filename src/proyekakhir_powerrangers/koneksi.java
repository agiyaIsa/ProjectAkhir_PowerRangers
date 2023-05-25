/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyekakhir_powerrangers;

/**
 *
 * @author Isa Agiya
 */
import java.sql.Connection; //Import ini digunakan untuk mengimpor kelas Connection dari paket java.sql
import java.sql.DriverManager; //Import ini igunakan untuk mengimpor kelas DriverManager dari paket java.sql
import java.sql.Statement; //Import ini digunakan untuk mengimpor kelas Statement dari paket java.sql
import javax.swing.JOptionPane; //Import ini digunakan untuk mengimpor kelas JOptionPane dari paket javax.swing
 
public class koneksi {
    public static Connection bukaKoneksi() {//Berfungsi untuk terhubung dengan database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Digunakan untuk memuat dan mendaftarkan driver yang diperlukan agar dapat digunakan oleh aplikasi
            String user ="root";// untuk pemnyimpan username
            String pass ="";// untuk meinympan password
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasirinaje", user, pass);//untuk mendapatkan objek Connection dari database
            JOptionPane.showMessageDialog(null, "koneksi berhasil", "pesan", JOptionPane.INFORMATION_MESSAGE);//ntuk menampilkan pesan "koneksi berhasil" sebagai dialog pop-up dengan jenis pesan INFORMATION_MESSAGE.
            return cn;
        } catch (Exception e) {
            return null;
            
        }
    }
    
}
