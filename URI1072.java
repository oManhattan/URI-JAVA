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
public class URI1072 {
    public static void main(String[] URI1072) {
        Scanner entrada = new Scanner(System.in);
        
        int in = 0, out = 0;
        int x = entrada.nextInt();
        
        int num[] = new int[x];
        
        for (int i = 0; i < num.length; ++i) {
            num[i] = entrada.nextInt();
            
            if (num[i] >= 10 && num[i] <= 20) {
               in++; 
            } else {
                out++;
            }
        }
        
        System.out.printf("%d in\n%d out", in, out);
        entrada.close();
    }
}
