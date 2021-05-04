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
public class URI1075 {
    public static void main(String[] URI1075) {
        Scanner entrada = new Scanner(System.in);
        int x = 0, num = entrada.nextInt();
        
        while (x < 10000) {
            x++;
            
            if (x % num == 2) {
                System.out.println(x);
            }
        }
    }
}
