import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        // Declarando variáveis
        Scanner entrada = new Scanner(System.in);
        int contador = 0, num;

        // Processo para coletar os números
        for (int i = 0; i < 5; ++i) {
            num = entrada.nextInt();

            if (num % 2 == 0) {
                contador++;
            }
        }

        System.out.println(contador + " valores pares");

        entrada.close();
    }
}
