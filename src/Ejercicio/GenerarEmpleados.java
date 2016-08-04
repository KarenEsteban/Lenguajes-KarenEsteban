/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.logging.Level;
import java.util.logging.Logger;

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
                    Departamento d=new Departamento("Sistemas");
                    Empleado e=new Empleado(i,"Empleado"+i,d);
                    if(e.getIdEmpleado()==0){
                        try {
                            throw  new EmpleadoException();
                        } catch (EmpleadoException ex) {
                            Logger.getLogger(GenerarEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }if(e.getDepartamento()==null){
                        try {
                            throw new DepartamentoException();
                        } catch (DepartamentoException ex) {
                            Logger.getLogger(GenerarEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                }
            }
        });
        t.start();
    }
    
}
