import java.io.IOException;
import java.util.Scanner;

public class BOJ5893 {
    public static void main(String[] args) throws IOException, NumberFormatException {
       Scanner scan = new Scanner(System.in);
       String num = scan.next();

       int num1 = Integer.parseInt(num, 2);
       num1 *= 17;
       String num2 = Integer.toBinaryString(num1);
       System.out.println(num2);

    }
}