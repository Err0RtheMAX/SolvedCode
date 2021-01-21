import java.io.IOException;
import java.util.Scanner;

class BOJ14632 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);

        a1 *= b1;

        String c = Integer.toBinaryString(a1);

        System.out.println(c);
    }
}