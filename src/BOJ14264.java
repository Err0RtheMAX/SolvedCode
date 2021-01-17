import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class BOJ14264 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double L = scan.nextDouble();

        System.out.printf("%.9f", (Math.sqrt(3) * Math.pow(L, 2)) / 4);
    }
}
