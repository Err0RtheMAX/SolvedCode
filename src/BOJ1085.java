import java.io.IOException;
import java.util.Scanner;

public class BOJ1085 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        int result1 = Math.min(w-x, h-y);
        int result2 = Math.min(x, y);

        System.out.println(Math.min(result1, result2));
    }
}
