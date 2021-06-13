import java.util.Scanner;

public class URI1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aux;
        int n, x, y, temp1, temp2;
        
        n = Integer.parseInt(sc.nextLine());

        aux = new int[n];

        for (int i = 0; i < n; i++) {
            String[] aux1 = sc.nextLine().split(" ");

            x = Integer.parseInt(aux1[0]);
            y = Integer.parseInt(aux1[1]);

            temp1 = Math.min(x, y) + 1;
            temp2 = Math.max(x, y);

            while (temp1 < temp2) {
                if (temp1 % 2 != 0) {
                    aux[i] = aux[i] + temp1;
                }

                temp1++;
            }
        }

        for (int i : aux) {
            System.out.println(i);
        }

        sc.close();
    }
}
