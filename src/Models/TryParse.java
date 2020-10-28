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
public class TryParse {
    public boolean esEntero(String numeroCaracter){
    try{
        int numero= Integer.parseInt(numeroCaracter);
        return true;
    }catch(Exception ex){
        return false;
    }
    }
    public boolean esFloat(String numeroCaracter){
    try{
        float numero= Float.parseFloat(numeroCaracter);
        return true;
    }catch(Exception ex){
        return false;
    }
    }
}
