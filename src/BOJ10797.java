import java.io.IOException;
import java.util.Scanner;

public class BOJ10797 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[5];
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();

            if(array[i] == num)
                count++;
        }

        System.out.println(count);
    }
}
