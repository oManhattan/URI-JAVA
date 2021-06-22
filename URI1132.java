import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = 0;

        for (int i = Math.min(x, y); i <= Math.max(x, y); i++) {
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);
        
        sc.close();
    }
}
