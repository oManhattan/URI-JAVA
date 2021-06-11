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
public class URI1013 {
    public static void main(String[] args) {
        //Declarando Variaveis
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[3];
        int aux;
        boolean controle;
        
        //Entada
        for (int i = 0; i < num.length; i++) {
            num[i] = entrada.nextInt();
        }
        
        //Processamento (Bubble Sort)
        for (int i = 0; i < num.length; i++){
            controle = true;
            for (int j = 0; j < (num.length - 1); j++){
                if (num[j] > num[j + 1]) {
                    aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;
                    controle = false;
                }
            }
            if (controle){
                break;
            }
        }
        
        //Saida
        /*for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        */
        System.out.print(num[2] + " eh o maior");
        entrada.close();
    }
}
