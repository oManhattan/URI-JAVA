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
public class URI1073 {
    public static void main(String[] URI1073) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0");
        int x = entrada.nextInt();
        
        for (int i = 1; i < x; ++i) {
            i++;
            
            if (i % 2 == 0) {
                System.out.println(i + "^2 = " + format.format(Math.pow(i, 2)));
            }
        }
        entrada.close();
    }
}
