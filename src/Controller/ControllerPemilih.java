/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import View.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 *
 * @author esber
 */
public class ControllerPemilih extends MouseAdapter implements ActionListener {

    private GuiMenuPemilih view = new GuiMenuPemilih();
    private List<Kandidat> kandidat = new ArrayList(); // List sambungan isi dari Panitia

    public ControllerPemilih() {
        view.ListenerVoting(this);
        view.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(view.getPilihPemilih()))
        {
            char pilihan = view.getPilihan();
            if ( pilihan == '1')
            {
                kandidat.get(0).setJumlahSuara();
            }
            else if (pilihan == '2')
            {
                kandidat.get(1).setJumlahSuara();
            }
            else if (pilihan == '3')
            {
                kandidat.get(2).setJumlahSuara();
            }
            else if (pilihan == '4')
            {
                kandidat.get(3).setJumlahSuara();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
    }
    
}
