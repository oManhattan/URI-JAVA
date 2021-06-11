import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        //Delcarando variáveis
        Scanner teclado = new Scanner(System.in);
        int TIME, YEAR, MONTH, DAY;
        
        //Entrada
        TIME = teclado.nextInt();
        
        teclado.close();
        
        //Processamento
        
        YEAR = TIME / 365;
        
        MONTH = (TIME % 365) / 30;
        
        DAY = (TIME % 365) % 30;
        
        //Saída
        
        System.out.println(YEAR + " ano(s)");
        System.out.println(MONTH + " mes(es)");
        System.out.println(DAY + " dia(s)");

        teclado.close();
    }
}
