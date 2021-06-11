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
public class URI1017 {
    public static void main(String[] args) {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        int tempo, vm;
        double gasto;
        
        //Entrada
        tempo = entrada.nextInt();
        vm = entrada.nextInt();
        
        //Processamento
        gasto = (vm * tempo) / 12.0;
        
        //Saida
        System.out.printf("%1.3f\n", gasto);
        entrada.close();
        
    }
}
