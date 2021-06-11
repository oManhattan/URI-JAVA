import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        float num = 0, media = 0;
        int contador = 0;

        for (int i = 0; i < 6; ++i) {
            num = entrada.nextFloat();

            if (num > 0) {
                // adicionando a contagem de números positivos
                contador++;

                // adicionhando o número a média
                media = num + media;
            }
        }

        System.out.printf("%d valores positivos\n", contador);
        System.out.println(format.format(media / contador));

        entrada.close();
    }
}
