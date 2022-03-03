import java.util.Scanner;

public class URI1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, n;

        a = sc.nextInt();
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a = a + i;
        }

        System.out.println(a);

        sc.close();
    }
}
