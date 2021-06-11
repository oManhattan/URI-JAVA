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
public class URI1079 {
    public static void main(String[] URI1079) {
        DecimalFormat format = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        
        int casos = entrada.nextInt();
        
        for (int i = 0; i < casos; ++i) {
            //recebendo as notas
            float N1 = entrada.nextFloat();
            float N2 = entrada.nextFloat();
            float N3 = entrada.nextFloat();
            
            //calculando as medias
            double media = (N1*0.2) + (N2*0.3) + (N3*0.5);
            
            System.out.println(format.format(media));
            entrada.close();
        }
    }
}
