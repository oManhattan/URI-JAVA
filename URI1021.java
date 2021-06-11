import java.util.Scanner;

public class URI1021 {
    public static void mains(String[] args) {
        //Declarando variáveis
        Scanner keyboard = new Scanner(System.in);
        double VALOR, MOEDA;
        int NOTAS;
        
        //Entrada
        VALOR = keyboard.nextDouble();
        
        keyboard.close();
        
        //Processamento 
        
        NOTAS = (int) VALOR;
        
        MOEDA = (VALOR - NOTAS) * 100;

        System.out.println("NOTAS:");
        
        System.out.println((int) VALOR / 100 + " nota(s) de R$ 100.00");
        VALOR = VALOR % 100;
        System.out.println((int) VALOR / 50 + " nota(s) de R$ 50.00");
        VALOR = VALOR % 50;
        System.out.println((int) VALOR / 20 + " nota(s) de R$ 20.00");
        VALOR = VALOR % 20;
        System.out.println((int) VALOR / 10 + " nota(s) de R$ 10.00");
        VALOR = VALOR % 10;
        System.out.println((int) VALOR / 5 + " nota(s) de R$ 5.00");
        VALOR = VALOR % 5;
        System.out.println((int) VALOR / 2 + " nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        VALOR = VALOR % 2;
        System.out.println((int) VALOR + " moeda(s) de R$ 1.00");
   
        System.out.println((int) MOEDA / 50 + " moeda(s) de R$ 0.50");
        MOEDA = MOEDA % 50;
        System.out.println((int) MOEDA / 25 + " moeda(s) de R$ 0.25");
        MOEDA = MOEDA % 25;
        System.out.println((int) MOEDA / 10 + " moeda(s) de R$ 0.10");
        MOEDA = MOEDA % 10;
        System.out.println((int) MOEDA / 5 + " moeda(s) de R$ 0.05");
        MOEDA = MOEDA % 5;
        System.out.println((int) MOEDA + " moeda(s) de R$ 0.01");

        keyboard.close();
    }
}
