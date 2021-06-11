import java.util.Scanner;

public class URI1045 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] lados = new double[3];
        double aux, N1, N2, N3, R1, R2, R3, R4, R5;
        
        for(int x = 0; x < lados.length; ++x) {
            lados[x] = entrada.nextDouble();
        }
        
        for (int y = 0; y < (lados.length - 1); ++y) {
            if (lados[y] < lados[y + 1]) {
                aux = lados[y];
                lados[y] = lados[y + 1];
                lados[y + 1] = aux;
            }
        }
        
        N1 = lados[0];
        N2 = lados[1];
        N3 = lados[2];
        
        if (N1 < N2) {
            aux = N1;
            N1 = N2;
            N2 = aux;
        }
        
        R1 = Math.pow(N2, 2);
        R2 = Math.pow(N3, 2);
        R3 = R1 + R2;
        R4 = Math.pow(N1, 2);
        R5 = N2+N3;
        
        if (N1 >= R5) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
        
          if (R4 == R3) {
               System.out.println("TRIANGULO RETANGULO");
          }
        
            if (R4 < R1 + R2) {
                System.out.println("TRIANGULO ACUTANGULO");
         }
        
            if (R4 > R1 + R2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
        
            if (N1 == N2 && N2 == N3) {
                    System.out.println("TRIANGULO EQUILATERO");
          }
        
          if ((N1 == N2 && N1 != N3) || (N1 == N3 && N1 != N2) || (N2 == N3 && N2 != N1)) {
               System.out.println("TRIANGULO ISOSCELES");
            }
        }

        entrada.close();
    }
}
