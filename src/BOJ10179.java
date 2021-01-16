import java.io.IOException;
import java.util.Scanner;

public class BOJ10179 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        double[] array = new double[num];

        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextDouble();
            array[i] *= 0.8;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.printf("$%.2f\n", array[i]);
        }
    }
}
