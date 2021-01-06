package boj1;

import java.io.*;
import java.util.Scanner;

public class CompareNum { //BOF 1330
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a < b)
            System.out.println("<");

        else if (a == b)
            System.out.println("==");

        else
            System.out.println(">");

    }
}
