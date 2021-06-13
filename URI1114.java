import java.util.Scanner;

public class URI1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "2002";
        String senhaEntrada;
        boolean condicao = true;

        do {
            senhaEntrada = sc.nextLine();

            if (senhaEntrada.equals(senhaCorreta)) {
                System.out.println("Acesso Permitido");
                condicao = false;
            } else {
                System.out.println("Senha Invalida");
            }
        } while (condicao);

        sc.close();
    }
}
