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
public class URI1014 {
    public static void main(String[] args) {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        int km;
        double gas, total;
        
        //Entrada
        km = entrada.nextInt();
        gas = entrada.nextDouble();
        
        //Processo
        total = km / gas;
        
        //Saida
        System.out.printf("%1.3f km/l", total);
        entrada.close();
    }
}
