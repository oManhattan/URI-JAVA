import java.util.ArrayList;
import java.util.Scanner;

public class URI1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<String>();
        String[] aux;
        int x, y;
        boolean condicao = true;

        while (condicao) {
            aux = sc.nextLine().split(" ");

            x = Integer.parseInt(aux[0]);
            y = Integer.parseInt(aux[1]);

            if (x == y) {
                condicao = false;
            } else if (x > y) {
                lista.add("Decrescente");
            } else if (x < y) {
                lista.add("Crescente");
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        sc.close();
    }
}
