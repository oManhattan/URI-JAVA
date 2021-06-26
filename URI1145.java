import java.util.Scanner;

public class URI1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cont = 0;

        for (int i = 1; i <= y; i++) {

            if (cont < x - 1) {
                System.out.print(i + " ");
                cont++;
            } else {
                System.out.print(i + "\n");
                cont = 0;
            }

        }
        sc.close();
    }
}
