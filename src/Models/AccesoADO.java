
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AccesoADO {
    Acceso acc= new Acceso();
    Connection conexion=null;
        public Connection GetConnection()
        {

            try
            {
                String cadena;
                String nombreServidor="AB-PC";
                String nombreBD="Olimpiada";
                String nombreUsuario="usuarioSQL";
                String llave="123";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                
                cadena = "jdbc:sqlserver://" + nombreServidor + ":1433;databaseName=" + nombreBD + 
                        ";user=" + nombreUsuario + ";password=" + llave;            
                conexion= DriverManager.getConnection(cadena);
                return conexion;
            } catch(ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                conexion=null;
                return conexion;
            } catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                conexion=null;
                return conexion;
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                conexion=null;
                return conexion;
            }
        }    public int verificarAcceso(String username, String password){
            try{
                int estado;
                conexion = GetConnection();
                PreparedStatement pstmt = conexion.prepareStatement("{call dbo.sp_ConsultaAcceso(?,?)}");
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();
                rs.next();
                estado = rs.getInt(1);//1 = credenciales validas.
                return estado; //0 = no existen las conexiones. 
            }catch (SQLException e){
                return -1;
            }
        }
        
        public int verificarUsername(String username){
            try{
                int estado;
                conexion = GetConnection();
                PreparedStatement pstmt = conexion.prepareStatement("{call dbo.SP_ConsultaUsername(?)}");
                pstmt.setString(1, username);
                ResultSet rs = pstmt.executeQuery();
                rs.next();
                estado = rs.getInt(1);
                return estado; //0 = no existe el Username. 1 = Username Existe.
            }catch (SQLException e){
                return -1;
            }
        }
        
        public int verificarPasswordDeUsername(String username,String password){
            try{
                int estado;
                conexion = GetConnection();
                PreparedStatement pstmt = conexion.prepareStatement("{call dbo.SP_Consultallave(?,?)}");
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();
                rs.next();
                estado = rs.getInt(1);//1 = llave valida para el username.
                return estado; //0 = llave no es valida para el username 
            }catch (SQLException e){
                return -1;
            }
        }


}
