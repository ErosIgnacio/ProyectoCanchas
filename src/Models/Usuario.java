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
public class Usuario {
    private int nroInterno;
    private String run;
    private String nombre;
    private String appat;
    private String apmat;
    private String direccion;
    private String telefono;
    private String email;
    private int tipoUsuario;
    private Acceso acceso;
    
    public Usuario() {
        this.nroInterno = 0;
        this.run = "";
        this.nombre = "";
        this.appat = "";
        this.apmat = "";
        this.direccion = "";
        this.telefono = "";
        this.email = "";
        this.tipoUsuario = 0;
        this.acceso = new Acceso();
    }

    public Usuario(int nroInterno, String run, String nombre, String appat, String apmat, String direccion, String telefono, String email,int tipoUsuario, Acceso acceso) {
        this.nroInterno = nroInterno;
        this.run = run;
        this.nombre = nombre;
        this.appat = appat;
        this.apmat = apmat;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.acceso = acceso;
    }

    public int getNroInterno() {
        return nroInterno;
    }

    public void setNroInterno(int nroInterno) {
        this.nroInterno = nroInterno;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    
    public Acceso getAcceso() {
        return acceso;
    }

    public void setAcceso(Acceso acceso) {
        this.acceso = acceso;
    }
}
