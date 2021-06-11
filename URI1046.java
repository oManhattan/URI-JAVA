import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        //Declarando variáveis
        Scanner entrada = new Scanner(System.in);
        int tempoFinal, tempoInicial, duracao;
        
        //Entrada
        tempoInicial = entrada.nextInt();
        tempoFinal = entrada.nextInt();
        
        //Processamento e saída
        if (tempoInicial >= tempoFinal) {
            duracao = 24 - Math.abs(tempoFinal - tempoInicial);
        } else {
            duracao = tempoFinal - tempoInicial;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        entrada.close();
    }
}
