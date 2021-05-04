/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UriJudgePack;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class URI1080 {
    public static void main(String[] URI1080) {
        DecimalFormat format = new DecimalFormat("0");
        Scanner entrada = new Scanner(System.in);
        double contador = 0, ajuda = 0, random = 0;
        double num[] = new double[100];
        
        for (int i = 0; i < num.length; ++i) {
            random = Math.random();
            num[i] = random * 1000;
            
            System.out.println((i + 1) + ". " + format.format(num[i]));
            }
        
        for (int i = 1; i < num.length; ++i) {
            for (int j = 0; j < num.length; ++j) {
                
            }
        }
        
        System.out.println("\n\n\nMaior numero -> " + ajuda);
        System.out.println("Posição do número -> " + contador);
    }
}
