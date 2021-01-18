import java.io.IOException;
import java.util.Scanner;

public class BOJ14623 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String a1 = scan.next();
        String a2 = scan.next();

        if(a1.indexOf("1") == 0 && a2.indexOf("1") == 0) {

            int b1 = Integer.parseInt(a1, 2);
            int b2 = Integer.parseInt(a2, 2);

            System.out.println(Integer.toBinaryString(b1 * b2));
        }
    }
}