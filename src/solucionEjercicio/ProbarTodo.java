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
public class ProbarTodo {
    public static void main(String[] args) {
        Departamento depa=new Departamento();
        try{
        depa.setId(1);
        depa.setNombre("Sistemas");
        System.out.println("Departamento creado");
        GeneradorDeEmpleados.generar();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }   
    }
}
