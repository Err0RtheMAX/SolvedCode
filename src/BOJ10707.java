import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class BOJ10707 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] input = new int[5];

        for(int i = 0; i < input.length; i++)
            input[i] = scan.nextInt();

        int result1 = input[0] * input[4];
        int result2 = 0;

        if(input[2] >= input[4])
            result2 = input[1];

        else
            result2 = input[1] + input[3] * (input[4] - input[2]);

        System.out.println(Math.min(result1, result2));

    }
}
