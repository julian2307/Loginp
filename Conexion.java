/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Juli
 */
public class Conexion {
    
      private String usuario="postgres";
   private String contraseña="123456";
   private String host ="localhost";
   private String puerto="5432";
   private String base="avanzada";
   private String url="jdbc:postgresql://"+host+":"+puerto+"/"+base;
   private String classname="org.postgresql.Driver";
   private  Connection con;

   public Conexion(){
       try {
           Class.forName(classname);
           con = DriverManager.getConnection(url,usuario,contraseña);
           DatabaseMetaData info = con.getMetaData (); 
           System.out.println("\n INFORMACION DE LA BASE DE DATOS");  
	   System.out.println("\nConectado a : " + info.getURL());   
           System.out.println("Driver       :" +     info.getDriverName());   
           System.out.println("Version      :" +    info.getDriverVersion());   
           System.out.println(""); 
           
       } catch (ClassNotFoundException ex)
       {
           System.err.println("Error"+ex);
       } catch(SQLException e){
           System.err.println("Error"+e);
       }
 
   }
   
   public Connection getConexion(){
       return con;
   }
    
}
