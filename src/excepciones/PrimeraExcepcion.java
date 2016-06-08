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
public class PrimeraExcepcion {
    
    public static void main(String[] args) {
        //Veremos primero las mas comunes de las unchecked
        float x=4;
        int y=0;
        
        System.out.println(x/y);
        //La excepcion aritmetica solamente se da cuando se tienen enteros
        //Si se cambia a float el resultado es infinity    
        
        String falsoNumero="5";
        int numeroReal=5;
        System.out.println("Este es antes de la excepcion");
        int suma=Integer.parseInt(falsoNumero)+numeroReal;
        System.out.println("Todo esta bien hasta aqui");
        if(true){
            System.out.println("siempre aparece");
        }
        System.out.println("La ejecucion siempre pasa aqui se ejecute o no el if");
    }
   
}
