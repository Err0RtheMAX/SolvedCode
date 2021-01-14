import java.io.IOException;
import java.util.Scanner;

public class BOJ6763 {
    public static void main(String[] args) throws IOException {
       Scanner scan = new Scanner(System.in);
       int speedLimit = scan.nextInt();
       int yourSpeed = scan.nextInt();
       int fine = 0;

       if(yourSpeed - speedLimit >= 31)
           fine = 500;

       else if(yourSpeed - speedLimit >= 21 && yourSpeed - speedLimit <= 30)
           fine = 270;

       else if(yourSpeed - speedLimit >= 1 && yourSpeed - speedLimit <= 20)
           fine = 100;

       if (fine == 0)
           System.out.printf("Congratulations, you are within the speed limit!");

       else if (fine != 0)
           System.out.printf("You are speeding and your fine is $" + fine + ".");


    }
}
