package boj1;

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class TvScale { // BOJ 1297
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int inch = scan.nextInt();
        int height = scan.nextInt();
        int wide = scan.nextInt();
        double c = Math.sqrt(Math.pow(inch, 2) / (Math.pow(wide, 2) + Math.pow(height, 2)));

        System.out.println((int)(height * c)+ " " + (int)(wide * c));
    }
}
