import java.io.IOException;
import java.util.Scanner;

public class BOJ10768 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int month = 2;
        int day = 18;
        String msg = "Special";

        int[] date = new int[2];

        date[0] = scan.nextInt();
        date[1] = scan.nextInt();

        if (date[0] < 1 || date[0] > 12)
            return;

        else if(date[0] == 4 || date[0] == 6 || date[0] == 9 || date[0] == 11) {
            if(date[1] > 30 || date[1] < 1)
                return;
        }


        else if(date[0] == 2) {
            if(date[1] > 28 || date[1] < 1)
                return;
        }

        else if(date[0] == 1 || date[0] == 3 || date[0] == 5 || date[0] == 7 || date[0] == 8 || date[0] == 10 || date[0] == 12){
            if(date[1] > 31 || date[1] < 1)
                return;
        }


        if(month < date[0] || (month == date[0] && day < date[1]))
            msg = "After";

        else if(month > date[0] || (month == date[0] && day > date[1]))
            msg = "Before";


        System.out.println(msg);

    }
}
