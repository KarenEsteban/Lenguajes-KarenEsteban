/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarUsuarios {
    public static void main(String[] args) {
       //Paso 1 : Crear un usuario
       // Usuario u=new Usuario("Juan",20,"juan@gmail.com");
        //Paso 2: Guardar este usuario
        /*PersistenciaUsuario p=new PersistenciaUsuario();
        try {
            p.guardar(u);
            System.out.println("Usuario guardado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    */ 
        //VAMOS A LEER EL ARRAYLIST A VER QUE HAY
        //Paso 1 . Creamos un objeto de la clase persistenciaUsuario
        PersistenciaUsuario p=new PersistenciaUsuario();
        try {
            ArrayList<Usuario> usuarios = p.buscarTodos();
            int tam=usuarios.size();
            System.out.println("Usuarios guardados: "+tam);
            System.out.println(usuarios.get(1).getNombre());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }

}
