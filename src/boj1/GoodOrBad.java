package boj1;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.IOException;


public class GoodOrBad { //BOJ 1712
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int num = -1;

        if (c <= b)
            System.out.println(-1);

        else
            System.out.println((a/ (c-b))+1);

    }
}
