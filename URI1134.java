import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicao = true;
        int alcool = 0, gasolina = 0, diesel = 0;

        do {
            int entrada = sc.nextInt();

            switch (entrada) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                case 4:
                    condicao = false;
                    break;
            }
        } while (condicao);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}
