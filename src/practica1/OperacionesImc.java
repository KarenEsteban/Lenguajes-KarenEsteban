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
public class OperacionesImc {
    public String calcularImc(Imc i){
    
        double imcPromedio = i.getPeso()/(i.getAltura()*i.getAltura()); 
        if (imcPromedio < 18 ){ 
        return "Estado: Peso bajo  IMC: "+imcPromedio;
        } else if (imcPromedio >= 18 && imcPromedio <25) { 
        return "Estado: Peso normal  IMC: "+imcPromedio;
        } else if (imcPromedio >=25 && imcPromedio <27) {
        return "Estado: Ligero sobrepeso  IMC:"+imcPromedio;
        } else {
        return "Estado: Obesidad  IMC: "+imcPromedio;
        }
    }
}
