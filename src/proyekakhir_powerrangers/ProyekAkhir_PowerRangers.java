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
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
public class ProyekAkhir_PowerRangers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new TampilanAwal().show();
        
        Register rg = new Register();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        
        Login lg = new Login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        
        TampilanAwal ta = new TampilanAwal();
        ta.setVisible(true);
        ta.pack();
        ta.setLocationRelativeTo(null);
        ta.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        
    }
    
}
