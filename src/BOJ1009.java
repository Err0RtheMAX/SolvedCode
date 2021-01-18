import java.util.Scanner;
import java.io.IOException;

public class BOJ1009 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int[] array = new int[t];

        for(int i = 0; i < t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            array[i] = (int) Math.pow(a, b) % 10;

            if (array[i] == 0)
                array[i] = 10;
        }

        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

}
