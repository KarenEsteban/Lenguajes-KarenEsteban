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
public class Imc {
    private double altura;
    private double peso;
    
    public void setAltura(double altura){
      if (altura <0){
          altura=0;
          System.out.println("No debes meter valores menores a 0");
      } 
      this.altura=altura;
    }
    public void setPeso(double peso){
        if(peso<0){
            peso=0;
            System.out.println("No debes meter valores menores a 0");
        }
        this.peso=peso;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double getPeso(){
        return peso;
    }
}
