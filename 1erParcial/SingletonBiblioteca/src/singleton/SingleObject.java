/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Alexander SC
 */
public class SingleObject {
    private static SingleObject instance;
    private String nombre;
    private String direccion;
    private int telefono;
    
    private SingleObject() {
    }
     
    public  static SingleObject getInstance()
    {
        if (instance==null)    
            instance=new SingleObject();
       return instance; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    public void Mensaje ()
    {
        System.out.println(nombre);
        System.out.println(direccion);
        System.out.println(telefono);
    }
}
