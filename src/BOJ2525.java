import java.io.IOException;
import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int min = scan.nextInt();
        int add = scan.nextInt();

        if (min + add > 59){
            hour += (min + add) / 60;
            min = (min + add) % 60;
        }

        else
            min += add;

        if (hour > 23)
            hour = hour % 24;

        System.out.println(hour + " " + min);

    }
}