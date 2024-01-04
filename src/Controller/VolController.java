/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.vol;
    import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author balsa
 */

public class VolController {
    private List<vol> vols;

    public volController {
        this.vols = new ArrayList<>();
    }

    public void addVol(vol vol) {
        vol.add(vol);
    }

    public vol getVolById(int id) {
        for (vol vol : vols) {
            if (id != vols.getId()) {
            } else {
                return vol;
            }
        }
        return null;
    }
    public void deleteVol(int id) {
    vols.removeIf(vol -> vol.getId() == id);
}
}
