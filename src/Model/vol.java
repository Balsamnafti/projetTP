/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.time.LocalTime;
import java.util.Date;
/**
 *
 * @author balsa
 */
public class vol {
     private Integer id;
     private String numvol,aerdepart,aerarrivee ;
     private Date datedep,datearr;
     private LocalTime heureDepart;
     private LocalTime heureArrivee;
public vol(String numeroVol, String aeroportDepart, String aeroportArrivee, String dateDepart, String dateArrivee, String heureDepart1, String heureArrivee1) {}
        
    
    public vol(String numvol, String aerdepart, String aerarrivee, Date datedep, Date datearr, LocalTime heureDepart, LocalTime heureArrivee) {
        this.numvol = numvol;
        this.aerdepart = aerdepart;
        this.aerarrivee = aerarrivee;
        this.datedep = datedep;
        this.datearr = datearr;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
    }

    public vol(Integer id, String numvol, String aerarrivee, Date datedep, Date datearr, LocalTime heureDepart, LocalTime heureArrivee) {
        this.id = id;
        this.numvol = numvol;
        this.aerarrivee = aerarrivee;
        this.datedep = datedep;
        this.datearr = datearr;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumvol() {
        return numvol;
    }

    public void setNumvol(String numvol) {
        this.numvol = numvol;
    }

    public String getAerdepart() {
        return aerdepart;
    }

    public void setAerdepart(String aerdepart) {
        this.aerdepart = aerdepart;
    }

    public String getAerarrivee() {
        return aerarrivee;
    }

    public void setAerarrivee(String aerarrivee) {
        this.aerarrivee = aerarrivee;
    }

    public Date getDatedep() {
        return datedep;
    }

    public void setDatedep(Date datedep) {
        this.datedep = datedep;
    }

    public Date getDatearr() {
        return datearr;
    }

    public void setDatearr(Date datearr) {
        this.datearr = datearr;
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

    public void add(vol vol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

} 