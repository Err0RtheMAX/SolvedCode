package boj1;

import java.util.Scanner;
import java.lang.Math;
import java.io.IOException;
import java.math.BigInteger;

public class Safari { // BOJ 2420
    public static void main(String[] args) throws IOException{
       Scanner scan = new Scanner(System.in);

        BigInteger n = scan.nextBigInteger();
        BigInteger m = scan.nextBigInteger();



        System.out.println((n.subtract(m)));


    }
}
