public class URI1098 {
    public static void main(String[] args) {
        double i = 0, j = 1;

        while (i <= 2) {
            System.out.printf("I=%.1f J=%.1f\n", i, j);
            System.out.printf("I=%.1f J=%.1f\n", i, j + 1);
            System.out.printf("I=%.1f J=%.1f\n", i, j + 2);

            j = j + 0.2;
            i = i + 0.2;
        }
    }
}
