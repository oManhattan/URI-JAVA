import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        //Declarando variáveis
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00000");
        double A, B, C, R1, R2, DELTA, DIVISOR, GAGA;
        
        //Entrada
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        
        input.close();
        
        //Processamento
        
        GAGA = 4 * A * C;
        
        DELTA = Math.pow(B, 2) - GAGA;
        
        DIVISOR = A * 2;
        
        R1 = (- B + Math.sqrt(DELTA)) / DIVISOR;
        R2 = (- B - Math.sqrt(DELTA)) / DIVISOR;
        
        //Saída
        
        if (DELTA >= 0) {
            if (DIVISOR != 0) {
               System.out.println("R1 = " + format.format(R1));
               System.out.println("R2 = " + format.format(R2));
            } else {
                System.out.println("Impossivel calcular");
            }
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
