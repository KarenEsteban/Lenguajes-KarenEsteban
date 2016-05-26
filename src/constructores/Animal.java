/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

public class Animal {
    String nombre;
    String especie;
    boolean carnivoro;
    

    public Animal(String valor){
        nombre=valor;
    }
  //Constructor por defecto  
     public Animal(){
        nombre="Leon";
    }
   //Constructor 1 
     public Animal(String valor1,String valor2 ){
         especie=valor1;
         nombre=valor2;
     }
    //Constructor 2 
    public Animal(boolean valor1, String valor2){
        carnivoro=valor1;
        nombre=valor2;
    }
    //Constructor 3
    public Animal(String valor1, String valor2, boolean valor3){
        nombre=valor1;
        especie=valor2;
        carnivoro=valor3;
    }
}
