
package Controllers;

import Models.AccesoADO;
import java.util.Date;


public class ControladorAcceso {
    AccesoADO ovado = new AccesoADO();
        
   public String verificaConexion(){
       
        if(ovado.GetConnection()==null){
            return "No hay conexión a la BD Ventas";
        }else{
            return ""; //Si hay conexion
        }
    }
    
    public String verificaCredenciales(String username, String password){
        int verificaAcceso = ovado.verificarAcceso(username, password);    
        switch(verificaAcceso){
            case 0:
                return "Username : " + username + " y su password No existe en la BD Peluqueria. ";
            case 1:
                return ""; // Credenciales existen
            default:
                return "Acceso no verificado, reintente. ";
        }
    }
    
    public String verificaUsername(String username){
        int verificaUsername = ovado.verificarUsername(username);
        
        switch(verificaUsername){
            case 0:
                return "Username : " + username + " no existe en la BD Ventas. ";
            case 1:
                return ""; //Usuario existe en BD Ventas 
            default:
                return "Username no verificado, reintente. ";
        }
    }
    
    public String verificaPassword(String username, String password){
        int verificaLlave = ovado.verificarPasswordDeUsername(username,password);    
        switch(verificaLlave){
            case 0:
                return "Llave no valida para Username : " + username;
            case 1:
                return ""; // LLave valdia para el username
            default:
                return "LLave no verificada, reintente. ";
        }
    }
}
