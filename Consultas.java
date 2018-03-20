/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Juli
 */
public class Consultas extends Conexion{
    
    public boolean Autenticacion(String usuario, String contraseña) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from usuario "
                    + "where nombre = ? and id = ?";
            pst = getConexion().prepareStatement(consulta,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                return true;
            }

        } catch (Exception ex) {

            System.err.println("error 1" + ex);

        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("error 2" + e);
            }
        }

        return false;
    }

    public boolean Registrar(String contraseña, String nombre) {
        PreparedStatement pst = null;
        try {
            String consulta = "insert into usuario (id,nombre)"
                    + "values(?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, contraseña);
            pst.setString(2, nombre);
            //pst.setString(3, nom_usuario);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception e) {
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        }

        return false;

    }
   /*public static void main(String[] args) {
        Consultas objC = new Consultas();
        //System.out.println(objC.Registrar("123456","mario"));
       // Consultas objC = new Consultas();
        System.out.println(objC.Autenticacion("mario","123456"));
    }*/
}
