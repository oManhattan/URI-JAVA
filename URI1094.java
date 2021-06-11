import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        //Quantas cobaias
        //Percentual de cada tipo de cobaia

        //Sapos, ratos e coelhos

        //Entrada
        //1st line = valor int que indica os varios casos de teste
        //cada caso contem um int 1 <= n <= 15 e um tipo de char C R S

        Scanner sc = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00 %");

        double total, coelho = 0, sapo = 0, rato = 0;
        
        int casos = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < casos; i++) {
            String info = sc.nextLine();
            
            String[] aux = info.split(" ");
            
            switch (aux[1].toUpperCase().charAt(0)) {
                case 'C':
                    coelho = coelho + Integer.parseInt(aux[0]);
                    break;
                case 'R':
                    rato = rato + Integer.parseInt(aux[0]);
                    break;
                case 'S':
                    sapo = sapo + Integer.parseInt(aux[0]);
                    break;
            }     
        }
        
        total = coelho + rato + sapo;
        
        System.out.printf("Total: %.0f cobaias\n", total);
        System.out.printf("Total de coelhos: %.0f\n", coelho);
        System.out.printf("Total de ratos: %.0f\n", rato);
        System.out.printf("Total de sapos: %.0f\n", sapo);
        System.out.println("Percentual de coelhos: " + format.format((coelho / total)));
        System.out.println("Percentual de ratos: " + format.format((rato / total)));
        System.out.println("Percentual de sapos: " + format.format((sapo / total)));

        sc.close();
    }
}