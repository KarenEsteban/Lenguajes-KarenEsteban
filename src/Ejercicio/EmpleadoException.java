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
public class EmpleadoException extends Exception{
    public EmpleadoException(){
        super("Empleado nulo");
    }
}