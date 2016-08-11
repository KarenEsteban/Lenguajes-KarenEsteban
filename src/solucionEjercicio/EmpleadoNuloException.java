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
public class EmpleadoNuloException extends Exception{
    public EmpleadoNuloException(){
        super("El departamento no puede ser nulo");
    }
    
}
