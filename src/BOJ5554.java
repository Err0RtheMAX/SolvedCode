package boj1;

import java.io.*;
import java.util.Scanner;

public class BOJ5554 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] second = new int[4];
        int sum = 0;

        for (int i = 0; i < second.length; i++) {
            second[i] = scan.nextInt();
            sum += second[i];
        }

        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
