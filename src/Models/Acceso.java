
package Models;

import java.util.Date;


public class Acceso {
    private int idAcceso;   
    private String username;	
    private String password;      
    private int diasCaducidad;
    private Date fechaCaducidad;  
    private boolean swInicio;       
    private boolean estado; 
    
    
    public Acceso() {
        this.idAcceso = 0;
        this.username = "";
        this.password = "";
        this.diasCaducidad = 0;
        this.fechaCaducidad = new java.util.Date();
        this.swInicio = false;
        this.estado = true;
    }

    public Acceso(int idAcceso, String username, String password, int diasCaducidad, Date fechaCaducidad, boolean swInicio, boolean estado) {
        this.idAcceso = idAcceso;
        this.username = username;
        this.password = password;
        this.diasCaducidad = diasCaducidad;
        this.fechaCaducidad = fechaCaducidad;
        this.swInicio = swInicio;
        this.estado = estado;
    }

    public int getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(int idAcceso) {
        this.idAcceso = idAcceso;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public boolean isSwInicio() {
        return swInicio;
    }

    public void setSwInicio(boolean swInicio) {
        this.swInicio = swInicio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
	
}
