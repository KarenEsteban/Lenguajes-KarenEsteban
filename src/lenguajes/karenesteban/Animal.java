/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.karenesteban;


public class Animal {
    
    String nombre;
    boolean agresivo;
    int edad;
    
    
   // public Animal(){
   //     nombre="leon";
   // }
    
    //CONSTRUCTOR 1
    //Constructor por defecto
    public Animal() {   
    nombre = " ";
    edad = 0;     
    }
    
    //CONSTRUCTOR2
    public Animal(String nuevoAnimal) {   
    nombre = nuevoAnimal;
    edad = 0;     
    }

  
}
