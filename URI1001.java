/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import  java.util.Scanner;

public class URI1001 {
    public static void main(String[] args) {
        //Declarando variaveis
        int a, b, x;
        Scanner teclado = new Scanner(System.in);
        
        //Entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        
        //Desenvolvimento
        x  = a + b;
        
        //Saida
        System.out.print("X = " + x);
        
        teclado.close();
    }
}
