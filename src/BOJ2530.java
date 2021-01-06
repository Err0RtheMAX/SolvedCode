import java.io.IOException;
import java.util.Scanner;

public class BOJ2530 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int min = scan.nextInt();
        int sec = scan.nextInt();
        int add = scan.nextInt();

        if (sec + add > 59){
            min += (sec + add) / 60;
            sec = (sec + add) % 60;

            if (min > 59) {
                hour += min / 60;
                min = min % 60;
            }

            if(hour > 23)
                hour = hour % 24;
        }

        else
            sec += add;

        System.out.println(hour + " " + min + " " + sec);

    }
}
