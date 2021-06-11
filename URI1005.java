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
public class URI1005 {
    public static void main(String[] args) {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00000");
        double media, a, b;
        
        //Entrada
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        
        //Processamento
        media = ((a * 3.5) + (b * 7.5)) / 11;
        
        //Saida
        System.out.println("MEDIA = " + format.format(media));
        entrada.close();
    }
}
