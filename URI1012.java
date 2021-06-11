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
public class URI1012 {
    public static void main(String[] args){
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;
        
        //Entrada
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        //Processamento
        triangulo = (a * c) / 2;
        circulo = 3.14159 * Math.pow(c, 2);
        trapezio = ((a + b) * c) / 2;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;
        
        //Saida
        System.out.printf("TRIANGULO: %1.3f\nCIRCULO: %1.3f\nTRAPEZIO: %1.3f\nQUADRADO: %1.3f\nRETANGULO: %1.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);
        entrada.close();
    }
}
