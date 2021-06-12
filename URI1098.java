public class URI1098 {
    public static void main(String[] args) {
        double i = 0, j = 1;

        for (int x = 0; x <= 10; x++) {
            
            if (x % 5 == 0) {
                

                System.out.printf("I=%.0f J=%.0f\n", i, j);
                System.out.printf("I=%.0f J=%.0f\n", i, j + 1);
                System.out.printf("I=%.0f J=%.0f\n", i, j + 2);
            } else if (i % 1 != 0) {
                System.out.printf("I=%.1f J=%.1f\n", i, j);
                System.out.printf("I=%.1f J=%.1f\n", i, j + 1);
                System.out.printf("I=%.1f J=%.1f\n", i, j + 2);
            }

            i = i + 0.2;
            j = j + 0.2;
        }
    }
}
