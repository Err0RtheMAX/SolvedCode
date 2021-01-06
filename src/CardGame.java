package boj1;

import java.util.Scanner;
import java.io.IOException;

public class CardGame { // BOJ 5522
    public static void main(String[] args) throws  IOException{
    Scanner scan = new Scanner(System.in);

    int[] num = new int[5];
    int sum = 0;

    for(int i = 0; i < num.length; i++){
        num[i] = scan.nextInt();
        sum += num[i];
    }
        System.out.println(sum);
    }
}
