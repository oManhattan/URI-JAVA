import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        //Declarando variáveis
    Scanner teclado = new Scanner(System.in);
    int TEMPO, HORA, MIN, SEC;
    
    //Entrada
    TEMPO = teclado.nextInt();
    
    teclado.close();
    
    //Processamento
    
    if (TEMPO >= 3600) {
        HORA = (TEMPO /3600) ;
        
        MIN = (TEMPO % 3600) / 60;
        
        SEC = ((TEMPO % 3600) % 60);
        
        System.out.println(HORA+":"+MIN+":"+SEC);
        
    }else if (TEMPO >= 60) {
        
        HORA = 0;
        
        MIN = TEMPO / 60;
        
        SEC = TEMPO % 60;
        
        System.out.println(HORA+":"+MIN+":"+SEC);
        
    }else {
        
        HORA = 0;
        
        MIN = 0;
        
        SEC = TEMPO;
        
        System.out.println(HORA+":"+MIN+":"+SEC);
        
    }
    teclado.close();
    }
}
