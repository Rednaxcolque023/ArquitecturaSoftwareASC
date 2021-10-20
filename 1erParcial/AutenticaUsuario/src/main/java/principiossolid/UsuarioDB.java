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
public class UsuarioDB {
    Usuario usuario;
    IConexion coneccion;

    public UsuarioDB(Usuario usuario, IConexion coneccion) {
        this.usuario = usuario;
        this.coneccion = coneccion;
    }
  
    
    public void guardarDB()
    {
      if ( coneccion.ejecutarSQL("INSERT INTO usuario (id,nombre,password) VALUES('"+usuario.getId()+"','"+usuario.getNombre()+"','"+usuario.getPassword()+"'')"))
            System.out.println("Se inserto con éxito");
      else
          System.out.println("Ocurrio un Error");
    
    }
}
