import java.util.ArrayList;
import java.util.Scanner;

public class URI1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        boolean condicao = true;
        
        ArrayList<String> lista = new ArrayList<String>();
        
        while (condicao) {
            String[] aux = sc.nextLine().split(" ");
            x = Integer.parseInt(aux[0]);
            y = Integer.parseInt(aux[1]);

            if (x > 0 && y > 0) {
                lista.add("primeiro");
            } else if (x < 0 && y > 0) {
                lista.add("segundo");
            } else if (x < 0 && y < 0) {
                lista.add("terceiro");
            } else if (x > 0 && y < 0) {
                lista.add("quarto");
            } else {
                condicao = false;
            }
        }
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        sc.close();
    }
}
