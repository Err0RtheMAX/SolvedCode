import java.io.IOException;
import java.util.Scanner;

public class BOJ1333 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 노래갯수 2
        int l = scan.nextInt(); // 모든 노래 길이 5
        int d = scan.nextInt(); // d초마다 울리는 전화 7

        int timeTotal = (n * l) + (5 * (n-1)); //15
        int result = 0;
        int[] ring = new int[(timeTotal % d) + (timeTotal/d)]; // 0 - 14 ( 0-1, 7-8, 14-15)
        //6-10
        int[] rest = new int[n-1]; // 1 (5-10)

        for(int i = 0; i < ring.length; i++) // 3(0, 1, 2)
            ring[i] = d * i; // 0, 7, 14

        for(int i = 0; i < rest.length; i++)
            rest[i] = 5 * (i+1);


        for(int j = 0; j <= timeTotal; j++) {
            for (int k = 0; k < ring.length; k++) {
                for (int m = 0; m < rest.length; m++) {
                    if ((ring[k] <= j && j <= ring[k] + 1) && (rest[m] <= j && j <= rest[m] + 5)) {
                        result = (j-1) / (n-1);
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
