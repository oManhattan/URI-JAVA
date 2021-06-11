/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args){
        //Calcular circuferencia
        
        //Declarando variaveis
       DecimalFormat format = new DecimalFormat("0.0000");
       Scanner entrada = new Scanner(System.in);
       double raio, area;
       
       //Entrada
       raio = entrada.nextDouble();
       
       //Desenvolviemtno
       area = Math.pow(raio, 2) * 3.14159;
       
       //Saida
       System.out.println("A=" + format.format(area));

       entrada.close();
    }
}
