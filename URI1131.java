import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicao = true, condicao1 = true;
        int inter = 0, gremio = 0, empate = 0, grenal = 0;

        do {
            String[] aux = sc.nextLine().split(" "); // Inter, Gremio

            if (Integer.parseInt(aux[0]) == Integer.parseInt(aux[1])) {
                empate++;
            } else if (Integer.parseInt(aux[0]) > Integer.parseInt(aux[1])) {
                inter++;
            } else {
                gremio++;
            }

            grenal++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            do {
                int entrada = Integer.parseInt(sc.nextLine());

                switch (entrada) {
                    case 1:
                        condicao1 = false;
                        break;
                    case 2:
                        condicao = false;
                        condicao1 = false;
                        break;
                }
            } while (condicao1);
            

            condicao1 = false;
        } while (condicao);

        System.out.println(grenal + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);

        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else if (gremio > inter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        sc.close();
    }
}
