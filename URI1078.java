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
public class URI1078 {
    public static void main(String[] URI1078) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d x %d = %d\n", i, x, (x * i));
        }
        entrada.close();
    }
}
