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
public class Comisario {
    private int idCom;
    private String runCom;
    private String nombreCom;
    private String appatCom;
    private String apmatCom;
    private String fonoCom;
    private String emailCom;
    
    public Comisario() {
        this.idCom = 0;
        this.runCom = "";
        this.nombreCom = "";
        this.appatCom = "";
        this.apmatCom = "";
        this.fonoCom = "";
        this.emailCom = "";
    }
    
    public Comisario(int idCom, String runCom, String nombreCom, String appatCom, String apmatCom, String fonoCom, String emailCom) {
        this.idCom = idCom;
        this.runCom = runCom;
        this.nombreCom = nombreCom;
        this.appatCom = appatCom;
        this.apmatCom = apmatCom;
        this.fonoCom = fonoCom;
        this.emailCom = emailCom;
    }

    public String getEmailCom() {
        return emailCom;
    }

    public void setEmailCom(String emailCom) {
        this.emailCom = emailCom;
    }

    public int getIdCom() {
        return idCom;
    }

    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }

    public String getRunCom() {
        return runCom;
    }

    public void setRunCom(String runCom) {
        this.runCom = runCom;
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public String getAppatCom() {
        return appatCom;
    }

    public void setAppatCom(String appatCom) {
        this.appatCom = appatCom;
    }

    public String getApmatCom() {
        return apmatCom;
    }

    public void setApmatCom(String apmatCom) {
        this.apmatCom = apmatCom;
    }

    public String getFonoCom() {
        return fonoCom;
    }

    public void setFonoCom(String fonoCom) {
        this.fonoCom = fonoCom;
    }
    
    
}
