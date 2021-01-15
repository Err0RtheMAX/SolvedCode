import java.io.IOException;
import java.util.Scanner;

class Soccer{
    int result = 1;

    public int divideSoccer(int number){
        if(number < 4)
            result = 0;

        else {
            for(int i = number - 1; i > number - 4; i--) {
                result *= i;
            }

            result /= (3*2*1);
        }


        return result;
    }

}

public class BOJ6768 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();

        Soccer soccer = new Soccer();

        System.out.println(soccer.divideSoccer(j));


    }
}
