/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UriJudgePack;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class URI1071 {
    public static void main(String[] URI1071) {
        Scanner entrada = new Scanner(System.in);
        int x, y, menor, maior,  soma = 0;
        
        x = entrada.nextInt();
        y = entrada.nextInt();
        
        menor = Math.min(x, y);
        maior = Math.max(x, y);
        
        while (menor < maior - 1) {
            menor++;
            
            if (menor % 2 != 0) {
                soma = soma + menor;
            }
        }
        
        System.out.println(soma);
    }
}
