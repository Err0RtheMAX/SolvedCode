import java.io.IOException;
import java.util.Scanner;
public class BOJ10101 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] angle = new int[3];
        int total = 0;

        for(int i = 0; i < angle.length; i++) {
            angle[i] = scan.nextInt();
            total += angle[i];
        }

        if(total == 180) {
            if(angle[0] == angle[1] && angle[1] == angle[2])
                System.out.println("Equilateral");

            else if(angle[0] != angle[1] && angle[1] != angle[2] && angle[0] != angle[2])
                System.out.println("Scalene");

            else
                System.out.println("Isosceles");
        }

        else
            System.out.println("Error");
    }
}
