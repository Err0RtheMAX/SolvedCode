package boj1;

import java.io.*;
import java.util.Scanner;

public class HexCode{
    public static void main(String[] args) throws IOException{

        Scanner scan = new Scanner(System.in);

        String n = scan.next();

        System.out.println(Integer.parseInt(n, 16));
    }
}