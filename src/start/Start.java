/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import classes.Imposto;
import classes.Inss;
import classes.Irrf;
import java.util.Scanner;

/**
 *
 * @author Hiago
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Irrf ir = new Irrf();
        Inss in = new Inss();
        System.out.print("Seu salário: ");
        double salario = ent.nextDouble();
        System.out.println("Seu salário: R$ " + in.getSalarioBase() + "\nIRRF: R$ " + ir.calcularImposto(salario) + "\nINSS R$: " + in.calcularImposto(salario));
    } 

}
