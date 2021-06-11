import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        //Declarando variáveis
        Scanner entrada = new Scanner(System.in);
        double A, B, C, PERIMETRO, AREA;
        
        //Entrada
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        
        entrada.close();
        
        //Processamento e saída
        if (B > Math.abs(A - C) && B < A + C && C > Math.abs(A - B) && C < A + B && A > Math.abs(B - C) && A < B + C) {
            PERIMETRO = A + B + C;
            System.out.println("Perimetro = " + PERIMETRO);
        } else {
            AREA = ((A + B) * C) / 2;
            System.out.println("Area = " + AREA);
        }
    }
}
