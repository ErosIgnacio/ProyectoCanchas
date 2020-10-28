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
public class Cancha {
    private int idCancha;
    private int idPD;
    private boolean estado;
    
    public Cancha() {
        this.idCancha = 0;
        this.idPD = 0;
        this.estado = false;
    }
    
    public Cancha(int idCancha,int idPD, boolean estado) {
        this.idCancha = idCancha;
        this.idPD = idPD;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public int getIdPD() {
        return idPD;
    }

    public void setIdPD(int idPD) {
        this.idPD = idPD;
    }
    
    
    
    
}
