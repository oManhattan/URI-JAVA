

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class URI1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, contador = 0, maiorValor = 0, posicao = 0;

        do {
            valor = sc.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
                posicao = contador;
            }
        } while (contador <= 100);

        System.out.println(maiorValor);
        System.out.println(posicao);

        sc.close();
    }
}
