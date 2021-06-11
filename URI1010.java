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
public class URI1010 {
    public static void main(String[] args){
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("VALOR A PAGAR: R$ 0.00");
        double[] peca1 = new double [3];
        double[] peca2 = new double [3];
        double valortotal;
        //Entrada
        for(int i = 0; i < 3; i++){
            peca1[i] = entrada.nextDouble();
        }
        
        /*for(int i = 0; i < 3; i++){
            System.out.println(peca1[i]);
        }*/
        
        for(int i = 0; i < 3; i++){
            peca2[i] = entrada.nextDouble();
        }
        
        /*for(int i = 0; i < 3; i++){
            System.out.println(peca2[i]);
        }*/
        
        //Processamento
        valortotal = (peca1[1] * peca1[2]) + (peca2[1] * peca2[2]);
        
        //Saida
        System.out.println(format.format(valortotal));
        entrada.close();
    }
}
