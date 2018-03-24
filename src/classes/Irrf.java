/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Hiago
 */
public class Irrf extends Imposto {
    
    @Override
    public double calcularImposto(double salario) {
        if (salario <= 1903.98) {
            return 0;
        } else if (salario <= 2826.65) {
            return salario * 0.075;
        }else if(salario <= 3751.05){
            return salario * 0.15;
        }else if(salario <= 4664.68){
            return salario * 22.5;
        }
        return salario * 0.275;
    }
    /*@Override
    public double calcularImposto(double salario) {
        if (salario <= 1903.98) {
            return 0;
        } else if (salario <= 2826.65) {
            return salario * 0.075;
        }else if(salario <= 3751.05){
            return salario * 0.15;
        }else if(salario <= 4664.68){
            return salario * 22.5;
        }
        return salario * 0.275;
    }*/

}
