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
public class URI1004 {
    public static void main(String[] args) {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        int prod, a, b;
        
        //Entrada
        a = entrada.nextInt();
        b = entrada.nextInt();
        
        //Processamento
        prod = a * b;
        
        //Saida
        System.out.println("PROD = "+ prod);
        entrada.close();
    }
}
