import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num, par = 0, impar = 0, positivo = 0, negativo = 0;

        for (int i = 0; i < 5; ++i) {
            num = entrada.nextInt();
            // Determinando se o número é par ou ímpar
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            // Determinando se o número é positivo ou negativo
            if (num > 0) {
                positivo++;
            } else {
                negativo = (num == 0) ? negativo : ++negativo;
            }
        }

        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", par, impar, positivo, negativo);

        entrada.close();
    }
}
