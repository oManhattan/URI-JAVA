import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            // Como o número é par idei adicionar +1 ao resultado e imprimi-lo na sequência
            ++num;
            System.out.println(num);

            // Agora é fazer um loop para imprimir os outros 5 números
            for (int i = 0; i < 5; ++i) {
                num = num + 2;
                System.out.println(num);
            }
        } else {
            // Como em outros cenários o número já é impar o ideal é só imprimir ele mostrar
            // os 5 sequentes
            System.out.println(num);

            for (int i = 0; i < 5; ++i) {
                num = num + 2;
                System.out.println(num);
            }
        }

        entrada.close();
    }
}
