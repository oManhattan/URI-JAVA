import java.util.Scanner;

public class URI1049 {
    public static void main(String[] args) {
        //declarando variaveis
        Scanner entrada = new Scanner(System.in);
        String resp1, resp2, resp3;
        
        resp1 = entrada.nextLine();
        
        if ("vertebrado".equals(resp1)) {
            resp2 = entrada.nextLine();
            if ("ave".equals(resp2)) {
                resp3 = entrada.nextLine();
                if ("onivoro".equals(resp3)) {
                    System.out.println("pomba");
                } else if ("carnivoro".equals(resp3)) {
                    System.out.println("aguia");
                }
            } else if ("mamifero".equals(resp2)) {
                resp3 = entrada.nextLine();
                if ("onivoro".equals(resp3)) {
                    System.out.println("homem");
                } else if ("herbivoro".equals(resp3)) {
                    System.out.println("vaca");
                }
            }
        } else if ("invertebrado".equals(resp1)) {
            resp2 = entrada.nextLine();
            if ("inseto".equals(resp2)) {
                resp3 = entrada.nextLine();
                if ("hematofago".equals(resp3)) {
                    System.out.println("pulga");
                } else if ("herbivoro".equals(resp3)) {
                    System.out.println("lagarta");
                }
            } else if ("anelideo".equals(resp2)) {
                resp3 = entrada.nextLine();
                if ("hematofago".equals(resp3)) {
                    System.out.println("sanguessuga");
                } else if ("onivoro".equals(resp3)) {
                    System.out.println("minhoca");
                }
            }
        }
        
        entrada.close();
    }
}
