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
public class URI1074 {
    public static void main(String[] URI1074) {
        Scanner entrada = new Scanner(System.in);
        
        int x = entrada.nextInt();
        int quant[] = new int[x];
        
        for (int i = 0; i < quant.length; ++i) {
            quant[i] = entrada.nextInt();
            }
        
        for (int i = 0; i < quant.length; ++i) {
            
            if (quant[i] % 2 == 0 && quant[i] != 0) {
                if (quant[i] > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } 
            if (quant[i] % 2 != 0) {
                if (quant[i] > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
            if (quant[i] == 0) {
                System.out.println("NULL");
            }
        }
            
    }
}

