import java.io.IOException;
import java.util.Scanner;

public class BOJ14924 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int d = scan.nextInt();

        System.out.println((t *(d/s)) /2);

    }
}
