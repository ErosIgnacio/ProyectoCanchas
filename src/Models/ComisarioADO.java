/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ab
 */
public class ComisarioADO {
    ArrayList<Comisario> Clientes = new ArrayList<>();
    Comisario op = new Comisario();
     Connection conexion=null;
        public Connection GetConnection()
        {

            try
            {
                String cadena;
                String nombreServidor="AB-PC";
                String nombreBD="Peluqueria";
                String nombreUsuario="usuarioSQL";
                String llave="12345";
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
        }    
        
    public int existeCliente(int idCliente){
            try{
                int estado;
                conexion = GetConnection();
                PreparedStatement pstmt = conexion.prepareStatement("{call dbo.SP_ExisteCliente(?)}");
                pstmt.setInt(1, idCliente);
                ResultSet rs = pstmt.executeQuery();
                rs.next();
                estado = rs.getInt(1);
                return estado; //0 = no existe el id de cliente. 1 = si existe el id de cliente.
            }catch (SQLException e){
                return -1; //error/
            }
    }
    
    public boolean guardarCliente(int idCliente,int tipocliente, String runC,String nombreC, String appatC,String apmatC,boolean sexoC,String direccion,String telefono,String emailC){
            try{
                conexion = GetConnection();
                PreparedStatement pstmt = conexion.prepareStatement("{call dbo.SP_AgregarCliente(?,?,?,?,?,?,?,?,?,?)}");
                pstmt.setInt(1, idCliente);
                pstmt.setInt(2, tipocliente);
                pstmt.setString(3, runC);
                pstmt.setString(4, nombreC);
                pstmt.setString(5, appatC);
                pstmt.setString(6, apmatC);
                pstmt.setBoolean(7, sexoC);
                pstmt.setString(8, direccion);
                pstmt.setString(9, telefono);
                pstmt.setString(10, emailC);
                pstmt.execute();
                pstmt.close();
                return true; 
            }catch (SQLException e){
                return false; 
            }
    }
    
    public boolean actualizarComisario(int idCom,int tipocliente, String runC,String nombreC, String appatC,String apmatC,boolean sexoC,String direccion,String telefono,String emailC){
            try{
                conexion = GetConnection();
                PreparedStatement pstmt = conexion.prepareStatement("{call dbo.SP_ActualizarCliente(?,?,?,?,?,?,?,?,?,?)}");
                pstmt.setInt(1, idCom);
                pstmt.setInt(2, tipocliente);
                pstmt.setString(3, runC);
                pstmt.setString(4, nombreC);
                pstmt.setString(5, appatC);
                pstmt.setString(6, apmatC);
                pstmt.setBoolean(7, sexoC);
                pstmt.execute();
                pstmt.close();
                return true; 
            }catch (SQLException e){
                return false; 
            }
    }
    
    public boolean eliminarCliente(int idCliente){
            try{
                conexion = GetConnection();
                PreparedStatement pstmt = conexion.prepareStatement("{call dbo.SP_EliminarComisario(?)}");
                pstmt.setInt(1, idCliente);
                pstmt.execute();
                pstmt.close();
                return true;
            }catch (SQLException e){
                return false; 
            }
    }
    
    public boolean consultaxDatosCliente(int idCliente){
            try{
                conexion = GetConnection();
                PreparedStatement pstmt = conexion.prepareStatement("{call sp_ConsultarDatosComisario(?)}");
                pstmt.setInt(1, idCliente);
                ResultSet rs = pstmt.executeQuery();
                rs.next();
                op.setIdCom(rs.getInt(1));
                op.setRunCom(rs.getString(2));
                op.setNombreCom(rs.getString(3));
                op.setAppatCom(rs.getString(4));
                op.setApmatCom(rs.getString(5));
                op.setFonoCom(rs.getString(6));
                op.setEmailCom(rs.getString(7));
                return true; // Datos consultados OK
            }catch (SQLException e){
                return false; // No se trajeron los datos
            }
    }
    
    public Comisario obtenerDatos(){
        return op;
    }
    
    public boolean consultaxDatosFiltrado(String filtro){
            try{
                conexion = GetConnection();
                PreparedStatement pstmt = conexion.prepareStatement("{call sp_ConsultaxFiltroComisario(?)}");
                pstmt.setString(1, filtro);
                ResultSet rs = pstmt.executeQuery();
                while(rs.next()){
                    Comisario op = new Comisario();
                    op.setIdCom(rs.getInt(1));
                    op.setRunCom(rs.getString(2));
                    op.setNombreCom(rs.getString(3));
                    op.setAppatCom(rs.getString(4));
                    op.setApmatCom(rs.getString(5));
                    op.setFonoCom(rs.getString(6));
                    op.setEmailCom(rs.getString(7));
                    Clientes.add(op);
                }

                return true; // Datos consultados OK
            }catch (SQLException e){
                return false; // No se trajeron los datos
            }
    }
    
    public ArrayList<Comisario> obtenerXDatosFiltrados(){
        return Clientes;
    }
    public ResultSet Consulta(String consulta){
        try{
            Connection con = GetConnection();
            Statement declara;
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        return null;
    }
}
