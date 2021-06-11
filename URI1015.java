/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class URI1015 {
    public static void main(String[] args) {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        double[] xy1 = new double[2];
        double[] xy2 = new double[2];
        double resultado;
        
        for (int i = 0; i < xy1.length ; i++) {
            xy1[i] = entrada.nextDouble();
        }
        for (int i = 0; i < xy2.length ; i++) {
            xy2[i] = entrada.nextDouble();
        }
        
        //Processamento
        resultado = Math.sqrt((Math.pow((xy1[0] - xy2[0]), 2)) + (Math.pow((xy1[1] - xy2[1]), 2)));
        
        //Saida
        System.out.printf("%1.4f", resultado);
        entrada.close();
    }
}
