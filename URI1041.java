import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {
        //Declarando variáveis
        Scanner input = new Scanner(System.in);
        double X, Y;
        
        //Entrada
        X = input.nextDouble();
        Y = input.nextDouble();
     
        input.close();
        
        //Processamento e saída
        if (X == 0 && Y == 0) {
            System.out.println("Origem");
        } else if (X == 0 && Y == Y) {
            System.out.println("Eixo Y");
        } else if (X == X && Y == 0) {
            System.out.println("Eixo X");
        } else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        }
    }
}
