import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class BOJ6749 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(b + Math.abs(b - a));
    }
}
