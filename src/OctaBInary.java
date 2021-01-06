package boj1;

import java.util.Scanner;
import java.io.*;


public class OctaBInary { // BOJ 1212
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        int num2 = Integer.parseInt(num, 8); //8진수를 10진수로 전환
        String num3 = Integer.toString(num2);
        System.out.println(Integer.parseInt(num3, 2));
    }
}