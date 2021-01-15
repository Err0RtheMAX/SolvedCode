import java.io.IOException;
import java.util.Scanner;

public class BOJ6778 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int antenna = scan.nextInt();
        int eyes = scan.nextInt();

        if (antenna >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
            if (antenna <= 6 && eyes >= 2) {
                System.out.println("VladSaturnian");
                if (antenna <= 2 && eyes <= 3)
                    System.out.println("GraemeMercurian");
            } else
                System.out.println("");


        }

    }
}
