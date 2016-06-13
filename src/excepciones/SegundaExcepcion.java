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
        File f=new File("D:\\archivaldo.txt");
        try {
            int x=2;
            int y=0;
            int div=x/y;
            
            FileInputStream fis=new FileInputStream(f);
            int ch=0;
            StringBuilder builder=new StringBuilder();
            
            while((ch=fis.read())!=-1){
            builder.append((char)ch);
        }
            System.out.println("Se leyo bien y se encontro esto: "+builder.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("Checa el nombre de tu archivo");
        } catch (IOException ex) {
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            
        }
        
    }
    
}
