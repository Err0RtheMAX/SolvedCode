package boj1;

import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class LongCaculate {
    public static void main(String[] args) throws IOException{

        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
