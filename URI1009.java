/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class URI1009 {
    public static void main(String[] args){
        //Declarando Variaveis
        DecimalFormat format = new DecimalFormat("R$ 0.00");
        Scanner entrada = new Scanner(System.in);
        double fixsalary, vendas, comission;
        
        //Entrada
        entrada.nextLine();
        fixsalary = entrada.nextDouble();
        vendas = entrada.nextDouble();
        
        
        //Processo
        comission = fixsalary + (vendas * 0.15);
        
        //Saida
        System.out.printf("TOTAL = %S\n", format.format(comission));
        entrada.close();
    }
}
