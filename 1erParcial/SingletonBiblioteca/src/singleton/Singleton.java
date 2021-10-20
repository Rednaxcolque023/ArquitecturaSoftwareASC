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
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SingleObject single=SingleObject.getInstance();
        single.setNombre("Biblioteca Tecnologica");
        single.setDireccion("Regimiento Campos 6 de Infanteria,Sucre");
        single.setTelefono(46456515);
        System.out.println(single.getNombre());
        System.out.println(single.getDireccion());
        System.out.println(single.getTelefono());  
        
    }
    
}
