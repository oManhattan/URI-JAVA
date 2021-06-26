import java.util.Scanner;

public class URI1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 1;

        while (x != 0) {
            x = sc.nextInt();

            for (int i = 1; i <= x; i++) {
                if (i - x == 0) {
                    System.out.print(i + "\n");
                } else {
                    System.out.print(i + " ");
                }
            }
        }

        sc.close();
    }
}
