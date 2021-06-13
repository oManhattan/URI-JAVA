import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class URI1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;
        ArrayList<String> lista = new ArrayList<String>();
        DecimalFormat format = new DecimalFormat("0.0");

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] aux = sc.nextLine().split(" ");

            x = Integer.parseInt(aux[0]);
            y = Integer.parseInt(aux[1]);

            try {

                float temp = x / y;

                if (y == 0) {
                    lista.add("divisao impossivel");
                } else {
                    lista.add(format.format(temp));
                }
                
            } catch (Exception e) {
                lista.add("divisao impossivel");
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        sc.close();
    }
}
