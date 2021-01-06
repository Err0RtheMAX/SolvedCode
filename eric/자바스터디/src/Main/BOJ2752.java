import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

public class BOJ2752 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];

        for(int i = 0; i < array.length; i++)
            array[i] = scan.nextInt();

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }
}