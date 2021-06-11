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
public class URI1007 {
    public static void main(String[] args) {
        //Declarando Variavel
        Scanner entrada = new Scanner(System.in);
        int dif, a, b, c, d;
        
        //Entrada
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();
        
        //Processo
        dif = (a * b) - (c * d);
        
        //Saida
        System.out.println("DIFERENCA = "+ dif);
        entrada.close();
    }
}
