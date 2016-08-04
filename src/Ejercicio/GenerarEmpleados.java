/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Esteb
 */
public class GenerarEmpleados {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=5; i++){
                    try{
                        
                    }catch(EmpleadoException ex){
                        
                    }catch(DepartamentoException ex){
                        
                    }
                }
            }
        });
        t.start();
    }
    
}
