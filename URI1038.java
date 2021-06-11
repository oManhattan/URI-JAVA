import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        //Declarando variáveis
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("Total: R$ 0.00");
        int CODE, QNT;
        float TOTAL;
        
        //Entrada
        CODE = keyboard.nextInt();
        QNT = keyboard.nextInt();
        
        keyboard.close();
        
       // Processamento e saída
       switch (CODE) {
           case 1:
               TOTAL = QNT * 4;
               System.out.println(format.format(TOTAL));
               break;
           case 2:
               TOTAL = QNT * 4.5f;
               System.out.println(format.format(TOTAL));
               break;
           case 3:
               TOTAL = QNT * 5;
               System.out.println(format.format(TOTAL));
               break;
           case 4:
               TOTAL = QNT * 2;
               System.out.println(format.format(TOTAL));
               break;
           case 5:
               TOTAL = QNT * 1.5f;
               System.out.println(format.format(TOTAL));
               break;
           default:
               break;
       }
    }
}
