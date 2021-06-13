import java.util.ArrayList;
import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> saida = new ArrayList<String>();
        String[] aux = {"1", "1"};
        String somaStr = "";
        int sum = 0, m, n;
        boolean condicao = true;

        while (condicao) {
            aux = sc.nextLine().split(" ");

            if (Integer.parseInt(aux[0]) <= 0 || Integer.parseInt(aux[1]) <= 0) {
                break;
            }

            m = Math.min(Integer.parseInt(aux[0]), Integer.parseInt(aux[1]));
            n = Math.max(Integer.parseInt(aux[0]), Integer.parseInt(aux[1]));
            somaStr = "";
            sum = 0;

            for (int i = m; i <= n; i++) {
                somaStr = somaStr +Integer.toString(i) + " ";
                sum = sum + i;
            }

            somaStr = somaStr + "Sum=" + Integer.toString(sum);

            saida.add(somaStr);
        }

        for (int i = 0; i < saida.size(); i++) {
            System.out.println(saida.get(i));
        }

        sc.close();
    }
}
