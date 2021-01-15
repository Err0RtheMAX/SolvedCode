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

        while(time > 0) {
            if (time > 300 && time % a != 0) {
                time -= a;
                ++count[0];
                //continue;
            }

            else if (time > 60 && time < 300 && time % b != 0) {
                time -= b;
                ++count[1];
                continue;
            }

            else if (time > 10 && time < 60 && time % c != 0){
                time -= c;
                ++count[2];
                //continue;
            }


        }


        for(int i = 0; i < count.length; i++)
            System.out.println(count[i]);
    }
}
