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
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class MySQL {
     private static Connection Conexion;
     
     
     public Date StringToDate (String fecha){
		//Diferentes fechas a parsear
		//String stringFechaHora = "2014-10-20 20:10:59";
		//String stringFecha = "20/10/2014";
		//String stringHora = "10:20:59";
                
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = fecha;
        Date fechaDate = null;
        //Date date2 = null;
        try {
            fechaDate = formato.parse(strFecha);
            java.sql.Date date2 = new java.sql.Date(fechaDate.getTime());
            
            //JOptionPane.showMessageDialog(null, date2);
            return date2;
            
        } catch (ParseException ex) {
            ex.printStackTrace();
            return fechaDate;
        }	
}
   
     
     

    public void MySQLConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "empleadosbd", "root", "");
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
    
    
     public void insertContrato(String table_name, String idEmpleado, String idFilial, String fechaIngreso, String fechaInicio, String fechaFin, String categoria, String cantHoras,String sueldoBasico) {
        Date f= null;
        String estado="1";
         try {
            
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + 0 + "\", "   //campo autoincremental
                    + "\"" + (Integer.parseInt(idEmpleado)) + "\", "
                    
                    + "\"" + (Integer.parseInt(idFilial)) + "\", "
                    + "\"" + StringToDate(fechaIngreso) + "\", "
                    + "\"" + StringToDate(fechaInicio) + "\", "
                    + "\"" + StringToDate(fechaFin) + "\", "
                    + "\"" + (Integer.parseInt(categoria)) + "\", "
                    + "\"" + (Integer.parseInt(cantHoras)) + "\", "
                    + "\"" + (Integer.parseInt(sueldoBasico)) + "\""
                    + "\"" + (Integer.parseInt(estado)) + "\")";
                   //System.out.println(Integer.parseInt(dni));
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
    
     public void insertFilial(String table_name, String nombre, String direccion, String telefono, String correo,String tipo) {
        Date f= null;
        String estado="1";
         try {
            
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + 0 + "\", "   //campo autoincremental
                    + "\"" + nombre + "\", "
                    
                    + "\"" + direccion + "\", "
                   
                    + "\"" + (Integer.parseInt(telefono)) + "\", "
                    + "\"" + correo + "\", "
                    + "\"" + (Integer.parseInt(tipo)) + "\","
                    + "\"" + (Integer.parseInt(estado)) + "\")";
                   //System.out.println(Integer.parseInt(dni));
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
     
     
     
    public void insertFicahada(String table_name, String filial, String empleado, String fecha, String horaEntrada) {
        Date f= null;
        
         try {
            
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + (Integer.parseInt(filial)) + "\", "   //campo autoincremental
                    + "\"" + (Integer.parseInt(empleado)) + "\", "
                    
                    + "\"" + StringToDate(fecha) + "\", "
                   
                    + "\"" + Timestamp.valueOf(horaEntrada) + "\")";
                    
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
    
           public void UpdateFiliales(String table_name, String nombre, String direccion, String telefono, String correo, String tipo, String id) {
        try {
            String Query = "UPDATE " + table_name + " SET "
                    + "nombreFilial =\"" + nombre + " \", "     
                    + "direccionFilial =\"" + direccion + "\" , "
                    + "telefonoFilial = \"" + (Integer.parseInt(telefono)) + " \", "
                    + "correoFilial = \"" + correo + " \", "
                    + "tipoFilial = \"" + (Integer.parseInt(tipo)) + " \""          
                    + " WHERE idFilial = \"" + (Integer.parseInt(id))+" \"";
                   //System.out.println(Integer.parseInt(dni));
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
    
    
       public void UpdateContratos(String table_name, String idContrato, String filial, String ingreso, String inicio, String fin, String categoria, String horas, String sueldo) {
        try {
            String Query = "UPDATE " + table_name + " SET "
                    + "idFilial =\"" + (Integer.parseInt(filial))+ " \", "     
                    + "fechaIngreso =\"" + StringToDate(ingreso) + "\" , "
                    + "fechaInicioActividades = \"" + StringToDate(inicio) + " \", "
                    + "fechaFinActividades = \"" + StringToDate(fin) + " \", "
                    + "categoria = \"" + (Integer.parseInt(categoria)) + " \", "    
                   
                    + "cantidadHoras = \"" + (Integer.parseInt(horas)) + " \", "
                    + "sueldoBasico = \"" + (Integer.parseInt(sueldo)) + " \""
                    + " WHERE idContrato = \"" + (Integer.parseInt(idContrato))+" \"";
                   //System.out.println(Integer.parseInt(dni));
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
    
    
    public void DarBaja(String table_name, String Id, String Campo) {
        try {
            String Query = "UPDATE " + table_name + " SET "
                    + " estado = \"2\""
                    + " WHERE "+ Campo +" = \""+ (Integer.parseInt(Id))+" \"";
                   //System.out.println(Integer.parseInt(dni));
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "El registro ha sido dado de baja");
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
    
        
    
    
    public static ResultSet BuscarDatos(ResultSet rs,String table_name ) throws SQLException{
    try{
        String Query="select * from " + table_name;
        Statement st=Conexion.createStatement();
        rs=st.executeQuery(Query);
        
        }catch (SQLException ex){
               System.out.println(ex.getMessage());
               JOptionPane.showMessageDialog(null, "No se encontro el registro");
        }
        return rs;      
    }
    
    
    
    public static ResultSet BuscarDatos2(ResultSet rs, String table_name, String campo, String dato) throws SQLException{
    try{
        String Query= "SELECT * FROM " + table_name + " where " + campo + " like '%" + dato +"%'"; // LIKE '%$texto%       
        
        Statement st=Conexion.createStatement();
        rs=st.executeQuery(Query);
        
        }catch (SQLException ex){
               System.out.println(ex.getMessage());
               JOptionPane.showMessageDialog(null, "No se encontro el registro");
        }
        return rs;      
    }
    
  
    
        
}
     
    

