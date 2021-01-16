import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class BOJ11948 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] science = new int[4];
        int total = 0;
        int[] map = new int[2];

        for(int i = 0; i < science.length; i++) {
            science[i] = scan.nextInt();
            total += science[i];
        }

        for(int i = 0; i < map.length; i++)
            map[i] = scan.nextInt();

        Arrays.sort(science);
        Arrays.sort(map);

        System.out.println(total - science[0] + map[map.length - 1]);
    }
}
