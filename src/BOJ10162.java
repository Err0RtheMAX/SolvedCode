import java.io.IOException;
import java.util.Scanner;

public class BOJ10162 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int time = scan.nextInt();

        int a = 300;
        int b = 60;
        int c = 10;
        int[] count = new int[3];

        while(time >= c) {
            if (time >= a) {
                time -= a;
                ++count[0];
            }

            else if (time >= b) {
                time -= b;
                ++count[1];
            }

            else if (time >= c){
                time -= c;
                ++count[2];
            }

        }
            System.out.println(time == 0 ? count[0] + " " + count[1] + " " + count[2] : -1);
    }
}
