import java.util.Scanner;

public class URI1035 {
    public static void main(String[] args) {
        // Declarando variáveis
        Scanner input = new Scanner(System.in);
        int A, B, C, D;
        
        //Entrada
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        
        input.close();
        
        //Processamento e Saída

        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

       input.close();
    }
}
