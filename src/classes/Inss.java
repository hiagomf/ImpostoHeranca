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
public class Inss extends Imposto {

    @Override
    public double calcularImposto(double salario) {
        if (salario <= 1556.94) {
            return salario * 0.085;
        } else if (salario <= 2594.92) {
            return salario * 0.09;
        }
        return salario * 0.11;
    }
}
