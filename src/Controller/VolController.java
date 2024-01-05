/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.vol;
import java.sql.*;
import configs.crude;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author balsa
 */

public class VolController {

    private ArrayList<vol> vols; 

    public VolController() {
        vols = new ArrayList<>(); // Initialisation de la liste des vols
    }

    private crude crude = new crude();

    public boolean insert(vol e) {
        try {
            String sql = "INSERT INTO vol(numvol,aerarrivee,dadtedep,datearr,heureDepart,heureArrivee) VALUES ('"
                    + e.getNumvol() + "','" + e.getAerarrivee() + "','" + e.getDatedep() + "','" + e.getDatearr() + "','"
                    + e.getHeureDepart() + "','" + e.getHeureArrivee() + "')";
            System.out.println(sql);
            return crude.exeInsert(sql);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur  ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    }

   
