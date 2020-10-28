/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author ab
 */
public class Solicitud {
    private int idSolicitud;
    private int idCancha;
    private int idUD;
    private String fecha;
    private String horaIni;
    private String horaTer;
    
    public Solicitud() {
        this.idSolicitud = 0;
        this.idCancha = 0;
        this.idUD = 0;
        this.fecha = "";
        this.horaIni = "";
        this.horaTer = "";
    }
    
    public Solicitud(int idSolicitud, int idCancha, int idUD, String fecha, String horaIni, String horaTer) {
        this.idSolicitud = idSolicitud;
        this.idCancha = idCancha;
        this.idUD = idUD;
        this.fecha = fecha;
        this.horaIni = horaIni;
        this.horaTer = horaTer;
    }

    public String getHoraTer() {
        return horaTer;
    }

    public void setHoraTer(String horaTer) {
        this.horaTer = horaTer;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public int getIdUD() {
        return idUD;
    }

    public void setIdUD(int idUD) {
        this.idUD = idUD;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(String horaIni) {
        this.horaIni = horaIni;
    }
    
}
