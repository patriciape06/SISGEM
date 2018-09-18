/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class MySQL {
     private static Connection Conexion;

    public void MySQLConnection(String user, String pass, String db_name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeConnection() {
        try {
            Conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertData(String table_name, String dni, String cuil, String nombreEmpleado, String apellidoEmpleado, String domicilioEmpleado, String estado,String telefonoEmpleado, String celularEmpleado, String correoEmpleado) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + 0 + "\", "   //campo autoincremental
                    + "\"" + (Integer.parseInt(dni)) + "\", "
                    
                    + "\"" + cuil + "\", "
                    + "\"" + nombreEmpleado + "\", "
                    + "\"" + apellidoEmpleado + "\", "
                    + "\"" + domicilioEmpleado + "\", "
                    + "\"" + (Integer.parseInt(estado)) + "\", "
                    + "\"" + (Integer.parseInt(telefonoEmpleado)) + "\", "
                    + "\"" + (Integer.parseInt(celularEmpleado)) + "\", "
                    + "\"" + correoEmpleado + "\")";
                   //System.out.println(Integer.parseInt(dni));
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
    
    public void UpdateData(String table_name, String dni, String cuil, String nombreEmpleado, String apellidoEmpleado, String domicilioEmpleado, String telefonoEmpleado, String celularEmpleado, String correoEmpleado, String Id) {
        try {
            String Query = "UPDATE " + table_name + " SET "
                    + "dni =\"" + (Integer.parseInt(dni))+ " \", "     
                    + "cuil =\"" + cuil + "\" , "
                    + "nombreEmpleado = \"" + nombreEmpleado + " \", "
                    + "apellidoEmpleado = \"" + apellidoEmpleado + " \", "
                    + "domicilioEmpleado = \"" + domicilioEmpleado + " \", "    
                    + "telefonoEmpleado = \"" + (Integer.parseInt(telefonoEmpleado)) + " \", "
                    + "celularEmpleado = \"" + (Integer.parseInt(celularEmpleado)) + " \", "
                    + "correoEmpleado = \"" + correoEmpleado + " \""
                    + " WHERE idEmpleado = \""+ (Integer.parseInt(Id))+" \"";
                   //System.out.println(Integer.parseInt(dni));
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
    
    public void BajaEmpleado(String table_name, String Id) {
        try {
            String Query = "UPDATE " + table_name + " SET "
                    + " estado = \"2\""
                    + " WHERE idEmpleado = \""+ (Integer.parseInt(Id))+" \"";
                   //System.out.println(Integer.parseInt(dni));
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "El empleado ha sido dado de baja");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
    
    public void deleteRecord(String table_name, String ID) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE idEmpleado = \"" + ID + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "El empleado ha sido dado de baja");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
    }
    
        
    
    
    public static ResultSet BuscarEmpleado(ResultSet rs) throws SQLException{
    try{
        String Query="select * from empleados";
        Statement st=Conexion.createStatement();
        rs=st.executeQuery(Query);
        
        }catch (SQLException ex){
               System.out.println(ex.getMessage());
               JOptionPane.showMessageDialog(null, "No se encontro el registro");
        }
        return rs;      
    }
    
    
    
    public static ResultSet BuscarEmpleado2(ResultSet rs, String table_name, String v, String campo) throws SQLException{
    try{
        String Query= "SELECT * FROM " + table_name + " where " + v + " like '%" + campo +"%'"; // LIKE '%$texto%       
        
        Statement st=Conexion.createStatement();
        rs=st.executeQuery(Query);
        
        }catch (SQLException ex){
               System.out.println(ex.getMessage());
               JOptionPane.showMessageDialog(null, "No se encontro el registro");
        }
        return rs;      
    }
    
   
    
}
