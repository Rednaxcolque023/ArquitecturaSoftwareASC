/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principiossolid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexander SC
 */
public class ConexionMySQL implements IConexion {

    String bd;
    String nombre;
    String password;

    public ConexionMySQL(String bd, String usuario, String password) {
        this.bd = bd;
        this.nombre = usuario;
        this.password = password;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ConexionMySQL(String bd_examen, String root, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/" + bd, nombre, password);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    public boolean ejecutarSQL(String sql) {
        try {
            Connection con = conectar();
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.executeUpdate();
            return true;
   
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        
          return false;
        }
       
        
    }

}