import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        double[] num = new double[6];
        int contagem = 0;
        
        for (int i = 0; i < 6; ++i) {
            num[i] = entrada.nextDouble();
            contagem = (num[i] >= 0) ? contagem + 1 : contagem;
        }
        
        System.out.println(contagem + " valores positivos");
        entrada.close();
    }
}
