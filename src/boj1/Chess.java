package boj1;

import java.util.Scanner;
import java.io.IOException;

public class Chess { // BOJ 3003
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int[] chess = new int[6];
        int num = 0;

        for(int i = 0; i < chess.length; i++){
            chess[i] = scan.nextInt();

            switch (i) {
                case 0:

                case 1:
                    num = 1;
                    chess[i] = num - chess[i];
                    break;

                case 2:

                case 3:

                case 4:
                    num = 2;
                    chess[i] = num - chess[i];
                    break;

                default:
                    num = 8;
                    chess[i] = num - chess[i];
                    break;

            }
        }
        for(int i = 0; i < chess.length; i++){
            System.out.println(chess[i]);
        }
    }
}
