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
public class ValorMenorQueCeroException extends Exception{
    public ValorMenorQueCeroException(){
        super("El id debe ser mayor que cero");    
    }
    
}
