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
public class Departamento {
    private Integer id;
    private String nombre;
    
    public Departamento(){
        
    }
    public Departamento(Integer id,String nombre) throws ValorMenorQueCeroException{
        if(id<0) throw new ValorMenorQueCeroException();
        this.id=id;
        this.nombre=nombre; 
    }
    public void setId(Integer id) throws ValorMenorQueCeroException{
        if(id<0) throw new ValorMenorQueCeroException();
        this.id=id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Integer getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
}
