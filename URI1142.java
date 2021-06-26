import java.util.Scanner;

public class URI1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int cont = 1;

        for (int i = 0; i < num; i++) {  

            while (cont % 4 != 0) {
                System.out.print(cont + " ");
                cont++;
            }

            System.out.print("PUM\n");
            cont++;
       }

       sc.close();
    }
}
