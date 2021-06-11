import java.util.Scanner;

public class URI1042 {
    public static void mains(String[] args) {
        //Declarando variáveis
        Scanner entrada = new Scanner(System.in);
        int X, Y, Z;
        
        //Entrada
        X = entrada.nextInt();
        Y = entrada.nextInt();
        Z = entrada.nextInt();
        
        //Processamento e Saída
        if (X == Math.min(X, Y) && X == Math.min(X, Z)) {
            System.out.println(X);
            System.out.println(Math.min(Y, Z));
            System.out.println(Math.max(Y, Z) + "\n");
            System.out.println(X);
            System.out.println(Y);
            System.out.println(Z);
            
        } else if (Y == Math.min(Y, X) && Y == Math.min(Y, Z)) {
            System.out.println(Y);
            System.out.println(Math.min(X, Z));
            System.out.println(Math.max(X, Z) + "\n");
            System.out.println(X);
            System.out.println(Y);
            System.out.println(Z);
        } else {
            System.out.println(Z);
            System.out.println(Math.min(X, Y));
            System.out.println(Math.max(X, Y) + "\n");
            System.out.println(X);
            System.out.println(Y);
            System.out.println(Z);
        }

        entrada.close();
    }
}
