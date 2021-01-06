import java.io.IOException;
import java.util.Scanner;

public class BOJ3004 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if (a % 2 == 0) { // 짝수
            System.out.println((a / 2 + 1)*(a / 2 + 1));
        }

        else {
            System.out.println(((a + 1) / 2 ) * ((a + 1) / 2 + 1));
        }
    }
}
