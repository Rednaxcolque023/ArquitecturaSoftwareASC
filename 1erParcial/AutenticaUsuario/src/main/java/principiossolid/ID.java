/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principiossolid;

/**
 *
 * @author Alexander SC
 */
public class ID {
        public static void main(String[] args) {
        
        ConexionMySQL conmysql=new  ConexionMySQL("bd_examen", "root", "");
        Usuario usuario = new Usuario(1, "Usuario Uno","123");
            IConexion conposgre = null;
        UsuarioDB usuarioDB = new UsuarioDB(usuario,conposgre);
        usuarioDB.guardarDB();

    }
}
