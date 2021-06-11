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

public class URI1008 {
    public static void main(String[] args){
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");
        int employeenb, qnthour;
        double perhour, salary;
        
        //Entrada
        employeenb = entrada.nextInt();
        qnthour = entrada.nextInt();
        perhour = entrada.nextDouble();
        
        //Processamento
        salary = qnthour * perhour;
        
        //Saida
        System.out.printf("NUMBER = %d\nSALARY = %s\n", employeenb, format.format(salary));
        entrada.close();
    }
}
