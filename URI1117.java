import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float media = 0;
        boolean condicao = true;
        int cont = 0;

        do {
            float aux = sc.nextFloat();

            if (aux >= 0 && aux <= 10) {
                media = media + aux;
                cont++;
            } else {
                System.out.println("nota invalida");
            }

            if (cont == 2) {
                condicao = false;
            }

        } while (condicao);

        System.out.println("media = " + media / 2);

        sc.close();
    }
}
