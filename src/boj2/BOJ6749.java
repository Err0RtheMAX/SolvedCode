package boj2;

import java.util.Scanner;
import java.io.IOException;

public class BOJ6749 {
    public static void man(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(b + (b - a));
    }
}