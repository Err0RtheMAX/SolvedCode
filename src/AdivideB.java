package boj1;

import java.io.IOException;
import java.util.Scanner;

public class AdivideB { // BOJ 1008
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.printf("%.11f", a/b);
    }
}
