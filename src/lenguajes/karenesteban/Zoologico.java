/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.karenesteban;

public class Zoologico {
    public static void main(String[] algo) {
        System.out.println("Vamos a crear un animal");
        int x=5;
        Animal objeto1=new Animal();
        
        System.out.println(objeto1.nombre); 
        System.out.println(objeto1.edad);
        
        Animal objeto2=new Animal("Leon");
        System.out.println(objeto2.nombre); 
        System.out.println(objeto2.edad);
        
    }
    
}
