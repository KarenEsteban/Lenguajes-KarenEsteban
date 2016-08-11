/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casodeuso;

/**
 *
 * @author T-107
 */
public class CasoDeUso {
    public static void main(String[] args) {
        //Arreglos polimorficos
        Animal animalitos[]={new Delfin(),new Aguila(),new Vibora(),new Leon(),new Leon(),new Delfin(),new Vibora()};
        for(Animal ani:animalitos){
            ani.comer();
            ani.ruido();
        
        }
    }
}
