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
public class Complejo {
    private int idComplejo;
    private String nombreC;
    private String direccionC;
    
    public Complejo() {
        this.idComplejo = 0;
        this.nombreC = "";
        this.direccionC = "";
    }

    public Complejo(int idComplejo, String nombreC, String direccionC) {
        this.idComplejo = idComplejo;
        this.nombreC = nombreC;
        this.direccionC = direccionC;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

    public int getIdComplejo() {
        return idComplejo;
    }

    public void setIdComplejo(int idComplejo) {
        this.idComplejo = idComplejo;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }
    
    
    
}
