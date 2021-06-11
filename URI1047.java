import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) {
        //Declarando variáveis
        Scanner entrada = new Scanner(System.in);
        int startH, endH, startMin, endMin, somaStart, somaEnd, dif, finalH, finalMin;
        
        //Entrada
        startH = entrada.nextInt();
        startMin = entrada.nextInt();
        endH = entrada.nextInt();
        endMin = entrada.nextInt();
        
        //Processamento
        somaStart = (60 * startH) + startMin;
        somaEnd = (60* endH) + endMin;
        dif = (somaEnd - somaStart) + 1440;
        
        finalH = dif / 60;
        finalMin = dif % 60;
        
        finalH = (finalH > 24) ? finalH - 24 : finalH;
        
        //Saîda
        
        if (finalH >= 24 && finalMin > 0) {
            finalH = finalH - 24;
            System.out.println("O JOGO DUROU " + finalH + " HORA(S) E " + finalMin + " MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + finalH + " HORA(S) E " + finalMin + " MINUTO(S)");
        }

        entrada.close();
    }
}
