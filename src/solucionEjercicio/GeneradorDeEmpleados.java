/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionEjercicio;

/**
 *
 * @author T-107
 */
public class GeneradorDeEmpleados {
    public static void generar()throws Exception{
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
            
               for(int i=0;i<5;i++){
                   try{
                       Departamento depa=new Departamento(i,"Sistemas");
                       Empleado emp=new Empleado(i,"Empleado "+i,depa);
                       System.out.println("Empleado: "+emp.getNombre()+"  Departamento: "+emp.getDepa().getNombre());
                   }catch(Exception e){
                       System.out.println(e.getMessage()); 
                   }  
               }
            }
        });
        t1.start();
    }
    
}
