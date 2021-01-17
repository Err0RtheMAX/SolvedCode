import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class BOJ14470 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        if(a < 0 && b > 0)
            System.out.println(Math.abs(a*c) + Math.abs(b*e) + Math.abs(d));

        else if(a > 0 && b > 0)
            System.out.println((b-a) * e);
    }
}
