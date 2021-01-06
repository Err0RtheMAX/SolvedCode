import java.io.IOException;
import java.util.Scanner;


public class BOJ4299 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int AplusB = scan.nextInt();
        int AminusB = scan.nextInt();
        int A = (AplusB + AminusB) / 2;
        int B = AplusB - (AplusB + AminusB) / 2;

            if ((AplusB + AminusB) % 2 != 0 || A < 0 || B < 0 || AplusB < 0)
                System.out.println(-1);


            else if (A > B)
                System.out.println(A+ " " +B);

            else if (A <= B)
                System.out.println(B+ " "+ A);


    }
}
