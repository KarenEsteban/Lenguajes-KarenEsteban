/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-107
 */

//Aqui usaremos las excepciones de tipo checked, en las que tu te tienes que hacer cargo de ellas
//Vamos usar un paquete que no se encuentra por defecto, tienes que agregarlo con un import
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SegundaExcepcion {
    public static void main(String[] args) {
        
        //Input --> Leer
        //Output -->Escribir
        File f=new File("D:\\archivaldo");
        try {
            FileInputStream fis=new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            
        }
        
    }
    
}
