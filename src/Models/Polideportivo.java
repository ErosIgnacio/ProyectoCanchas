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
public class Polideportivo {
    private int idPD;
    
    
    public Polideportivo() {
        this.idPD = 0;
    }
    public Polideportivo(int idPD) {
        this.idPD = idPD;
    }

    public int getIdPD() {
        return idPD;
    }

    public void setIdPD(int idPD) {
        this.idPD = idPD;
    }
    
    
}
