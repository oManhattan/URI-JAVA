import java.util.Scanner;

public class URI1044 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B;
        
        //Entrada
        A = entrada.nextInt();
        B = entrada.nextInt();
        
        //Processamento e saída
        if ((A % B) == 0 || (B % A) == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        entrada.close();
    }
}
