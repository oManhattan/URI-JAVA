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
public class URI1006 {
    public static void main(String[] args){
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0");
        double a, b, c, media;
        
        //Entrada
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        //Processo
        media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        
        //Saida
        System.out.println("MEDIA = " + format.format(media));
        entrada.close();
        
    }
}
