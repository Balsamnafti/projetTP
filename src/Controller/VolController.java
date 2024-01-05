/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.vol;
import java.time.LocalTime;
    import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author balsa
 */

public class VolController {

    private ArrayList<vol> vols; 

    public VolController() {
        vols = new ArrayList<>(); // Initialisation de la liste des vols
    }

    // Méthode pour ajouter un vol à la liste
    public void ajouterVol(String numvol, String aerdepart, String aerarrivee, Date datedep, Date datearr, LocalTime heureDepart, LocalTime heureArrivee) {
        vol newVol = new vol(numvol, aerdepart, aerarrivee, datedep, datearr, heureDepart, heureArrivee);
        vols.add(newVol); // Ajout du vol à la liste
    }

    // Méthode pour récupérer tous les vols
    public ArrayList<vol> getVols() {
        return vols;
    }

    // Méthode pour supprimer un vol de la liste
    public void supprimerVol(vol vol) {
        vols.remove(vol);
    }

}