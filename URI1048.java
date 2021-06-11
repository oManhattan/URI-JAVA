import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
 
        //declarando variáveis
        DecimalFormat format = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        double salario;
        
        //Entrada
        salario = entrada.nextDouble();
        
        //Processamento e saída
        if (salario <= 400) {
            System.out.println("Novo salario: " + format.format(salario * 1.15) + "\nReajuste ganho: " + format.format(salario * 0.15) + "\nEm percentual: 15 %");
        } else if (salario > 400 && salario <= 800) {
            System.out.println("Novo salario: " + format.format(salario * 1.12) + "\nReajuste ganho: " + format.format(salario * 0.12) + "\nEm percentual: 12 %");
        } else if (salario > 800 && salario <= 1200) {
            System.out.println("Novo salario: " + format.format(salario * 1.1) + "\nReajuste ganho: " + format.format(salario * 0.1) + "\nEm percentual: 10 %");
        } else if (salario > 1200 && salario <= 2000) {
            System.out.println("Novo salario: " + format.format(salario * 1.07) + "\nReajuste ganho: " + format.format(salario * 0.07) + "\nEm percentual: 7 %");
        } else if (salario > 2000) {
            System.out.println("Novo salario: " + format.format(salario * 1.04) + "\nReajuste ganho: " + format.format(salario * 0.04) + "\nEm percentual: 4 %");
        }
        
        entrada.close();
    }
}
