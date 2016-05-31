/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Esteb
 */
public class ProbarImc {
    public static void main(String[] args) {
        Imc i=new Imc();
        i.setAltura(1.54);
        i.setPeso(23);
        
    OperacionesImc ope=new OperacionesImc();
    System.out.println(ope.calcularImc(i)); 
    }
   
}
