/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyekakhir_powerrangers;

/**
 *
 * @author Isa Agiya
 * 
 */
import java.util.ArrayList; //Import ini digunakan untuk mengimpor kelas ArrayList dari paket java.util
import java.util.Date; //Import ini digunakan untuk mengimpor kelas Date dari paket java.util
import javax.swing.JOptionPane; //Import ini digunakan untuk mengimpor kelas JOptionPane dari paket javax.swing
public class ProyekAkhir_PowerRangers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new TampilanAwal().show();//digunakan untuk membuat objek dari kelas TampilanAwal
        
        Register rg = new Register();//untuk menampilkan tampilan register dengan pengaturan yang sesuai.
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        
        Login lg = new Login();//untuk menampilkan tampilan login.
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        
        TampilanAwal ta = new TampilanAwal();//untuk menampilkan tampilan awal.
        ta.setVisible(true);
        ta.pack();
        ta.setLocationRelativeTo(null);
        ta.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        
    }
    
}
