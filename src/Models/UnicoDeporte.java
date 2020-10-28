/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author ab
 */
public class UnicoDeporte {
    private int idUD;
    private String nombreUD;
    private int idComplejo;
    private boolean estadoUD;
    
    public UnicoDeporte() {
        this.idUD = 0;
        this.nombreUD = "";
        this.idComplejo = 0;
        this.estadoUD = false;
    }
    
    public UnicoDeporte(int idUD, String nombreUD, int idComplejo, boolean estadoUD) {
        this.idUD = idUD;
        this.nombreUD = nombreUD;
        this.idComplejo = idComplejo;
        this.estadoUD = estadoUD;
    }

    public boolean isEstadoUD() {
        return estadoUD;
    }

    public void setEstadoUD(boolean estadoUD) {
        this.estadoUD = estadoUD;
    }

    public int getIdUD() {
        return idUD;
    }

    public void setIdUD(int idUD) {
        this.idUD = idUD;
    }

    public String getNombreUD() {
        return nombreUD;
    }

    public void setNombreUD(String nombreUD) {
        this.nombreUD = nombreUD;
    }

    public int getIdComplejo() {
        return idComplejo;
    }

    public void setIdComplejo(int idComplejo) {
        this.idComplejo = idComplejo;
    }
    
}
