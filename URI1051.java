import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args) {
 
        //declarando variaveis
        DecimalFormat format = new DecimalFormat("R$ 0.00");
        Scanner entrada = new Scanner(System.in);
        double salario;
        
        //entrada
        salario = entrada.nextDouble();
        
        //processamento e saída
        if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000) {
            salario = salario - 2000;
            System.out.println(format.format(salario * 0.08));
        } else if (salario > 3000 && salario <= 4500) {
            salario = (salario - 3000) * 0.18;
            System.out.println(format.format(salario + 80));
        } else if (salario > 4500) {
            salario = (salario - 4500) * 0.28;
            System.out.println(format.format(salario + 350));
        }

        entrada.close();
    }
}
