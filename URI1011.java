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
public class URI1011 {
    public static void main(String[] args){
        //Declarando variaveis
        DecimalFormat format = new DecimalFormat("VOLUME = 0.000");
        Scanner entrada = new Scanner(System.in);
        double area, raio;
        
        //Entrada
        raio = entrada.nextDouble();
        
        //Processamento
        area = (4/3.0) * 3.14159 * Math.pow(raio, 3);
        
        //Saida
        System.out.println(format.format(area));
        entrada.close();
    }
}
