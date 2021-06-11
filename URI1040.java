import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        //Declarando variáveis
        DecimalFormat format = new DecimalFormat("0.0");
        Scanner keyboard = new Scanner(System.in);
        double N1, N2, N3, N4, MEDIA1, MEDIA2, EXAME;
        
        //Entrada
        N1 = keyboard.nextDouble();
        N2 = keyboard.nextDouble();
        N3 = keyboard.nextDouble();
        N4 = keyboard.nextDouble();
        
        //Processamento
        
        MEDIA1 = ((N1 * 2) + (N2 * 3) + (N3 * 4) + N4) / 10;
        
        if (MEDIA1 >= 7) {
            System.out.println("Media: " + format.format(MEDIA1));
            System.out.println("Aluno aprovado.");
        } else if (MEDIA1 >= 5 && MEDIA1 < 7) {
            System.out.println("Media: " + format.format(MEDIA1));
            System.out.println("Aluno em exame.");
            
            //Nota do exame
            EXAME = keyboard.nextDouble();
            System.out.println("Nota do exame: " + format.format(EXAME));
            
            //Processamento
            MEDIA2 = (MEDIA1 + EXAME) / 2;
            
            //Saída
            if (MEDIA2 >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + MEDIA2);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + MEDIA2);
            }
        } else {
            System.out.println("Media: " + format.format(MEDIA1));
            System.out.println("Aluno reprovado.");
        }

        keyboard.close();
    }
}
