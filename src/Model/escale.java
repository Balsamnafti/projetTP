/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.time.LocalTime;
/**
 *
 * @author balsa
 */
public class escale {
     private Integer idaeroport;
     private LocalTime heureDepart;
    private LocalTime heureArrivee;

    public escale(Integer idaeroport, LocalTime heureDepart, LocalTime heureArrivee) {
        this.idaeroport = idaeroport;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
    }

    public escale(LocalTime heureDepart, LocalTime heureArrivee) {
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
    }

    public Integer getIdaeroport() {
        return idaeroport;
    }

    public void setIdaeroport(Integer idaeroport) {
        this.idaeroport = idaeroport;
    }

    public LocalTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalTime heureDepart) {
        this.heureDepart = heureDepart;
    }

    public LocalTime getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(LocalTime heureArrivee) {
        this.heureArrivee = heureArrivee;
    }
    
}
