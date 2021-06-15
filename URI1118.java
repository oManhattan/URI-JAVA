import java.util.Scanner;

public class URI1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean condicao = true;
        boolean condicao1 = true;
        float media = 0;
        int cont = 0;

        do {
            do {
                double aux = sc.nextDouble();

                if (aux >= 0 && aux <= 10) {
                    media = (float) (media + aux);
                    cont++;
                } else {
                    System.out.println("nota invalida");
                }
            } while (cont < 2);

            System.out.printf("media = %.2f\n", media / 2);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");

                int escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        condicao1 = false;
                        break;
                    case 2:
                        condicao = false;
                        condicao1 = false;
                        break;
                }
            } while (condicao1);

            media = 0;
            cont = 0;
            condicao1 = true;
        } while (condicao);

        sc.close();
    }
}
