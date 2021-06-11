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
public class URI1016 {
    public static void main(String[] args) {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        double tempofinal;
        int distancia;
        
        //Entrada
        distancia = entrada.nextInt();
        
        //Processo
        tempofinal = 1/30.0 * distancia;
        
        //Saida
        System.out.printf("%1.0f minutos\n", tempofinal*60);
        entrada.close();
    }
}
