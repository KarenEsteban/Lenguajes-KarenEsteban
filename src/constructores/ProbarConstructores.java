/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-107
 */
public class ProbarConstructores {
    public static void main(String[] args) {
        
        Animal obj1=new Animal();
        System.out.println("El nombre del animal es "+obj1.nombre);
        
        Animal obj2=new Animal("Canino","Perro");
        System.out.println("El nombre del animal es "+obj2.nombre);
        System.out.println("Especie: "+obj2.especie);
        
        Animal obj3=new Animal(false, "Jirafa");
        System.out.println("Especie: "+obj3.carnivoro);
        System.out.println("El nombre del animal es "+obj3.nombre);
        
        Animal obj4=new Animal("Gato","Felino",true);
        System.out.println("El nombre del animal es "+obj4.nombre);
        System.out.println("Especie: "+obj4.especie);
        System.out.println("Carnivoro: "+obj4.carnivoro);
        
    }
}
