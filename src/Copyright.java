package boj1;

import java.util.Scanner;
import java.io.IOException;

public class Copyright { // BOJ 2914
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int song = scan.nextInt();
        int avg = scan.nextInt();

        System.out.println(song * (avg-1) + 1);
    }
}
